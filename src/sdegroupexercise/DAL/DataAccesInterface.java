/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.DAL;

import java.util.List;

/**
 *
 * @author sebok
 */
public interface DataAccesInterface
{
    public List<String> getDataFromDB() throws DALException;
    
    public void setDataIntoDB(String joke) throws DALException;
}
