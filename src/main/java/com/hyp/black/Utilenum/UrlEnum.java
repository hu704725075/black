package com.hyp.black.Utilenum;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 21:08 2018/11/19
 */
public enum UrlEnum {
    //oracle.jdbc.driver.OracleDriver(0),
    //com.mysql.cj.jdbc.Driver(1);
    ORCL(0),
    MYSQL(1);
    private int value;
    UrlEnum( int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

    public static UrlEnum valueOf(int value) {
        switch (value) {
            case 0:
                return ORCL;
            case 1:
                return MYSQL;
            default:
                return null;
        }
    }
}
