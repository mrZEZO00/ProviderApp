package com.example.providerapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CreateOffer {
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private CreateOfferData data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateOfferData getData() {
        return data;
    }

    public void setData(CreateOfferData data) {
        this.data = data;
    }
}
