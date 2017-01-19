package com.oraro.listener;

import com.ceewa.entity.model.DfxInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 获取飞机的DFX信息的回调
 */
public interface IDfxInfoListener {
    /**
     * 获取无人机DFX相关信息的回调
     * @param dfxInfo
     */
    void getDfxInfolistener(DfxInfo dfxInfo);
    void resultCodelistener(String s,String s1);
}
