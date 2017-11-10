package com.mymvpdemo.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;

import com.mymvpdemo.R;
import com.mymvpdemo.model.ContactResponseModel;
import com.mymvpdemo.presenter.MainPresenter;
import com.mymvpdemo.view.MainView;

import java.util.List;

public class MainActivity extends BaseActivity implements MainView {

    ProgressDialog progressDialog;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.texView);
        MainPresenter mainPresenter = new MainPresenter(this, this);
        mainPresenter.getUserList();
    }

    @Override
    public void showProgress() {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Loading...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
    }

    @Override
    public void hideProgress() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void setUserList(List<ContactResponseModel> userList) {
        for (ContactResponseModel o : userList) {
            textView.append(o.getName() + "\n" + o.getPhoneModel().getMobile());
        }

    }
}
