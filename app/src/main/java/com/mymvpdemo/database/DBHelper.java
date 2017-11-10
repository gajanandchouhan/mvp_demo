package com.mymvpdemo.database;

import android.content.Context;

import com.mymvpdemo.model.ContactResponseModel;
import com.mymvpdemo.model.ContactResponseModelDao;
import com.mymvpdemo.model.DaoMaster;
import com.mymvpdemo.model.DaoSession;
import com.mymvpdemo.model.TestModel;

import org.greenrobot.greendao.database.Database;

import java.util.List;

/**
 * Created by gajanandchouhan on 25/5/17.
 */

public class DBHelper {
    private static DBHelper instance;
    private static DaoSession daoSession;

    public DBHelper(Context mContext) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(mContext, "notes-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DBHelper getInstance(Context mContext) {
        if (instance == null) {
            instance = new DBHelper(mContext.getApplicationContext());
        }
        return instance;
    }

    public void insertContacts(List<ContactResponseModel> contactResponseModels) {
        daoSession.getContactResponseModelDao().deleteAll();
        int count = 0;
        for (ContactResponseModel contactResponseModel : contactResponseModels) {
            String mobile = "243545455" + count;
            contactResponseModel.getPhoneData().setMobile(mobile);
            long insertId = daoSession.getPhoneModelDao().insert(contactResponseModel.getPhoneData());
            count++;
            contactResponseModel.setPhone_id(insertId);
            daoSession.getContactResponseModelDao().insert(contactResponseModel);
        }

    }


    public List<ContactResponseModel> getContactList() {
        return daoSession.getContactResponseModelDao().loadAll();
    }


}
