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
    @WebMethod(operationName = "tallas_conversor")
    public void Tallas_conversor(@WebParam(name = "talla") String talla) {
        talla = JOptionPane.showInputDialog("Ingrese la talla(Solo ingresar mayusculas)");
        if(talla=="XS"){
           JOptionPane.showMessageDialog(null, "USA=2,UK=4,EU/LATAM=32,JPN=5");
        }
        if(talla=="S"){
            JOptionPane.showMessageDialog(null, "USA=6,UK=8,EU/LATAM=36,JPN=9");
        }
        if(talla=="M"){
            JOptionPane.showMessageDialog(null, "USA=10,UK=12,EU/LATAM=40,JPN=13");
        }
        if(talla=="L"){
            JOptionPane.showMessageDialog(null, "USA=14,UK=16,EU/LATAM=44,JPN=17");
        }
        if(talla=="XL"){
            JOptionPane.showMessageDialog(null, "USA=18,UK=20,EU/LATAM=48,JPN=21");
        }
        if (talla=="XXL"){
            JOptionPane.showMessageDialog(null, "USA=22,UK=24,EU/LATAM=52,JPN=25");
        
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una talla correcta");
        } 
        
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "conversor_numeros")
    public void conversor_numeros(@WebParam(name = "talla") String talla) {
        talla = JOptionPane.showInputDialog("Ingrese la talla en numeros enteros!");
        int t1 = Integer.parseInt(talla);
        if(t1>=32 && t1<=35){
           JOptionPane.showMessageDialog(null, "USA=2,UK=4,EU/LATAM=32,JPN=5");
        }
        if(t1>=36 && t1<=39){
            JOptionPane.showMessageDialog(null, "USA=6,UK=8,EU/LATAM=36,JPN=9");
        }
        if(t1>=40 && t1<=43){
            JOptionPane.showMessageDialog(null, "USA=10,UK=12,EU/LATAM=40,JPN=13");
        }
        if(t1>=44 && t1<=47){
            JOptionPane.showMessageDialog(null, "USA=14,UK=16,EU/LATAM=44,JPN=17");
        }
        if(t1>=48 && t1<=51){
            JOptionPane.showMessageDialog(null, "USA=18,UK=20,EU/LATAM=48,JPN=21");
        }
        if (t1==52){
            JOptionPane.showMessageDialog(null, "USA=22,UK=24,EU/LATAM=52,JPN=25");
        
        }else if(t1<32||t1>52){
            JOptionPane.showMessageDialog(null, "Ingrese una talla correcta");
        } 
        
    }
    
}
