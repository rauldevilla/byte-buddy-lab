package com.example.bytebuddylab.app.test;

import com.example.bytebuddylab.app.BusinessClass1;
import com.example.bytebuddylab.app.BusinessProcess1;
import org.junit.jupiter.api.Test;

public class TestBusinessClass1 {

    @Test
    public void testInvokeProcess() throws Exception {
        BusinessProcess1 process1 = new BusinessProcess1();
        process1.doProcess(new BusinessClass1());
    }

}
