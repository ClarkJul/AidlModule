package com.clark.other;

import com.clark.ipc.annotation.ServiceId;
@ServiceId("LocationManager")
public interface ILocationManager {

     Location getLocation();
}

