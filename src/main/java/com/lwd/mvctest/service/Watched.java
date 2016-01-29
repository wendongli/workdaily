package com.lwd.mvctest.service;

import org.apache.commons.lang.StringUtils;

import java.util.Observable;

/**
 * Created by wendong.lwd on 2016/1/28.
 */
public class Watched extends Observable {

    private String data = "POP";


    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!StringUtils.equals(this.data,data)) {
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
