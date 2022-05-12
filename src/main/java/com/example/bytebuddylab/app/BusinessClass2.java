package com.example.bytebuddylab.app;

import java.util.Date;
import java.util.Random;
import java.util.stream.Collectors;

public class BusinessClass2 extends AbstractBusinessClass {

    private void waitALittle() {
        final Random rnd = new Random();
        final long napTime = rnd.nextInt(5) * 1000;
        try {
            Thread.sleep(napTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String buildBusinessClass1Message(BusinessInfo info) {
        if (info.getData().size() == 0) {
            return "\nEmpty BusinessInfo";
        }
        String message = info.getData().entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
        return "\n" + message;
    }

    @Override
    public BusinessInfo BPStart(BusinessInfo info) {
        waitALittle();
        final String methodName = "start";
        info.getData().put(getKey(methodName, true), new Date());
        showMessage(getKey(methodName), buildBusinessClass1Message(info));
        return info;
    }

    @Override
    public BusinessInfo BPprocess(BusinessInfo info) {
        waitALittle();
        final String methodName = "process";
        info.getData().put(getKey(methodName, true), new Date());
        showMessage(getKey(methodName), buildBusinessClass1Message(info));
        return info;
    }

    @Override
    public BusinessInfo BPend(BusinessInfo info) {
        waitALittle();
        final String methodName = "end";
        info.getData().put(getKey(methodName, true), new Date());
        showMessage(getKey(methodName), buildBusinessClass1Message(info));
        return info;
    }
}
