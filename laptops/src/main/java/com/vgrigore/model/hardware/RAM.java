package com.vgrigore.model.hardware;

import java.io.Serializable;

public class RAM implements Serializable{

    private static final long serialVersionUID = 5636654684368265850L;

    private RamType type;

    private int volume;

    private int maxVolume;

    private int frequency;


    public RamType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getFrequency() {
        return frequency;
    }
}
