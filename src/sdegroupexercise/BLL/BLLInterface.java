/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BLL;

import sdegroupexercise.BE.Joke;

/**
 *
 * @author sebok
 */
public interface BLLInterface
{
    public String getDataFromDAL() throws BLLException;
    
    public void setDataIntoDAL(String joke) throws BLLException;
}
