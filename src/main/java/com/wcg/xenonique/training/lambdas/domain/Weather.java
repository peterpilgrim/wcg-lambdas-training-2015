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
 * The type Weather
 *
 * @author Peter Pilgrim
 */
public class Weather {
    private int id;
    private String city;
    private String county;
    private double low;
    private double high;

    public Weather() {
    }

    public Weather(int id, String city, String county, double low, double high) {
        this.id = id;
        this.city = city;
        this.county = county;
        this.low = low;
        this.high = high;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;

        Weather weather = (Weather) o;

        return id == weather.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("id=").append(id);
        sb.append(", city='").append(city).append('\'');
        sb.append(", county='").append(county).append('\'');
        sb.append(", low=").append(low);
        sb.append(", high=").append(high);
        sb.append('}');
        return sb.toString();
    }
}
