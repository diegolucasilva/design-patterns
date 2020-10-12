package com.dls.behavioral.chain_of_responsability.example2;
/*


https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java

The user enters the amount to be dispensed and the machine dispense amount in terms of defined currency bills
 such as 50$, 20$, 10$ etc. This example the ATMDispenseChain will look for the right handler
 */
public class Main {

    public static void main(String[] args) {
        int amount = 150;
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.dispenseMoney(amount);
    }
}