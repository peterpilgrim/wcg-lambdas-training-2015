/*******************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014,2015 by Peter Pilgrim, Milton Keynes, P.E.A.T UK LTD
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPL v3.0
 * which accompanies this distribution, and is available at:
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Developers:
 * Peter Pilgrim -- design, development and implementation
 *               -- Blog: http://www.xenonique.co.uk/blog/
 *               -- Twitter: @peter_pilgrim
 *
 * Contributors:
 *
 *******************************************************************************/

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
