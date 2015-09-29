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

import java.util.function.Function;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class WorkerTaskLibraryEngine {

    public void submitWorkItem( final Runnable runnable ) {

        System.out.printf("*BEFORE* %s.submitWorkItem(...)\n", getClass().getSimpleName());

        runnable.run();

        System.out.printf("*AFTER*  %s.submitWorkItem(...)\n", getClass().getSimpleName());
    }

}
