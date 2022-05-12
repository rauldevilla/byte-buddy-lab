package com.example.bytebuddylab.app;

public class BusinessProcess1 {

    public void doProcess(AbstractBusinessClass businessClass) {
        BusinessInfo info = new BusinessInfo();
        info = businessClass.BPStart(info);
        info = businessClass.BPprocess(info);
        info = businessClass.BPend(info);
    }

}
