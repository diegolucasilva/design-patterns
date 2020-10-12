package com.dls.behavioral.chain_of_responsability.example1;
/*
Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either
to process the request or to pass it to the next handler in the chain

EX:
java.util.logging.Logger#log()

EX:
This example shows how a request containing user data passes a sequential chain of handlers
 that perform various things such as authentification, authorization, and validation.

Most of the pattern examples are built on the ****NOTION OF LOOKING FOR THE RIGHT HANDLER*****,
 launching it and exiting the chain after that. But here we execute every handler until there’s one
 that can’t handle a request. Be aware that this still is the Chain of Responsibility pattern,
 even though the flow is a bit different.
 */

import com.dls.behavioral.chain_of_responsability.example1.middleware.Middleware;
import com.dls.behavioral.chain_of_responsability.example1.middleware.RoleCheckMiddleware;
import com.dls.behavioral.chain_of_responsability.example1.middleware.ThrottlingMiddleware;
import com.dls.behavioral.chain_of_responsability.example1.middleware.UserExistsMiddleware;
import com.dls.behavioral.chain_of_responsability.example1.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}