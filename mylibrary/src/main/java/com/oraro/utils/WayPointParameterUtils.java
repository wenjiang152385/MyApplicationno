package com.oraro.utils;

import com.ceewa.entity.model.BeanWaypoint;
import com.ceewa.entity.model.WayPointParameter;
import com.ceewa.entity.model.WaypointTask;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/12 0012.
 *
 * @author
 * 航点信息
 */
public class WayPointParameterUtils implements Serializable,Cloneable {
    /**
     * 设置航点总数
     */
    private byte number;
    private boolean setNumber = false;
    /**
     * 当前航点序号
     */
    private byte currentIndex;
    private boolean setCurrentIndex = false;
    /**
     * 下一航点序号
     */
    private byte nextIndex;
    private boolean setNextIndex = false;
    /**
     * 航点信息
     */
    private BeanWaypoint beanWaypoint;
    private boolean setBeanWaypoint = false;
    /**
     * 爬升率
     */
    private short climbRate;
    private boolean setClimbRate = false;
    /**
     * 到点距离
     */
    private short distance;
    private boolean setDistance = false;

    /**
     *模式mode 模式(1：起飞航点 2：过路航点 3：盘旋航点 4：悬停航点 5：降落航点 6：跑道航点
     *  7：切换到P模式并自动降落的航点 8：切换到P模式并悬停的航点)
     */
    private byte mode;
    private boolean setMode = false;

    /**
     * 环绕飞行时的速度
     */
    private short vCircle;

    /**
     *:盘旋半径
     */
    private short cradius;

    /**
     * 详细任务
     */
    private WaypointTask task;
    private boolean setTask = false;

    public WayPointParameterUtils() {
    }

    public WaypointTask getTask() {
        return task;
    }

    public void setTask(WaypointTask task) {
        this.task = task;
    }

    public boolean isSetTask() {
        return setTask;
    }

    public void setSetTask(boolean setTask) {
        this.setTask = setTask;
    }

    /**
     * 获取航点总数
     * @return
     */

    public byte getNumber() {
        return number;
    }

    /**
     * 设置航点总数
     * @param number
     */

    public void setNumber(byte number) {
        this.number = number;
    }

    public boolean isSetNumber() {
        return setNumber;
    }

    public void setSetNumber(boolean setNumber) {
        this.setNumber = setNumber;
    }

    /**
     *获取当前航点序号
     * @return
     */

    public byte getCurrentIndex() {
        return currentIndex;
    }

    /**
     * 设置当前航点序号
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
     * 获取下一航点序号
     * @return
     */
    public byte getNextIndex() {
        return nextIndex;
    }

    /**
     * 设置下一航点序号
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
     *获取航点信息
     * @return
     */

    public BeanWaypoint getBeanWaypoint() {
        return beanWaypoint;
    }

    /**
     * 设置航点信息
     * @param beanWaypoint
     */

    public void setBeanWaypoint(BeanWaypoint beanWaypoint) {
        this.beanWaypoint = beanWaypoint;
    }

    public boolean isSetBeanWaypoint() {
        return setBeanWaypoint;
    }

    public void setSetBeanWaypoint(boolean setBeanWaypoint) {
        this.setBeanWaypoint = setBeanWaypoint;
    }

    /**
     * 获取爬升率(单位：0.1m/s)
     * @return
     */
    public short getClimbRate() {
        return climbRate;
    }

    /**
     * 设置爬升率(单位：0.1m/s)
     * @param climbRate
     */

    public void setClimbRate(short climbRate) {
        this.climbRate = climbRate;
    }

    public boolean isSetClimbRate() {
        return setClimbRate;
    }

    public void setSetClimbRate(boolean setClimbRate) {
        this.setClimbRate = setClimbRate;
    }

    /**
     * 获取到点距离(单位：米)
     * @return
     */

    public short getDistance() {
        return distance;
    }

    /**
     * 设置到点距离(单位：米)
     * @param distance
     */

    public void setDistance(short distance) {
        this.distance = distance;
    }

    public boolean isSetDistance() {
        return setDistance;
    }

    public void setSetDistance(boolean setDistance) {
        this.setDistance = setDistance;
    }

    /**
     *获取模式(1：起飞航点 2：过路航点 3：盘旋航点 4：悬停航点 5：降落航点
     * 6：跑道航点 7：切换到P模式并自动降落的航点 8：切换到P模式并悬停的航点)
     * @return
     */

    public byte getMode() {
        return mode;
    }

    /**
     * 设置模式(1：起飞航点 2：过路航点 3：盘旋航点 4：悬停航点 5：降落航点
     * 6：跑道航点 7：切换到P模式并自动降落的航点 8：切换到P模式并悬停的航点)
     * @param mode
     */

    public void setMode(byte mode) {
        this.mode = mode;
    }

    public boolean isSetMode() {
        return setMode;
    }

    public void setSetMode(boolean setMode) {
        this.setMode = setMode;
    }

    /**
     * 获取环绕飞行时的速度(单位：0.1m/s)
     * @return
     */

    public short getvCircle() {
        return vCircle;
    }

    /**
     * 设置环绕飞行时的速度(单位：0.1m/s)
     * @param vCircle
     */

    public void setvCircle(short vCircle) {
        this.vCircle = vCircle;
    }


    /**获取盘旋半径(单位：米)
     *
     * @return
     */

    public short getCradius() {
        return cradius;
    }

    /**
     *设置盘旋半径(单位：米)
     * @param cradius
     */

    public void setCradius(short cradius) {
        this.cradius = cradius;
    }

    public Object clone() throws CloneNotSupportedException {
        WayPointParameter wp = (WayPointParameter)super.clone();
        if(this.task != null) {
            wp.setTask((WaypointTask)this.task.clone());
        }

        if(this.beanWaypoint != null) {
            wp.setBeanWaypoint((BeanWaypoint)this.beanWaypoint.clone());
        }

        return wp;
    }
}
