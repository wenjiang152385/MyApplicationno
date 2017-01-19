package com.oraro.utils;

import com.ceewa.entity.model.UAVParam1;
import com.ceewa.entity.model.UAVParam2;
import com.ceewa.entity.model.UAVParam3;
import com.ceewa.entity.model.UAVParam4;
import com.ceewa.entity.model.UavParam;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/12 0012.
 *
 * @author
 */
public class UAVParamUtils implements Serializable,Cloneable{
    public static final int UAVPARAMINDEX_01 = 1;
    public static final int UAVPARAMINDEX_02 = 2;
    public static final int UAVPARAMINDEX_03 = 3;
    public static final int UAVPARAMINDEX_04 = 4;
    public static final int UAVPARAMINDEX_NULL = 5;
    /**
     *飞控参数1：包含距离限制和高度限制
     */
    private UAVParam1 param1;
    private boolean setParam1 = false;
    /**
     *飞控参数2：包含失控行为、云台灵敏度、返航高度和GPS模式飞行速度
     */
    private UAVParam2 param2;
    private boolean setParam2 = false;
    /**
     *飞控参数3：包含偏航摇杆灵敏度
     */
    private UAVParam3 param3;
    private boolean setParam3 = false;
    /**
     *飞控参数4：包含飞手模式(0-新手模式；1-非新手模式)
     */
    private UAVParam4 param4;
    private boolean setParam4 = false;
    public UAVParamUtils(){}

    public boolean isSetParam4() {
        return setParam4;
    }

    public void setSetParam4(boolean setParam4) {
        this.setParam4 = setParam4;
    }

    /**
     * 获取飞控参数4：包含飞手模式(0-新手模式；1-非新手模式)
     * @return
     */
    public UAVParam4 getParam4() {
        return param4;
    }

    /**
     * 设置飞控参数4：包含飞手模式(0-新手模式；1-非新手模式)
     * @param param4
     */

    public void setParam4(UAVParam4 param4) {
        this.param4 = param4;
    }

    public boolean isSetParam3() {
        return setParam3;
    }

    public void setSetParam3(boolean setParam3) {
        this.setParam3 = setParam3;
    }

    /**
     * 获取飞控参数3：包含偏航摇杆灵敏度
     * @return
     */

    public UAVParam3 getParam3() {
        return param3;
    }

    /**
     * 设置飞控参数3：包含偏航摇杆灵敏度
     * @param param3
     */

    public void setParam3(UAVParam3 param3) {
        this.param3 = param3;
    }

    public boolean isSetParam2() {
        return setParam2;
    }

    public void setSetParam2(boolean setParam2) {
        this.setParam2 = setParam2;
    }

    /**
     * 获取飞控参数2：包含失控行为、云台灵敏度、返航高度和GPS模式飞行速度
     * @return
     */
    public UAVParam2 getParam2() {
        return param2;
    }

    /**
     * 设置飞控参数2：包含失控行为、云台灵敏度、返航高度和GPS模式飞行速度
     * @param param2
     */
    public void setParam2(UAVParam2 param2) {
        this.param2 = param2;
    }

    public boolean isSetParam1() {
        return setParam1;
    }

    public void setSetParam1(boolean setParam1) {
        this.setParam1 = setParam1;
    }

    /**
     * 获取飞控参数1：包含距离限制和高度限制
     * @return
     */
    public UAVParam1 getParam1() {
        return param1;
    }

    /**
     * 设置飞控参数1：包含距离限制和高度限制
     * @param param1
     */

    public void setParam1(UAVParam1 param1) {
        this.param1 = param1;
    }

    /**
     * UavParam 所有飞控参数信息
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        UAVParamUtils param = (UAVParamUtils) super.clone();
        if(this.param1 != null) {
            param.setParam1((UAVParam1)this.param1.clone());
        }

        if(this.param2 != null) {
            param.setParam2((UAVParam2)this.param2.clone());
        }

        if(this.param3 != null) {
            param.setParam3((UAVParam3)this.param3.clone());
        }

        if(this.param4 != null) {
            param.setParam4((UAVParam4)this.param4.clone());
        }

        return param;
    }

    @Override
    public String toString() {
        return "UAVParamUtils{" +
                "param1=" + param1 +
                ", setParam1=" + setParam1 +
                ", param2=" + param2 +
                ", setParam2=" + setParam2 +
                ", param3=" + param3 +
                ", setParam3=" + setParam3 +
                ", param4=" + param4 +
                ", setParam4=" + setParam4 +
                '}';
    }
}
