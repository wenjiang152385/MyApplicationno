package com.oraro.constants;

/**
 * Created by Administrator on 2016/12/12 0012.
 *命令执行结果
 * @author
 */
public enum CommandResultConstants {
    /**
     * 成功1、失败2、无响应0
     */
    SUCCESS((byte)1),
    ERROR((byte)2),
    NULL((byte)0);

    private byte value;

    private CommandResultConstants(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return this.value;
    }
}
