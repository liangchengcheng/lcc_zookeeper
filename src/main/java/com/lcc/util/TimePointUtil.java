package com.lcc.util;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by lcc on 2016/11/20.
 */
public class TimePointUtil {
    private static final int HALF_SHIFT = 8;

    /**
     * 返回结果一定是2个item的数组：
     * <ol>
     * <li>ret[0]是hour</li>
     * <li>ret[1]是minute</li>
     * </ol>
     */
    public static short[] decode(short val){
        return new short[] {(short) (val >> HALF_SHIFT), (short) (val & 0xFF)};
    }
    /**
     * hour: [0,23] , minute: [0,59]
     */
    public static short encode(short hour, short minute) {
        checkArgument(hour >= 0 && hour < 24, "小时应该：[0,23]");
        checkArgument(minute >= 0 && minute < 60, "分钟应该：[0,59]");
        return (short) (hour << HALF_SHIFT | (minute));
    }

}
