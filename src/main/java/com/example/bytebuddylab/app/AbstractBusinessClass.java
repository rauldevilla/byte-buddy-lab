package com.example.bytebuddylab.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractBusinessClass {

    static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

    protected void showMessage(String from, String message) {
        System.out.println("[" + format.format(new Date()) + " - " + from + "] :: " + message);
    }

    protected String getKey(String header, boolean timed) {
        return header + " -> " + getClass().getName() + (timed ? " -> " + System.currentTimeMillis() : "");
    }

    protected String getKey(String header) {
        return getKey(header, false);
    }

    public abstract BusinessInfo BPStart(BusinessInfo info);
    public abstract BusinessInfo BPprocess(BusinessInfo info);
    public abstract BusinessInfo BPend(BusinessInfo info);

}
