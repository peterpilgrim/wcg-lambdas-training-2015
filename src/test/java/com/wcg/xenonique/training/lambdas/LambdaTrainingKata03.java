package com.wcg.xenonique.training.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata03 extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }


    @Test
    public void learn_filters_and_predicates() {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice");

        complete();

        // STUDENT: ---> Now ... access the stream and work with each elements from the stream

    }

}
