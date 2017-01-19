package com.oraro.listener;

import com.ceewa.entity.model.ModuleInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 获取模块信息回调
 */
public interface IModuleInfoListener {
    /**
     * 跟随模块信息的回调
     参数:
     info - 模块信息
     另请参阅:
     ModuleInfo
     * @param moduleInfo
     */
    void moduleInfolistener(ModuleInfo moduleInfo);
    void resultCodelistener(String s, String s1);
}
