package com.oraro.constants;

import com.ceewa.openconstant.CommandEvents;
import com.ceewa.openconstant.CommandResult;
import com.ceewa.openconstant.RCModeConstant;

/**
 * Created by Administrator on 2016/12/12 0012.
 *命令回传的种类
 * @author
 */
public class CommandEventsContants {
    public  CommandEventsContants(){}


    /**
     * 启动电机
     */
    public static final String COMMANDRESULT_MOTORRUN = "com.ceewa.constant.RESULT_MOTORRUN";
    /**
     * 起飞
     */
    public static final String COMMANDRESULT_TAKEOFF = "com.ceewa.constant.COMMANDRESULT_TAKEOFF";
    /**
     * 返航
     */
    public static final String COMMANDRESULT_GOHOME = "com.ceewa.constant.RESULT_GOHOME";
    /**
     * 降落
     */
    public static final String COMMANDRESULT_LANDING = "com.ceewa.constant.COMMANDRESULT_LANDING";
    /**
     * 悬停
     */
    public static final String COMMANDRESULT_STOP = "com.ceewa.constant.COMMANDRESULT_STOP";
    /**
     * 恢复飞行任务
     */
    public static final String COMMANDRESULT_RESETFLIGHT = "com.ceewa.constant.COMMANDRESULT_RESETFLIGHT";
    /**
     * 设置飞机当前位置为HOME点
     */
    public static final String COMMANDRESULT_SETHOMEPOINT_UAVPOSITION = "com.ceewa.constant.COMMANDRESULT_SETHOMEPOINT_UAVPOSITION";
    /**
     * 设置起飞点为HOME点
     */
    public static final String COMMANDRESULT_SETHOMEPOINT_TAKEOFF = "com.ceewa.constant.COMMANDRESULT_SETHOMEPOINT_TAKEOFF";
    /**
     * 设置模块位置为HOME点
     */
    public static final String COMMANDRESULT_SETHOMEPOINT_MODULEPOSITION = "com.ceewa.constant.COMMANDRESULT_SETHOMEPOINT_MODULEPOSITION";
    /**
     * 开始校准遥控器
     */
    public static final String COMMANDRESULT_STARTCALIBRC = "com.ceewa.constant.COMMANDRESULT_STARTCALIBRC";
    /**
     * 校准遥控器中立点
     */
    public static final String COMMANDRESULT_CALIBRCNEU = "com.ceewa.constant.COMMANDRESULT_CALIBRCNEU";
    /**
     * 停止校准遥控器
     */
    public static final String COMMANDRESULT_STOPCALIBRC = "com.ceewa.constant.COMMANDRESULT_STOPCALIBRC";
    /**
     * 校准飞机磁场
     */
    public static final String COMMANDRESULT_CALIBUAVMAG = "com.ceewa.constant.COMMANDRESULT_CALIBUAVMAG";
    /**
     * 校准飞机陀螺仪和加速度计
     */
    public static final String COMMANDRESULT_CALIBUAVSENSOR = "com.ceewa.constant.COMMANDRESULT_CALIBUAVSENSOR";
    /**
     * 校准跟随模块陀螺仪和加速度计
     */
    public static final String COMMANDRESULT_CALIBMODULESENSOR = "com.ceewa.constant.COMMANDRESULT_CALIBMODULESENSOR";
    /**
     * 校准跟随模块磁场
     */
    public static final String COMMANDRESULT_CALIBMODULEMAG = "com.ceewa.constant.COMMANDRESULT_CALIBMODULEMAG";
    /**
     *校准飞机和跟随模块的高度
     */
    public static final String COMMANDRESULT_CALIBBAROMETER = "com.ceewa.constant.COMMANDRESULT_CALIBBAROMETER";
    /**
     * 切换简单跟随模式的结果
     */
    public static final String COMMANDRESULT_SIMPLE = "com.ceewa.constant.COMMANDRESULT_SIMPLE";
    /**
     * 切换定点跟随模式的结果
     */
    public static final String COMMANDRESULT_HOVERANDAIM = "com.ceewa.constant.COMMANDRESULT_HOVERANDAIM";
    /**
     * 轨迹跟随航点类型
     */
    public static final String COMMANDRESULT_TYPE_AUTO = "com.ceewa.constant.COMMANDRESULT_TYPE_AUTO";
    /**
     * 环绕跟随航点类型
     */
    public static final String COMMANDRESULT_TYPE_CIRCLE = "com.ceewa.constant.COMMANDRESULT_TYPE_CIRCLE";
    /**
     * 绘线跟随航点类型
     */
    public static final String COMMANDRESULT_TYPE_TRACK = "com.ceewa.constant.COMMANDRESULT_TYPE_TRACK";
    /**
     * 返航航线的设置的结果
     */
    public static final String COMMANDRESULT_WAYPOINT_TYPE_GO_HOME_INGROUND = "com.ceewa.constant.COMMANDRESULT_WAYPOINT_TYPE_GO_HOME_INGROUND";
    /**
     * 飞行模式的结果
     */
    public static final String COMMANDRESULT_WAYPOINT_TYPE_AB_INFINITE = "com.ceewa.constant.COMMANDRESULT_WAYPOINT_TYPE_AB_INFINITE";
    /**
     * 手动控制指向
     */
    public static final String COMMANDRESULT_HANDCONTROL_CRUISE_HEADING = "com.ceewa.constant.COMMANDRESULT_HANDCONTROL_CRUISE_HEADING";
    /**
     * 自动控制指向
     */
    public static final String COMMANDRESULT_AUTOCONTROL_CRUISE_HEADING = "com.ceewa.constant.COMMANDRESULT_AUTOCONTROL_CRUISE_HEADING";
    /**
     * 记录航向
     */
    public static final String COMMANDRESULT_IOC_COURSE_RECORD = "com.ceewa.constant.COMMANDRESULT_IOC_COURSE_RECORD";
    /**
     * 记录兴趣点
     */
    public static final String COMMANDRESULT_IOC_POI_RECORD = "com.ceewa.constant.COMMANDRESULT_IOC_POI_RECORD";

}
