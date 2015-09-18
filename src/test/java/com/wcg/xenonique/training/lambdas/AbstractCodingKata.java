package com.wcg.xenonique.training.lambdas;

/**
 * Created by ppilgrim on 18-Sep-2015.
 */
public abstract class AbstractCodingKata {
    public void doSomething(String anyString) {
        System.out.printf("KATA: doSomething() -> %s\n", anyString);
    }

    public void complete() {
        throw new RuntimeException("You must complete this part");
    }
}
