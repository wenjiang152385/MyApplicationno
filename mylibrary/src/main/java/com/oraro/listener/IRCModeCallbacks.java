package com.oraro.listener;

import com.ceewa.callback.IResultCodeCallback;

/**
 * Created by Administrator on 2016/12/12 0012.
 *摇杆模式的回调
 * @author
 */
public interface IRCModeCallbacks extends IResultCodeCallback {
    /**
     * 摇杆模式的回调
     参数:
     value - 摇杆模式
     另请参阅:
     RCModeConstant
     * @param var1
     */
    void rcModeCallback(byte var1);
}
