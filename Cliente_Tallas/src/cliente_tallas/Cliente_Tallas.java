package cliente_tallas;
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
       JOptionPane.showMessageDialog(null, "Bienvenido al conversor de tallas");
       String Menu = JOptionPane.showInputDialog("1. Conversor Internacional a local \n2.Conversor de Local a Internacional\n3.SALIR");
       int t1 = Integer.parseInt(Menu);
       do{
       if(t1==1){
           tallasConversor("mateo");
       }
       if(t1==2){
           conversorNumeros("mateo");
       }
       if(t1==3){
           JOptionPane.showMessageDialog(null,"ADIOS :V");
       }
       else{
       JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
       }
       }while(t1!=3);
    
    }
    
    public static String tallasConversor(java.lang.String talla) {
        uddi.Tallas_Service service = new uddi.Tallas_Service();
        uddi.Tallas port = service.getTallasPort();
        return port.tallasConversor(talla);
    }

    public static String conversorNumeros(java.lang.String talla) {
        uddi.Tallas_Service service = new uddi.Tallas_Service();
        uddi.Tallas port = service.getTallasPort();
        return port.conversorNumeros(talla);
    }
}
