
package ejer7;

import javax.swing.JOptionPane;

public class Ejer7 {

    public static void main(String[] args) {

        String arreglo[] = new String[5];
        int opcion;
        int opcion_modificar, opcion_eliminar;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+
                    "\n"+
                    "\n1. Ingreso de nombres de los trabajadores."+
                    "\n2. Modificar nombre."+
                    "\n3. Eliminar nombre."+
                    "\n4. Salir."));
            
            switch(opcion){
                
                case 1:
                    JOptionPane.showMessageDialog(null, "\tDigite 5 nombres\n");
                    for(int i=0 ; i<5 ; i++){
                        
                    arreglo[i]=JOptionPane.showInputDialog((1+i)+". Digite el nombre del empleado: ");
                    System.out.println( (i) +". "+ arreglo[i]);
                    
                    }
                    break;
                    
                case 2: 
              
                    opcion_modificar = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición del nombre a modificar: " ));
                        
                        if (opcion_modificar >=5){
                            
                            JOptionPane.showMessageDialog(null,"Esta posición no existe.");
                        }
                        
                        else {
                            
                            arreglo[opcion_modificar] = JOptionPane.showInputDialog("Digite el nuevo valor de este dato: ");
                            System.out.println("");
                            
                            for(int i = 0 ; i<5 ; i++ ){
                                
                                System.out.println((i) +". "+ arreglo[i]);
                               
                            
                            }
                        
                        }
                        
                    break;
                
                case 3:
                    
                    opcion_eliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición del nombre a eliminar: " ));
                        
                        if (opcion_eliminar >=5){
                            
                            JOptionPane.showMessageDialog(null,"Esta posición no existe.");
                        }
                        else{
                            
                            arreglo[opcion_eliminar] = null;
                            System.out.println("");
                            
                            for(int i = 0 ; i<5 ; i++ ){
                                
                                System.out.println((i) +". "+ arreglo[i]);
                               
                            
                            }
                            
                        }
                    
                    break;
                case 4:JOptionPane.showMessageDialog(null, "FIN DEL MENU...");
                    
      
            }  
            
        }while(opcion!=4);
        
    }
    
}
