package com.example.nare.adelle;

/**
 * Created by Nare on 15.03.2017.
 */

public class Itemclass {
    private int img;
    private String model;
    private String info;
    private String gin;

    public Itemclass(int img, String model, String info, String gin) {
        this.img = img;
        this.model = model;
        this.info = info;
        this.gin = gin;
    }

    public int getImg() {
        return img;
    }

    public String getModel() {
        return model;
    }

    public String getInfo() {
        return info;
    }

    public String getGin() {
        return gin;
    }
}
