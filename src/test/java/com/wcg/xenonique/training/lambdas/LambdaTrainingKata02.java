package com.wcg.xenonique.training.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata02 extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }


    @Test
    public void learn_about_getting_streams_from_java_collection() {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice");

        // people.stream().forEach( .... )

        complete();

        // STUDENT: ---> Now ... Invoke these lambdas
    }


}
