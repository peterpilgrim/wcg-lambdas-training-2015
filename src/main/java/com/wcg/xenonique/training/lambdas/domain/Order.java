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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Order
 *
 * @author Peter Pilgrim
 */
public class Order {
    private int id;
    private Date orderDate;
    private Customer customer;
    private List<LineItem> lineItems = new ArrayList<>();


    public Order() {
    }

    public Order(int id, Date orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void addItem( LineItem item ) {
        if ( item.getOrder() != null ) {
            item.getOrder().removeItem(item);
        }
        lineItems.add(item);
        item.setOrder(this);
    }

    public void removeItem( LineItem item ) {
        if ( lineItems.remove(item) ) {
            item.setOrder(null);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        return id == order.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", customer=").append(customer!=null?customer.getName():"null");
        sb.append(", orderDate=").append(orderDate);
        sb.append(", lineItems=").append(lineItems);
        sb.append('}');
        return sb.toString();
    }
}
