package com.wcg.xenonique.training.lambdas;

import java.util.function.BinaryOperator;

/**
 * Created by ppilgrim on 18-Sep-2015.
 */
public class LambdaArithmeticCalculator {

    private final BinaryOperator<Double> adder;
    private final BinaryOperator<Double> multipler;

    public LambdaArithmeticCalculator(final BinaryOperator<Double> adder, final BinaryOperator<Double> multipler) {
        this.adder = adder;
        this.multipler = multipler;
    }

    public double add(double a, double b ) {
        return adder.apply(a,b).doubleValue();
    }

    public double subtract(double a, double b ) {
        return adder.apply(a,-b).doubleValue();
    }

    public double multiply(double a, double b ) {
        return multipler.apply(a,b).doubleValue();
    }

    public double divide(double a, double b ) {
        return multipler.apply(a,1.0/b).doubleValue();
    }
}
