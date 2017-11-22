/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.BE;

/**
 *
 * @author Michael
 */
public class Joke {
    
    private final int id;
        private String joke;
    
    public Joke(int id, String joke)
    {
        this.id = id;
        this.joke = joke;
    }

    /**
     * Get the value of joke
     *
     * @return the value of joke
     */
    public String getJoke() {
        return joke;
    }

    /**
     * Set the value of joke
     *
     * @param joke new value of joke
     */
    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Joke{" + "joke=" + joke + '}';
    }

}
