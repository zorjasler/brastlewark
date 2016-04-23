package com.example.jasler.brastlewark.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Jasler on 22/04/2016.
 */
public class BrastlewarkerModel implements Parcelable {

    private int id;
    private String name;
    private String thumbnail;
    private int age;
    private int weight;
    private int height;
    private String hair_color;
    private List<String> professions;
    private List<String> friends;

    /**
     * No args constructor for use in serialization
     */
    public BrastlewarkerModel() {
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
    public BrastlewarkerModel(int id, String name, String thumbnail, int age, int weight,
                                 int height, String hair_color, List<String> professions, List<String> friends) {
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

    protected BrastlewarkerModel(Parcel in) {
        id = in.readInt();
        name = in.readString();
        thumbnail = in.readString();
        age = in.readInt();
        weight = in.readInt();
        height = in.readInt();
        hair_color = in.readString();
        professions = in.createStringArrayList();
        friends = in.createStringArrayList();
    }

    public static final Parcelable.Creator<Object> CREATOR = new Parcelable.Creator<Object>() {
        @Override
        public BrastlewarkerModel createFromParcel(Parcel in) {
            return new BrastlewarkerModel(in);
        }

        @Override
        public BrastlewarkerModel[] newArray(int size) {
            return new BrastlewarkerModel[size];
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
        dest.writeInt(weight);
        dest.writeInt(height);
        dest.writeString(hair_color);
        dest.writeStringList(professions);
        dest.writeStringList(friends);
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
    public int getAge() {
        return age;
    }

    /**
     * @param age The age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return The weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight The weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return The height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return The hairColor
     */
    public String getHairColor() {
        return hair_color;
    }

    /**
     * @param hair_color The hair color
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
    public List<String> getFriends() {
        return friends;
    }

    /**
     * @param friends The friends
     */
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
