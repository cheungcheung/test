package Jdbc;

import java.sql.*;

public class test {

    public static void main(String[] agrs){


        Connection connection = null;
        PreparedStatement ps = null;


        try {
            //获取数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("数据库加载成功");

            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
            String user ="root";
            String password = "00000000";

            //获取数据库连接对象
            connection = DriverManager.getConnection(url,user,password);

            System.out.println("获取数据库连接对象成功:"+connection);

            String name = "zhangSan";

            for (int i = 0; i <50 ; i++) {
                String sql = "insert into jdbc(name,age) values ('"+name+i+"',20)";


                ps = connection.prepareStatement(sql);

                ps.execute();


            }


            //获取prepareStatement对象






        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
