package com.soham.gosftest.network.model;

import com.google.gson.annotations.Expose;

public class Collection2 {

    @Expose
    private From from;

    /**
     *
     * @return
     * The from
     */
    public From getFrom() {
        return from;
    }

    /**
     *
     * @param from
     * The from
     */
    public void setFrom(From from) {
        this.from = from;
    }

}