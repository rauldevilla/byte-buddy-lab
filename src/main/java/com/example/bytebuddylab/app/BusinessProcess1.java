package com.example.bytebuddylab.app;

import java.util.concurrent.ConcurrentNavigableMap;

public class BusinessProcess1 {

    private static int COUNT = 0;


    public void doProcess(AbstractBusinessClass businessClass) throws BusinessProcessException {
        BusinessInfo info = new BusinessInfo();
        info = businessClass.BPStart(info);
        info = businessClass.BPprocess(info);
        info = businessClass.BPend(info);

        System.out.println("****************** COUNT:" + COUNT);
        if (COUNT == 2) {
            COUNT = 0;
            throw new BusinessProcessException("Blah blah blah");
        }

        COUNT++;

    }

}
