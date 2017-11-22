/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author sebok
 */
public class ConnectionManager
{
    private SQLServerDataSource ds = new SQLServerDataSource();

    public ConnectionManager()
    {
        ds.setDatabaseName("Youknowit");
        ds.setUser("Youknowit");
        ds.setPassword("Youknowit");
        ds.setPortNumber(9999);
        ds.setServerName("Youknowit");
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
}
