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

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata02Test extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    public static final double EPSILON = 0.0001;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }


    @Test
    public void learn_about_getting_streams_from_java_list_collection() {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice");

        // STUDENT: ---> Now ... access the stream and work with each elements from the stream
        incomplete();
        // HINT
        //        people.stream().forEach( element -> {
        //            System.out.printf("   element = %s\n", element);
        //        });

    }

    @Test
    public void learn_about_getting_streams_from_java_set_collection() {
        final Set<String> people = new HashSet<>(Arrays.asList("Janet", "Paul", "Alice"));

        // STUDENT: ---> Now ... access the stream and work with each element from the stream
        incomplete();
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

        // STUDENT: ---> Now ... access stream and work with each elements from the stream
        incomplete();
        // HINT: Why is this Lamdba function different?
        // HINT HINT: Think about the data structure that you dealing with
    }

    @Test
    public void learn_about_working_with_integer_streams() {

        final IntStream integerStream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 21, 34);

        // STUDENT: ---> Now ... access stream and work with the elements from the stream
        incomplete();

    }

    @Test
    public void learn_about_working_with_integer_ranges() {

        final IntStream openRange = IntStream.range(1, 10);
        final IntStream closedRange = IntStream.rangeClosed(1, 10);

        // STUDENT: ---> Now ... access the streams and work with the elements from the streams
        incomplete();

        // BONUS: Try going backwards (reverse ranges). Does it work!
    }

    @Test
    public void learn_about_working_with_double_streams() {

        final DoubleStream numberStream = DoubleStream.of(1.1, 2.2, 3.14159, 6.7512 );

        // STUDENT: ---> Now ... access stream and work with the elements from the stream
        incomplete();

    }

    @Test
    public void learn_about_lazy_evaluation_01 () {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice", "Mike", "John");

        // STUDENT: ---> Just remove the above line to make it pass.
        incomplete();

        // QUESTION: What is the output that you expect to see?
        people.stream().filter(n -> {
            System.out.printf("**** DEBUG STREAM **** n=%s\n", n);
            return n.startsWith("J");
        });
    }

    @Test
    public void learn_about_lazy_evaluation_02 () {
        final List<String> people = Arrays.asList("Janet", "Paul", "Alice", "Jim", "Orithina");

        // STUDENT: ---> Just remove the above line to make it pass.
        incomplete();

        // QUESTION: What is the output that you expect to see?
        people.stream()
                .filter(e -> {
                    System.out.printf("**** DEBUG STREAM **** e=%s\n", e);
                    return e.toLowerCase().startsWith("j");
                })
                .forEach(e -> System.out.printf("Matching e=%s\n", e) );
    }

    @Test
    public void learn_about_reducing_a_double_stream_to_a_scala_value() {
        final DoubleStream prices = DoubleStream.of( 12.59, 4.99, 3.29, 23.50, 19.99);

        // STUDENT: ---> Now ... access stream and work with the elements from the stream
        incomplete();


        // HINT: Uncomment this line
        // System.out.printf("prices.sum() = %6.2f\n", prices.sum() );
        // But why does this following line line crash at run time?
        // System.out.printf("prices.count() = %6.2f\n", prices.count() );
    }

    @Test
    public void learn_about_reducing_double_stream_to_get_basic_statistics() {
        final DoubleStream prices = DoubleStream.of( 12.59, 4.99, 3.29, 23.50, 19.99);

        final DoubleSummaryStatistics summaryStatistics = prices.summaryStatistics();

        // STUDENT: ---make the tests pass.
        incomplete();

        // HINT: >inspect the summary statistics object and
        // System.out.printf("summaryStatistics=%s\n", summaryStatistics);
        assertThat(summaryStatistics.getCount(), is(5L));
        //        assertThat(summaryStatistics.getAverage(), is(closeTo(64.36, EPSILON)));
        //        assertThat(summaryStatistics.getMin(), is(closeTo(3.29, EPSILON)));
        //        assertThat(summaryStatistics.getSum(), is(closeTo(12.8720, EPSILON)));
        //        assertThat(summaryStatistics.getMax(), is(closeTo(23.5, EPSILON)));
    }

    @Test
    public void learn_about_reducing_integer_stream_to_get_basic_statistics()
    {
        final IntStream ages = IntStream.of(23, 16, 73, 29, 64, 31, 55, 88, 47, 18, 33, 39, 32, 59 );
        final IntSummaryStatistics summaryStatistics = ages.summaryStatistics();

        // STUDENT: ---make the tests pass.
        incomplete();
        // HINT: >inspect the summary statistics object and
        //         System.out.printf("summaryStatistics=%s\n", summaryStatistics);
        //        assertThat(summaryStatistics.getCount(), is(14L));
        //        assertThat(summaryStatistics.getAverage(), is(closeTo(12.3456789, EPSILON)));
        //        assertThat(summaryStatistics.getMin(), is(123));
        //        assertThat(summaryStatistics.getSum(), is(123L));
        //        assertThat(summaryStatistics.getMax(), is(123));

    }
}
