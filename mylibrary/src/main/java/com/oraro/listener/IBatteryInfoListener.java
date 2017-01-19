package com.oraro.listener;

import com.ceewa.entity.model.BatteryInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 获取电池信息回调
 */
public interface IBatteryInfoListener {
    /**
     * 电池信息的回调
     * @param batteryInfo
     */
    void batteryInfolistener(BatteryInfo batteryInfo);

    /**
     *
     * @param s
     * @param s1
     */
    void resultCodelistener(String s, String s1);
}
