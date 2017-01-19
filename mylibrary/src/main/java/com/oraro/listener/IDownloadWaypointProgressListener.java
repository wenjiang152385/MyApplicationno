package com.oraro.listener;

import com.ceewa.entity.model.WayPointParameter;
import com.ceewa.entity.model.WaypointProgress;

/**
 * Created by Administrator on 2016/12/12 0012.
 *下载航点信息的进度回调
 * @author
 */
public interface IDownloadWaypointProgressListener {
    /**
     *下载航点信息的进度回调
     参数:
     progress - 下载进度
     waypoint - 航点信息
     另请参阅:
     WaypointProgress, WayPointParameter
     * @param progress
     * @param waypoint
     */
    void downloadWaypointProgresslistener(WaypointProgress progress, WayPointParameter waypoint);

    /**
     *下载航点信息Task的回调
     参数:
     * @param waypoint
     */
    void downloadWaypointTasklistener(WayPointParameter waypoint);
}
