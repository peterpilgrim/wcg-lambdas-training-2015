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
