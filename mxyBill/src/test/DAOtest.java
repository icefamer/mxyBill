package test;

import util.DBUtil;

import java.sql.Connection;

/**
 * Created by admin on 2017/6/20.
 */
public class DAOtest {
    public static void main(String[] args) throws Exception{
        System.out.println(DBUtil.getConnection().toString());
    }
}
