/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BLL;

import java.util.List;
import java.util.Random;
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
            return selectRandomJoke(dalManager.getDataFromDB());
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
            if (joke.isEmpty())
            {
                throw new BLLException("Joke is empty");
            }
            dalManager.setDataIntoDB(joke);
        } 
        catch (DALException ex)
        {
            throw new BLLException(ex);
        }
       
        
    }

    private String selectRandomJoke(List<String> dataFromDB)
    {
        Random random = new Random();
        
        return dataFromDB.get(random.nextInt(dataFromDB.size()));
    }
    

}
