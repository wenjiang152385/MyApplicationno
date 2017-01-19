package com.oraro.mylibrary;

import com.ceewa.api.inter.IBatteryInfoCallback;
import com.ceewa.api.inter.ICommandResultCallback;
import com.ceewa.api.inter.IDfxInfoCallback;
import com.ceewa.api.inter.IFlightModeCallback;
import com.ceewa.api.inter.IHomeInfoCallback;
import com.ceewa.api.inter.IModuleInfoCallback;
import com.ceewa.api.inter.IUavInfoCallback;
import com.ceewa.api.process.commoninfo.FlightController;
import com.ceewa.entity.model.BatteryInfo;
import com.ceewa.entity.model.DfxInfo;
import com.ceewa.entity.model.HomeInfo;
import com.ceewa.entity.model.ModuleInfo;
import com.ceewa.entity.model.UAVInfo;
import com.oraro.listener.IBatteryInfoListener;
import com.oraro.listener.ICommandResultListener;
import com.oraro.listener.IDfxInfoListener;
import com.oraro.listener.IFlightModeListener;
import com.oraro.listener.IHomeInfoListener;
import com.oraro.listener.IModuleInfoListener;
import com.oraro.listener.IUavInfoListener;


/**
 * Created by Administrator on 2016/12/8 0008.
 *
 * @author
 */
public class FlightControllerManager {
    private static FlightControllerManager flightControllerManager = null;
    private static FlightController flightController;
    private IBatteryInfoListener iBatteryInfoListener;
    private ICommandResultListener iCommandResultListener;
    private IHomeInfoListener iHomeInfoListener;
    private IModuleInfoListener iModuleInfoListener;
    private IUavInfoListener iUavInfoListener;
    private IFlightModeListener iFlightModeListener;
    private IDfxInfoListener iDfxInfoListener;

    private FlightControllerManager() {
    }

    public static FlightControllerManager getFlightControllerManager() {
        if (null == flightController) {
            flightController = new FlightController();
        }
        if (null == flightControllerManager) {
            flightControllerManager = new FlightControllerManager();

        }
        return flightControllerManager;
    }


    /**
     * 执行命令
     * commandId - 命令ID
     * <p>
     * callback - 回调
     *
     * @param commandId
     */
    public void ExcuteNormalCommand(byte commandId, ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.excuteNormalCommand(commandId, iCommandResultCallback);

    }

    /**
     * period - 定时器循环时间
     *
     * @param commandId
     * @param period
     */
    public void ExcuteTimerCommand(byte commandId, long period, ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.excuteTimerCommand(commandId, period, iCommandResultCallback);

    }

    /**
     * 获取电池信息
     */
    public void getBatteryInfo(IBatteryInfoListener batteryInfoListener) {
        iBatteryInfoListener = batteryInfoListener;
        flightController.getBatteryInfo(iBatteryInfoCallback);
    }

    IBatteryInfoCallback iBatteryInfoCallback = new IBatteryInfoCallback() {
        @Override
        public void batteryInfoCallback(BatteryInfo batteryInfo) {
            iBatteryInfoListener.batteryInfolistener(batteryInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iBatteryInfoListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 获取飞机的DFX信息
     */
    public void getDfxInfo(IDfxInfoListener dfxInfoListener) {
        iDfxInfoListener = dfxInfoListener;
        flightController.getDfxInfo(iDfxInfoCallback);
    }

    private IDfxInfoCallback iDfxInfoCallback = new IDfxInfoCallback() {
        @Override
        public void getDfxInfoCallback(DfxInfo dfxInfo) {
            iDfxInfoListener.getDfxInfolistener(dfxInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iDfxInfoListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 获取飞行模式
     */
    public void getFlightMode(IFlightModeListener flightModeListener) {
        iFlightModeListener = flightModeListener;
        flightController.getFlightMode(iFlightModeCallback);
    }

    private IFlightModeCallback iFlightModeCallback = new IFlightModeCallback() {
        @Override
        public void flightModeCallback(int i) {
            iFlightModeListener.flightModelistener(i);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iFlightModeListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 获取HOME点信息
     */
    public void getHomeInfo(IHomeInfoListener homeInfoListener) {
        iHomeInfoListener = homeInfoListener;
        flightController.getHomeInfo(iHomeInfoCallback);
    }

    private IHomeInfoCallback iHomeInfoCallback = new IHomeInfoCallback() {
        @Override
        public void homeInfoCallback(HomeInfo homeInfo) {
            iHomeInfoListener.homeInfolistener(homeInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iHomeInfoListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 获取模块信息
     */
    public void getModuleInfo(IModuleInfoListener moduleInfoListener) {
        iModuleInfoListener = moduleInfoListener;
        flightController.getModuleInfo(iModuleInfoCallback);
    }

    private IModuleInfoCallback iModuleInfoCallback = new IModuleInfoCallback() {
        @Override
        public void moduleInfoCallback(ModuleInfo moduleInfo) {
            iModuleInfoListener.moduleInfolistener(moduleInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iModuleInfoListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 获取主帧里的飞机的信息
     */
    public void getUavInfo(IUavInfoListener uavInfoListener) {
        iUavInfoListener = uavInfoListener;
        flightController.getUavInfo(iUavInfoCallback);
    }

    IUavInfoCallback iUavInfoCallback = new IUavInfoCallback() {
        @Override
        public void uavInfoCallback(UAVInfo uavInfo) {
            iUavInfoListener.uavInfolistener(uavInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iUavInfoListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 返航
     */
    public void goHome(ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.goHome(iCommandResultCallback);
    }

    private ICommandResultCallback iCommandResultCallback = new ICommandResultCallback() {
        @Override
        public void commandResultCallback(String s, byte b) {
            iCommandResultListener.commandResultlistener(s, b);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
            iCommandResultListener.resultCodelistener(s, s1);
        }
    };

    /**
     * 降落
     */

    public void landing(ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.landing(iCommandResultCallback);
    }

    /**
     * 恢复飞行任务
     */
    public void resetFlight(ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.resetFlight(iCommandResultCallback);
    }

    /**
     * 调整飞机的指向和云台的俯仰
     *
     * @param droneValue
     * @param gimbalValue
     */
    public void rotateDroneAndGimbal(int droneValue, int gimbalValue) {
        flightController.rotateDroneAndGimbal(droneValue, gimbalValue);
    }

    /**
     * 悬停
     */
    public void stop(ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.stop(iCommandResultCallback);
    }

    /**
     * 起飞
     */
    public void takeoff(ICommandResultListener commandResultListener) {
        iCommandResultListener = commandResultListener;
        flightController.takeoff(iCommandResultCallback);
    }
}
