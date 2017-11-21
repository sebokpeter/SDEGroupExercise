/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.DAL;

import java.sql.SQLException;

/**
 *
 * @author sebok
 */
public class DALException extends Exception
{
    private String message;
    
    DALException(SQLException ex)
    {
        this.message = ex.getMessage();
    }

    @Override
    public String getMessage()
    {
        return this.message;
    }
    
    
    
}
