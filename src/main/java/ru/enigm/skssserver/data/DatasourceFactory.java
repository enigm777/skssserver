package ru.enigm.skssserver.data;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatasourceFactory {

    private static final String DB_URL_PROPERTY = "DB_URL";
    private static final String DB_USER_PROPERTY = "DB_USER";
    private static final String DB_PASSWORD_PROPERTY = "DB_PASSWORD";

    public static DataSource getMysqlDatasource() {

        Properties properties = new Properties();
        InputStream inputStream;
        MysqlDataSource mysqlDataSource = null;

        try {
            inputStream = DatasourceFactory.class.getClassLoader().getResourceAsStream("/database.properties");
            properties.load(inputStream);

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
