package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class History {
    @SerializedName("success")
    String success;
    @SerializedName("data")
    List<HistoryData> data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<HistoryData> getData() {
        return data;
    }

    public void setData(List<HistoryData> data) {
        this.data = data;
    }
}
