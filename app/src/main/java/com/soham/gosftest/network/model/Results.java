package com.soham.gosftest.network.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Results {

    @Expose
    private List<Collection1> collection1 = new ArrayList<Collection1>();
    @Expose
    private List<Collection2> collection2 = new ArrayList<Collection2>();

    /**
     *
     * @return
     * The collection1
     */
    public List<Collection1> getCollection1() {
        return collection1;
    }

    /**
     *
     * @param collection1
     * The collection1
     */
    public void setCollection1(List<Collection1> collection1) {
        this.collection1 = collection1;
    }

    /**
     *
     * @return
     * The collection2
     */
    public List<Collection2> getCollection2() {
        return collection2;
    }

    /**
     *
     * @param collection2
     * The collection2
     */
    public void setCollection2(List<Collection2> collection2) {
        this.collection2 = collection2;
    }

}