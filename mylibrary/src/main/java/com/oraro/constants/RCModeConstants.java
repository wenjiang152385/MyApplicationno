package com.oraro.constants;

/**
 * Created by Administrator on 2016/12/12 0012.
 *摇杆模式的种类
 * @author
 */
public enum RCModeConstants {
    /**
     * 模式一(日本手)
     * 模式三(中国手)
     * 模式二(美国手)
     */
    MODE_ONE(1),
    MODE_TWO(2),
    MODE_THREE(3),
    MODE_FOUR(4);

    private int value;

    private RCModeConstants(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
