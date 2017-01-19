package com.oraro.mylibrary;

import android.content.Context;

import com.ceewa.api.client.BlueToothClient;
import com.ceewa.entity.msg.CeewaEvent;
import com.ceewa.openconstant.FlightModeConstants;

/**
 * Created by Administrator on 2016/12/8 0008.
 *
 * @author
 */
public class BlueToothClientManager {
    private  static  BlueToothClientManager blueToothClientManager=null;
    private BlueToothClient blueToothClient;
    private CeewaEvent ceewaEvent;

    private   BlueToothClientManager(){}
      public  static  BlueToothClientManager getBlueToothClientManager(){
         if (null==blueToothClientManager){
             blueToothClientManager=new BlueToothClientManager();
         }
         return  blueToothClientManager;
     }
    public void initBlueToothClient (int type, Context context){
        blueToothClient = new BlueToothClient(context,"");

    }

    /**
     * 断开和蓝牙设备的连接
     */
    public  void CloseConnet(){
        blueToothClient.closeConnect();
    }

    /**
     * 建立链接
     */
    public void ConnectC(){
        blueToothClient.connect();
    }

    /**
     *   获取当前客户端名称
     * @return
     */
     public  String getProtocolClientName(){
         String protocolClientName = blueToothClient.getProtocolClientName();
         return  protocolClientName;

     }

    /**
     * 即时发送消息
     */
    public  void sendMsg(){
         if (ceewaEvent==null) {
             ceewaEvent = new CeewaEvent();
         }
        blueToothClient.sendMsg(ceewaEvent);
    }
}
