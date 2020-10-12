package com.dls.behavioral.chain_of_responsability.example2.dispenser;

import com.dls.behavioral.chain_of_responsability.example2.Currency;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}