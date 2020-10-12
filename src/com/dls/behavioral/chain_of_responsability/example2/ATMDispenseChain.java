package com.dls.behavioral.chain_of_responsability.example2;

import com.dls.behavioral.chain_of_responsability.example2.dispenser.DispenseChain;
import com.dls.behavioral.chain_of_responsability.example2.dispenser.Dollar10Dispenser;
import com.dls.behavioral.chain_of_responsability.example2.dispenser.Dollar20Dispenser;
import com.dls.behavioral.chain_of_responsability.example2.dispenser.Dollar50Dispenser;

public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
        // initialize the chain
        c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void dispenseMoney(int amount){
        c1.dispense(new Currency(amount));
    }
}
