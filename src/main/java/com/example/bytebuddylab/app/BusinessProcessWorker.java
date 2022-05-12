package com.example.bytebuddylab.app;

public class BusinessProcessWorker {
    private static int COUNT = 0;

    private static AbstractBusinessClass getBusinessClass() {
        AbstractBusinessClass businessClass = (COUNT % 2 == 0 ? new BusinessClass1() : new BusinessClass2());
        COUNT++;
        return businessClass;
    }

    public void start() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                BusinessProcess1 process = new BusinessProcess1();
                while (true) {
                    process.doProcess(getBusinessClass());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });
        thread.start();
    }

}
