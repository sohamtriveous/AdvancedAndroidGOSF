package com.soham.gosftest.network.model;

import com.google.gson.annotations.Expose;

public class Image {

    @Expose
    private String alt;
    @Expose
    private String src;
    @Expose
    private String href;
    @Expose
    private String text;

    /**
     *
     * @return
     * The alt
     */
    public String getAlt() {
        return alt;
    }

    /**
     *
     * @param alt
     * The alt
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }

    /**
     *
     * @return
     * The src
     */
    public String getSrc() {
        return src;
    }

    /**
     *
     * @param src
     * The src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

}