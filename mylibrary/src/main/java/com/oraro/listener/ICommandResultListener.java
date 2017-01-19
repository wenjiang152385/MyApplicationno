package com.oraro.listener;

/**
 * Created by Administrator on 2016/12/9 0009.
 *
 * @author
 * 无人机起飞,悬停,降落,返航的回调
 */
public interface ICommandResultListener {
    /**
     * 命令返回的回调
     参数:
     event - 事件名称
     result - 成功1、失败2、无响应0
     * @param s
     * @param b
     */
    void commandResultlistener(String s, byte b);
    void  resultCodelistener(String s, String s1);
}
