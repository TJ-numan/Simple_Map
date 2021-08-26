package com.tjnuman.mipmap.Retrofit;

import com.google.gson.annotations.SerializedName;

public class PostModel {
    private String city;
    private String  ip;
    private String continent_code;
    private String continent_name;
    private String region_code;
    private String region_name;
    private String zip;
    private String country_code;
    private String country_name;
    private float latitude;
    private float longitude;

    public PostModel(String ip, String continent_code, String continent_name, String region_code, String region_name, String zip, float latitude, float longitude) {
        this.ip = ip;
        this.continent_code = continent_code;
        this.continent_name = continent_name;
        this.region_code = region_code;
        this.region_name = region_name;
        this.zip = zip;
        this.city = city;
        this.country_code = country_code;
        this.country_name = country_name;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
