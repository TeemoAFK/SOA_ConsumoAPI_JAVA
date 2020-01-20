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
           talla = "USA=2,UK=4,GLOBAL=XS,JPN=5";
        }
        if(t1>=36 && t1<=39){
            talla = "USA=6,UK=8,GLOBAL=S,JPN=9";
        }
        if(t1>=40 && t1<=43){
            talla = "USA=10,UK=12,GLOBAL=M,JPN=13";
        }
        if(t1>=44 && t1<=47){
            talla = "USA=14,UK=16,GLOBAL=L,JPN=17";
        }
        if(t1>=48 && t1<=51){
            talla = "USA=18,UK=20,GLOBAL=XL,JPN=21";
        }
        if(t1==52){
            talla = "USA=22,UK=24,GLOBAL=XXL,JPN=25";
        
        }else if(t1<32||t1>52){
            talla = "Ingrese una talla correcta";
        } 
        return talla;
    }
    
    @WebMethod(operationName = "conversor_zapatos")
    public String conversor_zapatos(@WebParam(name = "talla") String talla) {
        int t1 = Integer.parseInt(talla);
        if(t1>=32 && t1<=35){
           talla = "USA=2,UK=4,GLOBAL=XS,JPN=5";
        }
        if(t1>=36 && t1<=39){
            talla = "USA=6,UK=8,GLOBAL=S,JPN=9";
        }
        if(t1>=40 && t1<=43){
            talla = "USA=10,UK=12,GLOBAL=M,JPN=13";
        }
        if(t1>=44 && t1<=47){
            talla = "USA=14,UK=16,GLOBAL=L,JPN=17";
        }
        if(t1>=48 && t1<=51){
            talla = "USA=18,UK=20,GLOBAL=XL,JPN=21";
        }
        if(t1==52){
            talla = "USA=22,UK=24,GLOBAL=XXL,JPN=25";
        
        }else if(t1<32||t1>52){
            talla = "Ingrese una talla correcta";
        } 
        return talla;
    }
    
      
}
