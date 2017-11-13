package version1;

import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Aplicacion ap = new Aplicacion();
        
        ap.menu();
    }
    
    public void menu(){ //muestra un mensaje con las opciones
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n"
            + "1: En funcion del: Tamaño\n"
            + "2: En funcion del: Peso\n"
            + "3: Salir\n"));
        
        opciones(opc); //llamo al metodo opciones y le paso un numero
    }
    
    public void opciones(int opc){ //llama a los metodos principales
        Operaciones op = new Operaciones(); //instancio la clase operaciones
        
        try {
            switch(opc){
                case 1:
                    op.tamaño(); //ejecuta algoritmo voraz
                    break;

                case 2:
                    op.peso(); //ejecuta algoritmo voraz
                    break;

                case 4:
                    System.exit(0); //salir el programa
            }
        }catch (Exception e) {
            System.out.println("Elegir una opción"+e);
        }
    }
}
