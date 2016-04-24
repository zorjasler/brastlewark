package com.example.jasler.brastlewark.repository.response;

import java.util.List;

/**
 * Created by Jasler on 17/04/2016.
 */
public class BrastlewarkerResponse {

    private int id;
    private String name;
    private String thumbnail;
    private int age;
    private double weight;
    private double height;
    private String hair_color;
    private List<String> professions;
    private List<Object> friends;

    /**
     * No args constructor for use in serialization
     */
    public BrastlewarkerResponse() {
    }

    /**
     * @param id The id
     * @param friends The friends
     * @param height The height
     * @param weight The weight
     * @param thumbnail The thumbnail
     * @param age The age
     * @param name The name
     * @param hair_color The hair color
     * @param professions The professions
     */
    public BrastlewarkerResponse(int id, String name, String thumbnail, int age, double weight,
                                 double height, String hair_color, List<String> professions, List<Object> friends) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hair_color = hair_color;
        this.professions = professions;
        this.friends = friends;
    }

    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @return The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @return The age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return The weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return The height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return The hairColor
     */
    public String getHairColor() {
        return hair_color;
    }

    /**
     * @return The professions
     */
    public List<String> getProfessions() {
        return professions;
    }

    /**
     * @return The friends
     */
    public List<Object> getFriends() {
        return friends;
    }
}