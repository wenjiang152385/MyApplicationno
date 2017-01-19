package com.oraro.listener;

import com.ceewa.entity.model.WayPointParameter;
import com.ceewa.entity.model.WaypointProgress;

/**
 * Created by Administrator on 2016/12/12 0012.
 *上传航点信息的进度的回调
 * @author
 */
public interface IUploadWaypointProgressListener {
    /**
     * 上传航点信息的进度的回调
     参数:
     progress - 上传进度
     waypoint - 航点信息
     另请参阅:
     WaypointProgress, WayPointParameter
     */
    void uploadWaypointProgresslistener(WaypointProgress progress, WayPointParameter waypoint);
}
