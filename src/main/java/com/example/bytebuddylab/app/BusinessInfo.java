package com.example.bytebuddylab.app;

import java.util.HashMap;
import java.util.Map;

public class BusinessInfo {

    private Map<String, Object> data;

    public BusinessInfo() {
        this(new HashMap<>());
    }

    public BusinessInfo(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
