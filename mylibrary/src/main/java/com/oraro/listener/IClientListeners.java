package com.oraro.listener;

import com.ceewa.listener.IClientListener;

/**
 * Created by Administrator on 2016/12/12 0012.
 *链路状态变化监听
 * @author
 */
public interface IClientListeners {
    void onConnectCallback(Object var1);

    void onDisConnectCallback(Object var1);
      //连接出错
    void onConnectErrorCallback(Object var1);
     //连接成功
    void onConnectSuccessCallback(Object var1);
}
