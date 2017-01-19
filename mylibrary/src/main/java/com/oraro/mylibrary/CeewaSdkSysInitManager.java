package com.oraro.mylibrary;

import android.content.Context;

import com.ceewa.api.inter.IRCModeCallback;
import com.ceewa.api.inter.ITelemetryInfoCallback;
import com.ceewa.callback.ICallBack;
import com.ceewa.client.IProtocolClient;
import com.ceewa.core.init.CeewaSdkSysInit;
import com.ceewa.entity.model.BatteryInfo;
import com.ceewa.entity.model.DfxInfo;
import com.ceewa.entity.model.HomeInfo;
import com.ceewa.entity.model.IndustrialUavInfo;
import com.ceewa.entity.model.ModuleInfo;
import com.ceewa.entity.model.RockerInfo;
import com.ceewa.entity.model.UAVInfo;
import com.ceewa.entity.model.VersionInfo;
import com.ceewa.entity.msg.CeewaEvent;
import com.ceewa.listener.IClientListener;
import com.ceewa.msgqueue.ICeewaEventRepo;
import com.oraro.listener.IProtocolListener;
import com.oraro.listener.ITelemetryInfoListener;


/**
 * Created by Administrator on 2016/12/8 0008.
 *
 * @author
 */
public class CeewaSdkSysInitManager {
    private static CeewaSdkSysInitManager ceewaSdkSysInitManager = null;
    private static CeewaSdkSysInit ceewaSdkSysInit;
    private IProtocolListener iProtocolListener;
    private ITelemetryInfoListener iTelemetryInfoListener;

    private CeewaSdkSysInitManager() {
    }

    public static CeewaSdkSysInitManager getCeewaSdkSysInitManager() {
        ceewaSdkSysInit = CeewaSdkSysInit.getInstance();
        if (null == ceewaSdkSysInitManager) {
            ceewaSdkSysInitManager = new CeewaSdkSysInitManager();
        }
        return ceewaSdkSysInitManager;
    }

    /**
     * 获取奇蛙SDK初始化对象：必须严格按照一下顺序执行：先启动sdk,当不使用sdk时，可选择关闭sdk
     * @return
     */
//    public CeewaSdkSysInit initCeewaSdkSysInit(){
//
//        return  ceewaSdkSysInit;
//    }

    /**
     * 初始化SDK
     *
     * @param type
     * @param context
     */
    public void StartCeewaSdkSysInit(int type, Context context, IProtocolListener protocolListener, ITelemetryInfoListener telemetryInfoListener) {
        iProtocolListener = protocolListener;
        iTelemetryInfoListener = telemetryInfoListener;
        ceewaSdkSysInit.start(mIProtocolClient, context, mITelemetryInfoCallback);
    }


    private IProtocolClient mIProtocolClient = new IProtocolClient() {
        @Override
        public String getProtocolClientName() {
            iProtocolListener.getProtocolClientName();
            return null;
        }

        @Override
        public int connect() {
            iProtocolListener.connect();
            return 0;
        }

        @Override
        public int closeConnect() {
            iProtocolListener.closeConnect();
            return 0;
        }

        @Override
        public void registClientListener(IClientListener iClientListener) {
            iProtocolListener.registClientListener(iClientListener);
        }

        @Override
        public boolean isConnect() {
            iProtocolListener.isConnect();
            return false;
        }

        @Override
        public void asynSendMsg(CeewaEvent ceewaEvent, ICallBack<CeewaEvent> iCallBack) {
            iProtocolListener.asynSendMsg(ceewaEvent, iCallBack);
        }

        @Override
        public ICeewaEventRepo getMessageRepo() {
            iProtocolListener.getMessageRepo();
            return null;
        }

        @Override
        public void sendMsg(CeewaEvent ceewaEvent) {
            iProtocolListener.sendMsg(ceewaEvent);
        }
    };

    private ITelemetryInfoCallback mITelemetryInfoCallback = new ITelemetryInfoCallback() {
        @Override
        public void batteryInfoCallback(BatteryInfo batteryInfo) {
            iTelemetryInfoListener.batteryInfolistener(batteryInfo);
        }

        @Override
        public void getDfxInfoCallback(DfxInfo dfxInfo) {
            iTelemetryInfoListener.getDfxInfolistener(dfxInfo);
        }

        @Override
        public void flightModeCallback(int i) {
           iTelemetryInfoListener.flightModelistener(i);
        }

        @Override
        public void homeInfoCallback(HomeInfo homeInfo) {
          iTelemetryInfoListener.homeInfolistener(homeInfo);
        }

        @Override
        public IndustrialUavInfo getIndustrialUavInfo(IndustrialUavInfo industrialUavInfo) {
            iTelemetryInfoListener.getIndustrialUavInfo(industrialUavInfo);
            return null;
        }

        @Override
        public void moduleInfoCallback(ModuleInfo moduleInfo) {
           iTelemetryInfoListener.moduleInfolistener(moduleInfo);
        }

        @Override
        public void rockerInfoCallnack(RockerInfo rockerInfo) {
           iTelemetryInfoListener.rockerInfolistener(rockerInfo);
        }

        @Override
        public void uavInfoCallback(UAVInfo uavInfo) {
          iTelemetryInfoListener.uavInfolistener(uavInfo);
        }

        @Override
        public void versionInfoCallback(VersionInfo versionInfo) {
          iTelemetryInfoListener.versionInfolistener(versionInfo);
        }

        @Override
        public void resultCodeCallback(String s, String s1) {
        iTelemetryInfoListener.resultCodelistener(s,s1);
        }
    };
    /**
     * SDK关闭客户端
     */
    public void Close() {
        ceewaSdkSysInit.close();
    }

    /**
     * SDK重启
     */
    public void Restart() {
        ceewaSdkSysInit.restart();
    }
}
