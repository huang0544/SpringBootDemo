package com.hjj.springdemo.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: springdemo
 * @description: 获取当前方法和行号
 * @author: hjj
 * @create: 2020-11-07 10:39
 **/
@Slf4j
public class MethodUtil {

    /**
     * 私有化工具类 防止被实例化
     */
    private MethodUtil() {
    }

    public static String getLineInfo() {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return ste.getFileName() + " -> " + ste.getLineNumber() + "行";
    }

}
