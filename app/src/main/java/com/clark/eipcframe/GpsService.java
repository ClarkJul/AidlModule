package com.clark.eipcframe;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.clark.eipcframe.location.Location;
import com.clark.eipcframe.location.LocationManager;
import com.clark.ipc.IPC;


import androidx.annotation.Nullable;

/**
 * @author Clark
 * 2020/10/11 19:54
 */
public class GpsService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //定位
        LocationManager.getDefault().setLocation(new Location("岳麓区天之道", 1.1d, 2.2d));

        /**
         * 在数据/服务提供方进行服务注册
         */
        IPC.regiester(LocationManager.class);
    }
}
