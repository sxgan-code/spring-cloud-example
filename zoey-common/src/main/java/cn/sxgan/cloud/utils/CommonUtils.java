package cn.sxgan.cloud.utils;

public class CommonUtils {

    /**
     * 睡眠方法
     *
     * @return
     */
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
