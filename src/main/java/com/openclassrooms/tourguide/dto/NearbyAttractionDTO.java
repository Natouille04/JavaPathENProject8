package com.openclassrooms.tourguide.dto;

public class NearbyAttractionDTO {
    private String attractionName;

    private double attractionLat;
    private double attractionLong;

    private double userLat;
    private double userLong;

    private double distance;
    private int rewardPoint;

    public NearbyAttractionDTO(String attractionName, double latitude, double longitude, double latitude1, double longitude1, double distance, int rewardPoints) {
    }
}
