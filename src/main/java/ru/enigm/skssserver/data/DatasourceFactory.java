package ru.enigm.skssserver.data;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatasourceFactory {

    private static final String DB_URL_PROPERTY = "DB_URL";
    private static final String DB_USER_PROPERTY = "DB_USER";
    private static final String DB_PASSWORD_PROPERTY = "DB_PASSWORD";

    public static DataSource getMysqlDatasource() {

        Properties properties = new Properties();
        FileInputStream fileInputStream;
        MysqlDataSource mysqlDataSource = null;

        try {
            fileInputStream = new FileInputStream("database.properties");
            properties.load(fileInputStream);

            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setURL(properties.getProperty(DB_URL_PROPERTY));
            mysqlDataSource.setUser(properties.getProperty(DB_USER_PROPERTY));
            mysqlDataSource.setPassword(properties.getProperty(DB_PASSWORD_PROPERTY));
        } catch (IOException e){
            e.printStackTrace();
        }

        return mysqlDataSource;
    }
}
