package com.lwd.mvctest.test;

import com.lwd.mvctest.service.Watched;
import com.lwd.mvctest.service.Watcher;
import org.junit.Test;

/**
 * Created by wendong.lwd on 2016/1/28.
 */
public class ObserverTest extends BaseTest{
    @Test
    public void mainTest() {
        Watched observered = new Watched();
        Watcher observer = new Watcher(observered);

        observered.setData("START");
        observered.setData("TEST");
        observered.setData("STOP");
    }
}
