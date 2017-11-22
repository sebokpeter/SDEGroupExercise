/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sdegroupexercise.BE.Joke;

/**
 *
 * @author sebok
 */
public class DALManager implements DataAccesInterface
{

    ConnectionManager cm = new ConnectionManager();
    

    @Override
    public List<String> getDataFromDB() throws DALException
    {
        List<String> jokes = new ArrayList();
        try(Connection con = cm.getConnection();)
        {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Jokes");
            while(rs.next())
            {
                jokes.add(rs.getString("joke"));
            }
        }
        catch (SQLException ex)
        {
            throw new DALException(ex);
        }
        
        return jokes;
    }
    
    @Override
    public void setDataIntoDB(String joke) throws SQLException
    {
        try(Connection con = cm.getConnection();)
        {
            String sql = "INSERT INTO Jokes (joke) VALUES ('" + joke +"');";
            
            //PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            //statement.setString(1, joke);
            Statement stmnt = con.createStatement();
            stmnt.executeUpdate(sql);
            /*
            if(statement.executeUpdate() == 1){
                ResultSet rs = statement.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                Joke j = new Joke(id, joke);
                return j;
            }
*/
        }
        //throw new RuntimeException("Can't create company");
        
    }
    
}
