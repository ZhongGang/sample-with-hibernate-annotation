package com.icode.core.shared;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:10
 */
public class GuidGenerator {

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
