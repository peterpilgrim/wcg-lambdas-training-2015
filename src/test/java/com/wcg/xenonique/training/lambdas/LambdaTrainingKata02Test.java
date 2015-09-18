package com.wcg.xenonique.training.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata02Test extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }


    @Test
    public void learn_about_getting_streams_from_java_list_collection() {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice");

        complete();

        // STUDENT: ---> Now ... access the stream and work with each elements from the stream
        // HINT
        //        people.stream().forEach( element -> {
        //            System.out.printf("   element = %s\n", element);
        //        });

    }

    @Test
    public void learn_about_getting_streams_from_java_set_collection() {
        final Set<String> people = new HashSet<>(Arrays.asList("Janet", "Paul", "Alice"));

        complete();

        // STUDENT: ---> Now ... access the stream and work with each element from the stream
    }

    @Test
    public void learn_about_getting_streams_from_java_map_collection() {
        final Map<String, Integer> peopleAndAges = new HashMap<String, Integer>() {{
            put("Caroline", 24);
            put("Colin", 43);
            put("Henry", 48);
            put("Ingrid", 29);
            put("Jackie", 35);
            put("Oscar", 36);
            put("Stephen", 36);
        }};

        complete();

        // STUDENT: ---> Now ... access stream and work with each elements from the stream
        // HINT: Why is this Lamdba function different?
        // HINT HINT: Think about the data structure that you dealing with
    }

    @Test
    public void learn_about_working_with_integer_streams() {

        IntStream integerStream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 21, 34);

        complete();

        // STUDENT: ---> Now ... access stream and work with the elements from the stream
    }

    @Test
    public void learn_about_working_with_integer_ranges() {

        IntStream openRange = IntStream.range(1, 10);
        IntStream closedRange = IntStream.rangeClosed(1, 10);

        complete();

        // STUDENT: ---> Now ... access the streams and work with the elements from the streams

        // BONUS: Try going backwards (reverse ranges). Does it work!
    }

    @Test
    public void learn_about_working_with_double_streams() {

        DoubleStream numberStream = DoubleStream.of(1.1, 2.2, 3.14159, 6.75);

        complete();

        // STUDENT: ---> Now ... access stream and work with the elements from the stream
    }

}
