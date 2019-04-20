package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Player {
    @SerializedName("success")
    String success;
    @SerializedName("data")
    List<PlayerData> data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<PlayerData> getData() {
        return data;
    }

    public void setData(List<PlayerData> data) {
        this.data = data;
    }
}
