package com.soham.gosftest.network.model;

import com.google.gson.annotations.Expose;

public class GOSFData {

    @Expose
    private String name;
    @Expose
    private Integer count;
    @Expose
    private String frequency;
    @Expose
    private Integer version;
    @Expose
    private Boolean newdata;
    @Expose
    private String lastrunstatus;
    @Expose
    private String lastsuccess;
    @Expose
    private String thisversionstatus;
    @Expose
    private String nextrun;
    @Expose
    private Results results;

    public GOSFData(String name, Integer count, String frequency, Integer version, Boolean newdata, String lastrunstatus, String lastsuccess, String thisversionstatus, String nextrun, Results results) {
        this.name = name;
        this.count = count;
        this.frequency = frequency;
        this.version = version;
        this.newdata = newdata;
        this.lastrunstatus = lastrunstatus;
        this.lastsuccess = lastsuccess;
        this.thisversionstatus = thisversionstatus;
        this.nextrun = nextrun;
        this.results = results;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     *
     * @param frequency
     * The frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     *
     * @return
     * The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     *
     * @return
     * The newdata
     */
    public Boolean getNewdata() {
        return newdata;
    }

    /**
     *
     * @param newdata
     * The newdata
     */
    public void setNewdata(Boolean newdata) {
        this.newdata = newdata;
    }

    /**
     *
     * @return
     * The lastrunstatus
     */
    public String getLastrunstatus() {
        return lastrunstatus;
    }

    /**
     *
     * @param lastrunstatus
     * The lastrunstatus
     */
    public void setLastrunstatus(String lastrunstatus) {
        this.lastrunstatus = lastrunstatus;
    }

    /**
     *
     * @return
     * The lastsuccess
     */
    public String getLastsuccess() {
        return lastsuccess;
    }

    /**
     *
     * @param lastsuccess
     * The lastsuccess
     */
    public void setLastsuccess(String lastsuccess) {
        this.lastsuccess = lastsuccess;
    }

    /**
     *
     * @return
     * The thisversionstatus
     */
    public String getThisversionstatus() {
        return thisversionstatus;
    }

    /**
     *
     * @param thisversionstatus
     * The thisversionstatus
     */
    public void setThisversionstatus(String thisversionstatus) {
        this.thisversionstatus = thisversionstatus;
    }

    /**
     *
     * @return
     * The nextrun
     */
    public String getNextrun() {
        return nextrun;
    }

    /**
     *
     * @param nextrun
     * The nextrun
     */
    public void setNextrun(String nextrun) {
        this.nextrun = nextrun;
    }

    /**
     *
     * @return
     * The results
     */
    public Results getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(Results results) {
        this.results = results;
    }

}