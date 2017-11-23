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
    public void setDataIntoDB(String joke) throws DALException
    {
        try(Connection con = cm.getConnection();)
        {
            String sql = "INSERT INTO Jokes (joke) VALUES (?);";

            PreparedStatement pstmnt = con.prepareStatement(sql);
            pstmnt.setString(1, joke);
            pstmnt.executeUpdate();

        }
        catch(SQLException ex)
        {
            throw new DALException(ex);
        }
    }
 }
   
