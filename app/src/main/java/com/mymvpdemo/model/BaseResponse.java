package com.mymvpdemo.model;

import java.util.List;

/**
 * Created by gajanandchouhan on 11/5/17.
 */

public class BaseResponse {
    private List<ContactResponseModel> contacts;

    public List<ContactResponseModel> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactResponseModel> contacts) {
        this.contacts = contacts;
    }
}
