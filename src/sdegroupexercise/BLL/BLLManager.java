/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BLL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sdegroupexercise.BE.Joke;
import sdegroupexercise.DAL.DALException;
import sdegroupexercise.DAL.DALManager;
import sdegroupexercise.DAL.DataAccesInterface;

/**
 *
 * @author sebok
 */
public class BLLManager implements BLLInterface
{
    
    DataAccesInterface dalManager = new DALManager();


    @Override
    public String getDataFromDAL() throws BLLException
    {
        try
        {
            return dalManager.getDataFromDB();
        } 
        catch (DALException ex)
        {
            throw new BLLException(ex);
        }
    
    }
        
    
    @Override
     public void setDataIntoDAL(String joke) throws BLLException
    {
        
        try
        {
            dalManager.setDataIntoDB(joke);
        } 
         catch (SQLException ex) {
            Logger.getLogger(BLLManager.class.getName()).log(Level.SEVERE, null, ex);
        
        
    }
        
       
       
        
    }
    

}
