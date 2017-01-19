package com.oraro.listener;

import com.ceewa.entity.model.HomeInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * **
 * 获取HOME点信息回调
 *
 */
public interface IHomeInfoListener {
    /**
     * 获取HOME点信息的回调
     参数:
     homeInfo - HOME点信息
     另请参阅:
     HomeInfo
     * @param homeInfo
     */
    void homeInfolistener(HomeInfo homeInfo);
    void resultCodelistener(String s, String s1);
}
