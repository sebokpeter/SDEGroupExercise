/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.DAL;

import java.sql.SQLException;
import sdegroupexercise.BE.Joke;

/**
 *
 * @author sebok
 */
public interface DataAccesInterface
{
    public String getDataFromDB() throws DALException;
    
    public Joke setDataIntoDB(String joke) throws SQLException;
}
