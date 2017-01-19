package com.oraro.listener;

import com.ceewa.entity.model.TrackFollowWaypointParameter;
import com.ceewa.entity.model.WaypointProgress;

/**
 * Created by Administrator on 2016/12/12 0012.
 *
 * @author
 */
public  interface ITrackWaypointProgressListener {
    /**
     * 上传绘线跟随航点信息进度的回调
     参数:
     progress - 上传进度
     waypoint - 绘线跟随的航点信息
     另请参阅:
     WaypointProgress, TrackFollowWaypointParameter
     * @param progress
     * @param waypoint
     */
    void trackWaypointProgresslistener(WaypointProgress progress, TrackFollowWaypointParameter waypoint);
}
