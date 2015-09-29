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

import com.wcg.xenonique.training.lambdas.domain.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class LambdaTrainingKata03Test extends AbstractCodingKata {

    private WorkerTaskLibraryEngine workerEngine;

    @Before
    public void setup() {
        workerEngine = new WorkerTaskLibraryEngine();
    }


    @Test
    public void learn_about_filters_and_predicates_01() {
        final List<String> people = Arrays.asList("Janet", "Paula", "Alice", "Peter", "Tom", "Bob", "Anne", "Frank", "Linda", "Karen");

        // STUDENT: ---> Now ... access the stream and work with each elements from the stream
        incomplete();
        // HINT: Examine the Predicate<T> interface
        // IntStream.range(0,10).filter( x -> x % 2 == 0 ).forEach( x -> println(x));

        final Set<String> result = people.stream()
                .collect(Collectors.toSet());

        assertThat(result, is(new HashSet<String>(Arrays.asList("Alice", "Anne"))));
    }


    @Test
    public void learn_about_filters_and_predicates_02() {
        final List<Weather> weatherReports = new MemoryDatabase().findAllWeather();

        final Set<Weather> reports = new HashSet<>();

        // STUDENT: ---> // Filter the weather reports by county of "Surrey"
        incomplete();

        assertThat(reports.size(), is(2));
    }


    @Test
    public void learn_about_filters_and_predicates_03() {
        final List<Weather> weatherReports = new MemoryDatabase().findAllWeather();

        final Set<Weather> reports = new HashSet<>();
        // STUDENT: ---> // Filter the weather reports by that have highs greater or over 19.0 celsius degree.
        incomplete();

        assertThat(reports.size(), is(4));
    }


    @Test
    public void learn_about_filters_and_predicates_04() {
        final List<Weather> weatherReports = new MemoryDatabase().findAllWeather();

        final Set<Weather> reports = new HashSet<>();

        // STUDENT: ---> // Filter the weather reports by that have highs greater or over 19.0 celsius degree AND also City start with the letter "L"
        incomplete();

        assertThat(reports.size(), is(2));
    }

    @Test
    public void learn_about_mapping_to_a_double_stream_01() {
        final List<Weather> weatherReports = new MemoryDatabase().findAllWeather();

        final List<Double> highs = new ArrayList<>();

        // STUDENT: ---> // Map the weather reports to a Double Stream taking only the "High Temperatures"
        incomplete();

        // HINT: On java.util.function.DoubleStream there is a special method called "boxed()"
        assertThat(highs.size(), is(9));
    }

    @Test
    public void learn_about_mapping_to_a_double_stream_02() {
        final List<Weather> weatherReports = new MemoryDatabase().findAllWeather();

        final List<Double> highs = new ArrayList<>();

        // STUDENT: ---> // Filter the weather reports by that have highs greater or over 19.0 and map them to High temperatures
        incomplete();

        // HINT: On java.util.function.DoubleStream there is a special method called "boxed()"
        // HINT: You should get an list collection of:
        //          highs=[22.5, 21.5, 19.0, 20.5]
        assertThat(highs.size(), is(4));
    }

    @Test
    public void learn_about_streaming_complexing_objects_01() {
        final List<Customer> customers = new MemoryDatabase().findAllCustomer();
        final long numberOfCustomers = -1;

        // STUDENT: ---> // Use the Stream API and find many customers are in the database?
        incomplete();

        // HINT: customers.stream().count()

        assertThat(numberOfCustomers, is(1L));

    }

    @Test
    public void learn_about_streaming_complexing_objects_02() {
        final Customer customer = new MemoryDatabase().findAllCustomer().get(0);
        final long numberOfOrders = -99;

        // STUDENT: ---> // Use the Stream API and find out how many orders does this customer have?
        incomplete();

        assertThat(numberOfOrders, is(2L));
    }

    @Test
    public void learn_about_streaming_complexing_objects_03() {
        final List<Customer> customers = new MemoryDatabase().findAllCustomer();


        // Study this example - the
        final List<Order> orders = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toList());

        assertThat(orders.size(), is(2));

        final List<LineItem> items = new ArrayList<>();

        // STUDENT: ---> // Use the Stream API and to find all of the line items.
        incomplete();

        // HINT: Study the API for the Stream.flatMap() - The flatMap() method returns a java.util.stream.Stream!
        assertThat(items.size(), is(10));
    }

    @Test
    public void learn_about_streaming_complexing_objects_04() {
        final Customer customer = new MemoryDatabase().findAllCustomer().get(0);

        // HINT: Study the API for the Stream.flatMap() - The flatMap() method returns a java.util.stream.Stream!
        final List<LineItem> items = new ArrayList<>();

        // STUDENT: ---> // Use the Stream API and to find all of the line items where the cost is greater than or equals to £200.0
        incomplete();

        assertThat(items.size(), is(2));
    }

    @Test
    public void learn_about_streaming_complexing_objects_05() {
        final Customer customer = new MemoryDatabase().findAllCustomer().get(0);

        // HINT: Study the API for the Stream.flatMap() - The flatMap() method returns a java.util.stream.Stream!
        final List<LineItem> items = new ArrayList<>();


        final double price = -96.31;

        // STUDENT: ---> // Use the Stream API and to find all of the line items where the cost is greater than or equals to £200.0 and compute the total.
        incomplete();

//        assertThat( price == 549.98, is(true));
//        assertThat( price == 629.98, is(true));
//        assertThat( price == 809.98, is(true));
//        assertThat( price == 749.98, is(true));
//        assertThat( price == 719.98, is(true));
//        assertThat( price == 609.98, is(true));
    }

}