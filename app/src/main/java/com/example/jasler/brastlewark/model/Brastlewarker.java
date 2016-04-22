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

    private int id;
    private String name;
    private String thumbnail;
    private int age;
    private double weight;
    private double height;
    private String hair_color;
    private List<String> professions = new ArrayList<String>();
    private List<Object> friends = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     */
    public Brastlewarker() {
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
    public Brastlewarker(int id, String name, String thumbnail, int age, double weight,
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