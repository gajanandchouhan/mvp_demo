package com.mymvpdemo.model;

import android.util.Log;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by gajanandchouhan on 11/5/17.
 */
@Entity
public class  PhoneModel {
    @Id(autoincrement = true)
    private Long id;
    private String mobile;
    private String home;
    private String office;

    @Generated(hash = 746172065)
    public PhoneModel(Long id, String mobile, String home, String office) {
        this.id = id;
        this.mobile = mobile;
        this.home = home;
        this.office = office;
    }

    @Generated(hash = 2003199864)
    public PhoneModel() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
