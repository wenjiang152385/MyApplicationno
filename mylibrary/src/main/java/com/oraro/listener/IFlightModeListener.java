package com.oraro.listener;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 获取飞行模式的回调
 */
public interface IFlightModeListener {
    /**
     * 获取飞行模式的回调
     参数:
     mode - 飞行模式
     另请参阅:
     FlightModeConstants
     * @param i
     */
    void flightModelistener(int i);
    void resultCodelistener(String s, String s1);

}
