package javatest;

import org.nlpcn.commons.lang.jianfan.JianFan;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/4/29 10:53
 */
public class ChineseTest {
    public static void main(String[] args) {
        String fan = JianFan.j2f("测试");
        System.out.println(fan);
    }
}
