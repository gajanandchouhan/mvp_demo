package com.mymvpdemo.view;

import com.mymvpdemo.model.ContactResponseModel;

import java.util.List;

/**
 * Created by gajanandchouhan on 22/4/17.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setUserList(List<ContactResponseModel> userList);
}
