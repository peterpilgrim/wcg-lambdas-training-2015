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

package com.wcg.xenonique.training.lambdas.domain;

import java.util.*;

/**
 * The type MemoryDatabase
 *
 * @author Peter Pilgrim
 */
public class MemoryDatabase {

    private List<LineItem> lineItems1 = Arrays.asList(
            new LineItem(2002, "Iron widgets 10", 139.99),
            new LineItem(2004, "Fire protector", 179.99),
            new LineItem(2006, "Steel brace", 379.99),
            new LineItem(2008, "Connected bolts", 49.99),
            new LineItem(2010, "Flexible core pipes", 149.99));

    private List<LineItem> lineItems2 = Arrays.asList(
            new LineItem(3000, "A/C electric switch with ground box", 19.99),
            new LineItem(3002, "Regulated fuse box", 59.99),
            new LineItem(3004, "100m A/C 13 amp house wiring set", 69.99),
            new LineItem(3008, "60W halogen 12 light bulbs box set", 29.99),
            new LineItem(3010, "Electrical heating pump", 229.99));

    private List<Order> orders = Arrays.asList(
      new Order(5000, new Date() ), new Order(5002, new Date() ));

    private List<Customer> customers = Arrays.asList( new Customer(4000, "Sarah Jane Smith") );

    public MemoryDatabase() {
        lineItems1.forEach(item -> {
            orders.get(0).addItem(item);
        });

        lineItems2.forEach( item -> {
            orders.get(1).addItem(item);
        });

        customers.stream().forEach( customer -> {
            orders.stream().forEach( order -> {
                customer.addOrder(order);
            });
        });
    }

    public List<Customer> findAllCustomer() {
        return customers;
    }

    public List<Weather> findAllWeather() {
        return Arrays.asList(
                new Weather(100, "Milton Keynes", "Buckinghamshire", 4.5, 18.25 ),
                new Weather(102, "London", "London", 5.75, 22.5 ),
                new Weather(104, "Guildford", "Surrey", 3.0, 21.5),
                new Weather(106, "St. Ives", "Cornwall", 5.5, 19.0 ),
                new Weather(108, "Glasgow", "Lanarkshire", 1.5, 14.5 ),
                new Weather(110, "Liverpool", "Merseyside", 3.25, 17.5),
                new Weather(112, "Swansea", "Glamorgan", 3.0, 13.75),
                new Weather(114, "Leatherhead", "Surrey", 2.5, 20.5),
                new Weather(116, "Belfast", "Country Atrim", 2.5, 12.5)
        );
    }

}
