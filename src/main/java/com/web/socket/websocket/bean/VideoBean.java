package com.web.socket.websocket.bean;

import java.util.Map;

public class VideoBean {

    private String name;
    private Map signalData;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getSignalData() {
        return signalData;
    }

    public void setSignalData(Map signalData) {
        this.signalData = signalData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
