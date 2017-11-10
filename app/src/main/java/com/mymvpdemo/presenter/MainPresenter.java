package com.mymvpdemo.presenter;

import android.content.Context;
import android.widget.Toast;

import com.mymvpdemo.database.DBHelper;
import com.mymvpdemo.model.BaseResponse;
import com.mymvpdemo.model.ContactResponseModel;
import com.mymvpdemo.netcom.ApiController;
import com.mymvpdemo.netcom.ResponeListner;
import com.mymvpdemo.view.MainView;

import java.util.List;

/**
 * Created by gajanandchouhan on 22/4/17.
 */

public class MainPresenter {

    private final MainView mainView;
    private final Context mContext;

    public MainPresenter(MainView mainView, Context mContext) {
        this.mainView = mainView;
        this.mContext = mContext;
    }

    public void getUserList() {
        mainView.showProgress();
    /*    Observable<BaseResponse> contact = MyMvpDemo.getApiInterface().getContact();
        contact.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new DefaultObserver<BaseResponse>() {
            @Override
            public void onNext(BaseResponse value) {
                DBHelper.getInstance(mContext).insertContacts(value.getContacts());
                List<ContactResponseModel> contactList = DBHelper.getInstance(mContext).getContactList();
                mainView.setUserList(contactList);
                mainView.hideProgress();
            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_LONG);
            }

            @Override
            public void onComplete() {
                Toast.makeText(mContext, "Completed", Toast.LENGTH_LONG).show();
            }
        });*/


        new ApiController(mContext, (byte) 1, new ResponeListner() {
            @Override
            public void onResponseSuccess(Object response, byte reqType) {
                BaseResponse response1 = (BaseResponse) response;
                DBHelper.getInstance(mContext).insertContacts(response1.getContacts());
                List<ContactResponseModel> contactList = DBHelper.getInstance(mContext).getContactList();
                mainView.setUserList(contactList);
                mainView.hideProgress();
            }

            @Override
            public void onError(String message) {
                mainView.hideProgress();
                Toast.makeText(mContext, message, Toast.LENGTH_LONG);
            }
        });
    }

}
