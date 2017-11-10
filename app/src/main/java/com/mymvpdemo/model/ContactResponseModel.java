package com.mymvpdemo.model;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by gajanandchouhan on 11/5/17.
 */
@Entity
public class ContactResponseModel {
    @Id
    private String id;
    private String name;
    private String email;
    private String adress;
    private String gender;
    private Long phone_id;
    @ToOne(joinProperty = "phone_id")
    private PhoneModel phoneModel;
    @SerializedName("phone")
    @Transient
    private PhoneModel phoneData;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1977795255)
    private transient ContactResponseModelDao myDao;


    @Generated(hash = 1604404185)
    public ContactResponseModel(String id, String name, String email, String adress,
            String gender, Long phone_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.gender = gender;
        this.phone_id = phone_id;
    }

    @Generated(hash = 61201272)
    public ContactResponseModel() {
    }

    @Generated(hash = 2026139085)
    private transient Long phoneModel__resolvedKey;


    public Long getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(Long phone_id) {
        this.phone_id = phone_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PhoneModel getPhoneData() {
        return phoneData;
    }

    public void setPhoneData(PhoneModel phoneData) {
        this.phoneData = phoneData;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1571526252)
    public PhoneModel getPhoneModel() {
        Long __key = this.phone_id;
        if (phoneModel__resolvedKey == null
                || !phoneModel__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PhoneModelDao targetDao = daoSession.getPhoneModelDao();
            PhoneModel phoneModelNew = targetDao.load(__key);
            synchronized (this) {
                phoneModel = phoneModelNew;
                phoneModel__resolvedKey = __key;
            }
        }
        return phoneModel;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1969959139)
    public void setPhoneModel(PhoneModel phoneModel) {
        synchronized (this) {
            this.phoneModel = phoneModel;
            phone_id = phoneModel == null ? null : phoneModel.getId();
            phoneModel__resolvedKey = phone_id;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1742744046)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getContactResponseModelDao() : null;
    }
}
