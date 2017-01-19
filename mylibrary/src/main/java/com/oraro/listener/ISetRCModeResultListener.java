package com.oraro.listener;

/**
 * Created by Administrator on 2016/12/12 0012.
 *设置摇杆模式的结果的回调
 * @author
 */
public interface ISetRCModeResultListener {
    /**
     * 设置摇杆模式的结果的回调
     参数:
     flag - 标识当前连接的设备是否为遥控器
     mode - 摇杆模式
     另请参阅:
     RCModeConstant
     * @param flag
     * @param mode
     */
    void setRCModeResultlistener(boolean flag, byte mode);
}
