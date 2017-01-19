package com.oraro.utils;

import com.ceewa.entity.model.Point3D;
import com.ceewa.entity.model.TrackFollowWaypointParameter;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/16 0016.
 *
 * @author
 */
public class TrackFollowWaypointParameterUtils implements Serializable, Cloneable {
    private static final long serialVersionUID = 6049867707071778372L;
    private byte number;
    private boolean setNumber = false;
    private byte currentIndex;
    private boolean setCurrentIndex = false;
    private byte nextIndex;
    private boolean setNextIndex = false;
    private Point3D point;
    private boolean setPoint = false;
    public  TrackFollowWaypointParameterUtils(){}

    public boolean isSetNumber() {
        return setNumber;
    }

    public void setSetNumber(boolean setNumber) {
        this.setNumber = setNumber;
    }

    /**
     * 获取绘线跟随的航点信息的航点总数
     * @return
     */
    public byte getNumber() {
        return number;
    }

    /**
     * 设置绘线跟随的航点信息的航点总数
     * @param number
     */
    public void setNumber(byte number) {
        this.number = number;
    }

    /**
     *获取绘线跟随的航点信息的当前航点序号
     * @return
     */
    public byte getCurrentIndex() {
        return currentIndex;
    }

    /**
     * 设置绘线跟随的航点信息的当前航点序号
     * @param currentIndex
     */
    public void setCurrentIndex(byte currentIndex) {
        this.currentIndex = currentIndex;
    }

    public boolean isSetCurrentIndex() {
        return setCurrentIndex;
    }

    public void setSetCurrentIndex(boolean setCurrentIndex) {
        this.setCurrentIndex = setCurrentIndex;
    }

    /**
     *获取绘线跟随的航点信息的下一航点序号
     * @return
     */
    public byte getNextIndex() {
        return nextIndex;
    }

    /**
     * 设置绘线跟随的航点信息的下一航点序号
     * @param nextIndex
     */
    public void setNextIndex(byte nextIndex) {
        this.nextIndex = nextIndex;
    }

    public boolean isSetNextIndex() {
        return setNextIndex;
    }

    public void setSetNextIndex(boolean setNextIndex) {
        this.setNextIndex = setNextIndex;
    }

    /**
     *获取绘线跟随的航点的坐标
     * @return
     */
    public Point3D getPoint() {
        return point;
    }

    /**
     * 设置绘线跟随的航点的坐标
     * @param point
     */
    public void setPoint(Point3D point) {
        this.point = point;
    }

    public boolean isSetPoint() {
        return setPoint;
    }

    public void setSetPoint(boolean setPoint) {
        this.setPoint = setPoint;
    }

    @Override
    public String toString() {
        return "TrackFollowWaypointParameterUtils{" +
                "number=" + number +
                ", setNumber=" + setNumber +
                ", currentIndex=" + currentIndex +
                ", setCurrentIndex=" + setCurrentIndex +
                ", nextIndex=" + nextIndex +
                ", setNextIndex=" + setNextIndex +
                ", point=" + point +
                ", setPoint=" + setPoint +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        TrackFollowWaypointParameterUtils tfp = (TrackFollowWaypointParameterUtils) super.clone();
        if(this.point != null) {
            tfp.setPoint((Point3D)this.point.clone());
        }

        return tfp;
    }
}
