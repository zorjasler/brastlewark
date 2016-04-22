package com.example.jasler.brastlewark.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasler on 17/04/2016.
 */
public class Brastlewarker implements Parcelable {

    private Integer id;
    private String name;
    private String thumbnail;
    private Integer age;
    private Double weight;
    private Double height;
    private String hair_color;
    private List<String> professions = new ArrayList<String>();
    private List<Object> friends = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     */
    public Brastlewarker() {
    }

    /**
     * @param id
     * @param friends
     * @param height
     * @param weight
     * @param thumbnail
     * @param age
     * @param name
     * @param hair_color
     * @param professions
     */
    public Brastlewarker(Integer id, String name, String thumbnail, Integer age, Double weight,
                         Double height, String hair_color, List<String> professions, List<Object> friends) {
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

    protected Brastlewarker(Parcel in) {
        id = in.readInt();
        name = in.readString();
        thumbnail = in.readString();
        age = in.readInt();
        weight = in.readDouble();
        height = in.readDouble();
        hair_color = in.readString();
        professions = in.createStringArrayList();
        in.readList(friends, null);
    }

    public static final Creator<Object> CREATOR = new Creator<Object>() {
        @Override
        public Brastlewarker createFromParcel(Parcel in) {
            return new Brastlewarker(in);
        }

        @Override
        public Brastlewarker[] newArray(int size) {
            return new Brastlewarker[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(thumbnail);
        dest.writeInt(age);
        dest.writeDouble(weight);
        dest.writeDouble(height);
        dest.writeString(hair_color);
        dest.writeStringList(professions);
        dest.writeList(friends);
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age The age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return The weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight The weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return The height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return The hairColor
     */
    public String getHairColor() {
        return hair_color;
    }

    /**
     * @param hair_color The hair_color
     */
    public void setHairColor(String hair_color) {
        this.hair_color = hair_color;
    }

    /**
     * @return The professions
     */
    public List<String> getProfessions() {
        return professions;
    }

    /**
     * @param professions The professions
     */
    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    /**
     * @return The friends
     */
    public List<Object> getFriends() {
        return friends;
    }

    /**
     * @param friends The friends
     */
    public void setFriends(List<Object> friends) {
        this.friends = friends;
    }
}