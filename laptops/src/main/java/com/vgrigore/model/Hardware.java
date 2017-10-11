package com.vgrigore.model;

import com.vgrigore.model.hardware.*;

public class Hardware {

    private Display display;

    private Keyboard keyboard;

    private Processor processor;

    private RAM ram;

    private HardDrive hardDrive;

    private VideoAdapter videoAdapter;

    private OptDrive optDrive;

    private Interfaces interfaces;

    private Communication communication;




    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public VideoAdapter getVideoAdapter() {
        return videoAdapter;
    }

    public OptDrive getOptDrive() {
        return optDrive;
    }

    public Interfaces getInterfaces() {
        return interfaces;
    }

    public Communication getCommunication() {
        return communication;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
