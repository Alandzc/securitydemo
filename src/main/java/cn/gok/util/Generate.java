package cn.gok.util;

import java.util.UUID;

/**
 * @ClassName: Generate
 * @Description:随机生成的id
 * @Author: olj
 * @Date: 2021/11/22
 * @Version: V1.0
 */
public class Generate {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }


}
