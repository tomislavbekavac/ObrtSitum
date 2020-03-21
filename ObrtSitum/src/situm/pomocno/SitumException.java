/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.pomocno;

/**
 *
 * @author Profesor
 */

public class SitumException extends Exception{
    
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public SitumException(String poruka){
        super(poruka);
    }
    
}
