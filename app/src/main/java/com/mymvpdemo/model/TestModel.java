package com.mymvpdemo.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by gajanandchouhan on 15/6/17.
 */
@Entity
public class TestModel {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String contact;
    @Generated(hash = 759864175)
    public TestModel(Long id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    @Generated(hash = 1568142977)
    public TestModel() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return this.contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}
