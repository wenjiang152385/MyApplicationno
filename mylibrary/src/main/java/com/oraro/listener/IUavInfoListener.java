package com.oraro.listener;

import com.ceewa.entity.model.UAVInfo;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 获取主帧里的飞机的信息回调
 */
public interface IUavInfoListener {
    /**
     * 无人机信息的回调(主帧信息)
     参数:
     uavInfo - 主帧信息
     另请参阅:
     UAVInfo
     * @param uavInfo
     */
      void uavInfolistener(UAVInfo uavInfo);
      void resultCodelistener(String s, String s1);
}
