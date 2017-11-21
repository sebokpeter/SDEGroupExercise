/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BLL;

import java.util.logging.Level;
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
    
}
