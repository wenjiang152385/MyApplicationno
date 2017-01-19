package com.oraro.listener;

import com.ceewa.callback.ICallBack;
import com.ceewa.entity.msg.CeewaEvent;
import com.ceewa.listener.IClientListener;
import com.ceewa.msgqueue.ICeewaEventRepo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *客户端接口定义
 * @author
 */
public interface IProtocolListener {
    /**
     *获取当前客户端名称
     * @return
     */
    String getProtocolClientName();

    /**
     *建立链接
     * @return
     */
    int connect();

    /**
     *关闭链接
     * @return
     */
    int closeConnect();

    /**
     *注册监听客户端状态
     * @param iClientListener
     */
    void  registClientListener(IClientListener iClientListener);

    /**
     *当前客户端是否链接
     * @return
     */
    boolean isConnect();

    /**
     *异步发送
     * @param var1
     * @param var2
     */
    void asynSendMsg(CeewaEvent var1, ICallBack<CeewaEvent> var2);

    /**
     *获得消息仓库
     * @return
     */
    ICeewaEventRepo getMessageRepo();

    /**
     *即时发送消息
     * @param var1
     */
    void sendMsg(CeewaEvent var1);

}
