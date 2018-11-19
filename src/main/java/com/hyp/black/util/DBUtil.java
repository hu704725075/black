package com.hyp.black.util;

import com.hyp.black.constant.UrlConstant;
import com.hyp.black.vo.Params;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 14:40 2018/11/17
 */
@Slf4j
public class DBUtil {


    public static String createTemplete(Params params){
        String url = params.getDburl();
        String user = params.getUserName();
        String pwd = params.getUserPwd();

        String driver = params.getDBType() == 0 ? UrlConstant.ORCL_DRIVER : UrlConstant.MYSQL_DRIVER;

        String res = "成功";
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            log.error("驱动未找到！");
            res = "失败";
        } catch (SQLException e){
            e.printStackTrace();
            log.error("数据库连接异常！");
            res = "失败";
        }
        return res;
    }

    public static Connection getCon(){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            log.error("驱动未找到！");
        } catch (SQLException e){
            e.printStackTrace();
            log.error("数据库连接异常！");
        }
        return connection;
    }



}