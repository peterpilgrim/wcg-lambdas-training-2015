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

/**
 * The type LineItem
 *
 * @author Peter Pilgrim
 */
public class LineItem {
    private int id;
    private String product;
    private double cost;
    private Order order;

    public LineItem() {
    }

    public LineItem(int id, String product, double cost) {
        this.id = id;
        this.product = product;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineItem)) return false;

        LineItem lineItem = (LineItem) o;

        return id == lineItem.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LineItem{");
        sb.append("id=").append(id);
        sb.append(", product='").append(product).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
