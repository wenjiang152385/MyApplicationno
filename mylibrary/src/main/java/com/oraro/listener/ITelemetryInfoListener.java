package com.oraro.listener;

import com.ceewa.entity.model.BatteryInfo;
import com.ceewa.entity.model.DfxInfo;
import com.ceewa.entity.model.HomeInfo;
import com.ceewa.entity.model.IndustrialUavInfo;
import com.ceewa.entity.model.ModuleInfo;
import com.ceewa.entity.model.RockerInfo;
import com.ceewa.entity.model.UAVInfo;
import com.ceewa.entity.model.VersionInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 */
public interface ITelemetryInfoListener {
    /**
     *
     * @param batteryInfo
     */
    void batteryInfolistener(BatteryInfo batteryInfo);
    void getDfxInfolistener(DfxInfo dfxInfo);
    void flightModelistener(int i);
    void homeInfolistener(HomeInfo homeInfo);
    IndustrialUavInfo getIndustrialUavInfo(IndustrialUavInfo industrialUavInfo);
    void moduleInfolistener(ModuleInfo moduleInfo);
    void rockerInfolistener(RockerInfo rockerInfo);
    void uavInfolistener(UAVInfo uavInfo);
    void versionInfolistener(VersionInfo versionInfo);
    void resultCodelistener(String s, String s1);
}
