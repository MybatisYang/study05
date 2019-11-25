package com.zslin.model;

import java.sql.*;

/**
 * @author xiaoyang
 * @date 2019/11/20 - 21:32
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://47.100.116.193:3306/study05?characterEncoding=utf8&useSSL=false&serverTimezone=GMT";
        Connection con = DriverManager.getConnection(url, "root", "123456");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from test");
        while (resultSet.next()) {
            System.out.println("查询结果： "+resultSet.getString("user"));
        }

    }
}
