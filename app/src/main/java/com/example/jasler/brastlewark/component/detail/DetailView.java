package com.example.jasler.brastlewark.component.detail;

import java.util.List;

/**
 * Created by Jasler on 17/04/2016.
 */
public interface DetailView {

    void showProgress();

    void hideProgress();

    void showErrorMessage(int error_msg);

    void setThumbnail(String thumbnail);

    void setName(String name);

    void setAge(Integer age);

    void setWeight(Double weight);

    void setHeight(Double height);

    void setHairColor(String hairColor);

    void setProfessions(List<String> professions);

    void setFriends(List<Object> friends);
}
