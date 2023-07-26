package com.openclassrooms.realestatemanager.model;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.Date;


public class EstateModel {
    private String type;
    private int dollarPrice;
    private int surface;
    private int rooms;
    private String description;
    private ArrayList<Bitmap> pictures;//Ou URI interne
    private String address;
    private ArrayList<String> interestPoints;
    private String status;
    private Date startDate;
    private Date sellDate;
    private String agentName;

    public EstateModel(String type,
                       int dollarPrice,
                       int surface,
                       int rooms,
                       String description,
                       ArrayList<Bitmap> pictures,
                       String address,
                       ArrayList<String> interestPoints,
                       String status, Date startDate,
                       Date sellDate, String agentName) {
        this.type = type;
        this.dollarPrice = dollarPrice;
        this.surface = surface;
        this.rooms = rooms;
        this.description = description;
        this.pictures = pictures;
        this.address = address;
        this.interestPoints = interestPoints;
        this.status = status;
        this.startDate = startDate;
        this.sellDate = sellDate;
        this.agentName = agentName;
    }
}
