/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

/**
 *
 * @author osmap
 */
@WebService(serviceName = "Tallas")
public class Tallas {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
     /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "conversor_ropa")
    public String conversor_numeros(@WebParam(name = "talla") String talla) {
        int t1 = Integer.parseInt(talla);
        if(t1>=32 && t1<=35){
           talla = "\nUSA=2\nUK=4\nGLOBAL=XS\nJPN=5";
        }
        if(t1>=36 && t1<=39){
            talla = "\nUSA=6\nUK=8\nGLOBAL=S\nJPN=9";
        }
        if(t1>=40 && t1<=43){
            talla = "\nUSA=10\nUK=12\nGLOBAL=M\nJPN=13";
        }
        if(t1>=44 && t1<=47){
            talla = "\nUSA=14\nUK=16\nGLOBAL=L\nJPN=17";
        }
        if(t1>=48 && t1<=51){
            talla = "\nUSA=18\nUK=20\nGLOBAL=XL\nJPN=21";
        }
        if(t1==52){
            talla = "\nUSA=22\nUK=24\nGLOBAL=XXL\nJPN=25";
        
        }else if(t1>52){
            talla = "Ingrese una talla correcta";
        } 
        return talla;
    }
    
    @WebMethod(operationName = "conversor_zapatos")
    public String conversor_zapatos(@WebParam(name = "talla") String talla) {
        int t1 = Integer.parseInt(talla);
        if(t1<=35){
           talla = "\nUSA=5.5\nUK=3\nEUROPA=36\ncm=22.5";
        }
        if(t1<=36){
            talla = "\nUSA=6\nUK=3.5\nEUROPA=37\ncm=23.5";
        }
        if(t1>=37){
            talla = "\nUSA=7\nUK=4.5\nEUROPA=38\ncm=24";
        }
        if(t1>=38){
            talla = "\nUSA=7.5\nUK=5.5\nEUROPA=39\ncm=25";
        }
        if(t1>=39){
            talla = "\nUSA=8\nUK=6.5\nEUROPA=40\ncm=26";
        }
        if(t1==40){
            talla = "\nUSA=8.5\nUK=7.5\nEUROPA=41\ncm=27";
        }
        if(t1>=41){
            talla = "\nUSA=9.5\nUK=8.5\nEUROPA=42\ncm=27.5";
        }
        if(t1>=42){
            talla = "\nUSA=10\nUK=9\nEUROPA=43\ncm=28";
        }
        if(t1>=43){
            talla = "\nUSA=11\nUK=10\nEUROPA=44\ncm=29";
        }
        else if(t1>52){
            talla = "Ingrese una talla correcta";
        } 
        return talla;
    }
    
      
}
