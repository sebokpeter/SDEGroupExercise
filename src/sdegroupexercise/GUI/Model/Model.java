/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.GUI.Model;

import sdegroupexercise.BLL.BLLException;
import sdegroupexercise.BLL.BLLInterface;
import sdegroupexercise.BLL.BLLManager;

/**
 *
 * @author sebok
 */
public class Model
{
    BLLInterface bllManager = new BLLManager();

    public String getJoke() throws ModelException
    {
        try
        {
            return bllManager.getDataFromDAL();
        } 
        catch (BLLException ex)
        {
            throw new ModelException();
        }
    }
    
}
