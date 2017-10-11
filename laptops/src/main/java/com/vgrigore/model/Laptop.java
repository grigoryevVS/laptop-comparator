package com.vgrigore.model;


import java.io.Serializable;

/**
 * Model object presents Laptop configuration
 */
public class Laptop implements Serializable{

    private static final String hueraga = "Hueraga";
    private static final long serialVersionUID = -7348818729815320083L;

    /** comments about design */
    private Design design;

    /** most valuable part. covers hardware metrics */
    private Hardware hardware;

    /** software installation from scratch. */
    private Software software;

    /** price and sale shops */
    private Commercial commercial;

    /** physical metrics */
    private PhysicalParameters physicalParameters;

    /** info about made by/com.vgrigore.model name */
    private GeneralInfo generalInfo;

    /** unique id of laptop */
    private Long id;


    public void setDesign(Design design) {
        this.design = design;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public void setPhysicalParameters(PhysicalParameters physicalParameters) {
        this.physicalParameters = physicalParameters;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public Software getSoftware() {
        return software;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public Design getDesign() {
        return design;
    }

    public PhysicalParameters getPhysicalParameters() {
        return physicalParameters;
    }
}
