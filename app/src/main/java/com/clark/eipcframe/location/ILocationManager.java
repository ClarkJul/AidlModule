package com.clark.eipcframe.location;

import com.clark.ipc.annotation.ServiceId;

@ServiceId("LocationManager")
public interface ILocationManager {
     Location getLocation();
}

