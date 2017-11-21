/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BLL;

/**
 *
 * @author sebok
 */
public class BLLException extends Exception
{
    
    private String message;
    
    public BLLException(Exception ex)
    {
        this.message = ex.getMessage();
    }
    
    @Override
    public String getMessage()
    {
        return this.message;
    }
    
}
