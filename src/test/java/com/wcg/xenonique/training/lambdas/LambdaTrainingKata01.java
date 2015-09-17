package com.wcg.xenonique.training.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata01 {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }

    @Test
    public void learn_about_anonymous_inner_classes() {

        complete();

        // Submit a work item to the engine.
        workerEngine.submitWorkItem(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is verbose way - before JDK 8");
            }
        });

    }

    @Test
    public void learn_about_define_lambdas() {

        // Submit a work item to the engine.
        complete();

        // here is the compact way
        workerEngine.submitWorkItem(() -> System.out.println("do it"));

        // Submit a work item to the engine.
        workerEngine.submitWorkItem( ()-> { System.out.println("do it alternative"); });

        workerEngine.submitWorkItem( ()-> {
            String message = "hello world";
            System.out.println("Message: "+message);
        });
    }

    @Test
    public void learn_about_passing_arguments_to_lambdas() {

        // Submit a task item to the engine.

//        workerEngine.submitTaskItem( (trainingContext ->  trainingContext.addMessage("White") ));
        complete();
    }



    @Test
    public void learn_about_no_argument_functions() {
        Function<Void,Integer> constantFunction = (Void v)-> 1;

        // get the function to print
        // System.out.printf("constantFunction = %d\n", .... )

        complete();
    }



    @Test
    public void learn_about_getting_streams_from_java_collection() {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice");

        // people.stream().forEach( .... )

        complete();
    }


    private void complete() {
        throw new RuntimeException("You must complete this part");
    }
}
