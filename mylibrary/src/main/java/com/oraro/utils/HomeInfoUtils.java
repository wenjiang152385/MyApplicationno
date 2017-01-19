package com.oraro.utils;

import com.ceewa.entity.model.HomeInfo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/16 0016.
 *
 * @author
 */
public class HomeInfoUtils implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private byte homeValid;
    /**
     *  是否设置HOME点有效性
     */
    private boolean setHomeValid = false;
    private double latitude;
    private boolean setLatitude = false;
    private double longitude;
    private boolean setLongitude = false;
    private double altitude;
    private boolean setAltitude = false;
    public HomeInfoUtils(){}

    /**
     * 获取HOME点有效性(0：无效 1：有效)
     * @return
     */
    public byte getHomeValid() {
        return homeValid;
    }

    /**
     * 设置OME点有效性(0：无效 1：有效)
     * @param homeValid
     */

    public void setHomeValid(byte homeValid) {
        this.homeValid = homeValid;
    }

    /**
     *  是否设置HOME点有效性
     * @return
     */
    public boolean isSetHomeValid() {
        return setHomeValid;
    }

    public void setSetHomeValid(boolean setHomeValid) {
        this.setHomeValid = setHomeValid;
    }

    /**
     * 获取HOME点纬度(单位：度)
     * @return
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * 设置HOME点纬度(单位：度)
     * @param latitude
     */

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * 是否设置HOME点纬度
     * @return
     */
    public boolean isSetLatitude() {
        return setLatitude;
    }

    public void setSetLatitude(boolean setLatitude) {
        this.setLatitude = setLatitude;
    }

    /**
     *是否设置HOME点经度
     * @return
     */
    public boolean isSetLongitude() {
        return setLongitude;
    }

    public void setSetLongitude(boolean setLongitude) {
        this.setLongitude = setLongitude;
    }

    /**
     * 获取HOME点经度
     * @return
     */

    public double getLongitude() {
        return longitude;
    }

    /**
     * 设置HOME点经度
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取HOME点高度(单位：米)
     * @return
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * 设置HOME点高度
     * @param altitude
     */
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    /**
     * 是否设置HOME点高度
     * @return
     */
    public boolean isSetAltitude() {
        return setAltitude;
    }

    public void setSetAltitude(boolean setAltitude) {
        this.setAltitude = setAltitude;
    }

    @Override
    public String toString() {
        return "HomeInfoUtils{" +
                "homeValid=" + homeValid +
                ", setHomeValid=" + setHomeValid +
                ", latitude=" + latitude +
                ", setLatitude=" + setLatitude +
                ", longitude=" + longitude +
                ", setLongitude=" + setLongitude +
                ", altitude=" + altitude +
                ", setAltitude=" + setAltitude +
                '}';
    }

    /**
     * 克隆HOME点信息
     * @return
     * @throws CloneNotSupportedException
     * HomeInfo HOME点信息
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
