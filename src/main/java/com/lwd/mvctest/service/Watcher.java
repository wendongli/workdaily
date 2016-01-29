package com.lwd.mvctest.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wendong.lwd on 2016/1/28.
 */
public class Watcher implements Observer {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Watcher(Observable o) {
        o.addObserver(this);
    }

    public void update(Observable o, Object arg) {
//      System.out.println("observable's data is =" +((Watched)o).getData());
        logger.info("observable's data is =[{}]", ((Watched) o).getData());
        logger.info("李文东test");
    }
}
