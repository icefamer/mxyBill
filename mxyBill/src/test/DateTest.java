package test;

import util.DateUtil;

/**
 * Created by admin on 2017/6/20.
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(DateUtil.today());
        System.out.println(DateUtil.monthBegin());
        System.out.println(DateUtil.monthEnd());
        System.out.println(DateUtil.thisMonthLeftDay());
        System.out.println(DateUtil.thisMonthTotalDay());
    }
}
