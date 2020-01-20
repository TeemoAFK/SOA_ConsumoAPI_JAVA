package cliente_tallas;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author osmap
 */
public class Cliente_Tallas {

    int salir;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"BIENVENIDOS a la APP Conversor de ropa!");
    String menu= JOptionPane.showInputDialog("1. Talla de ropa\n2. Talla de Zapatos\n 3. SALIR");
    int t1 = Integer.parseInt(menu);
    do{
    if(t1==1){
    String a=JOptionPane.showInputDialog("Ingrese su talla de ropa");
    JOptionPane.showMessageDialog(null,"Su talla de ropa es:"+conversorRopa(a));
    }
    if(t1==2){
    String a=JOptionPane.showInputDialog("Ingrese su talla de Zapatos");
    JOptionPane.showMessageDialog(null,"Su talla de zapatos es:"+conversorZapatos(a));
    }
    if(t1==3){
    JOptionPane.showMessageDialog(null,"ADIOS ");
    }else{
    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
    }
    }while(t1!=3);
  
    } 
    private static String conversorRopa(java.lang.String talla) {
        uddi.Tallas_Service service = new uddi.Tallas_Service();
        uddi.Tallas port = service.getTallasPort();
        return port.conversorRopa(talla);
    }

    private static String conversorZapatos(java.lang.String talla) {
        uddi.Tallas_Service service = new uddi.Tallas_Service();
        uddi.Tallas port = service.getTallasPort();
        return port.conversorZapatos(talla);
    }
    
}
