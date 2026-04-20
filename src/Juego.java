import com.sun.source.tree.IfTree;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

class juego{
    private tabla miTabla ;
    private Scanner sc;
    private boolean juegoTerminado = false;

    public juego(){
        this.miTabla = new tabla();
        this.sc = new Scanner(System.in);
        this.juegoTerminado = false;

        miTabla.ponerMinas(10);
    }

    public void juego(){
        while(!juegoTerminado) {
            miTabla.imprimirTablero();

            System.out.println("Introduce una fila del (0-8):");
            int fila = sc.nextInt();

            System.out.println("Introduce una columna del (0-8):");
            int columna = sc.nextInt();

            System.out.println("Que accion quieres cometer: 1- Comprobar Casilla, 2- Poner bandera/Quitar");
            int accion = sc.nextInt();


        }
    }

    private void procesarJugada(int fila, int columna, int accion) {
        // 1. Buscamos la casilla exacta en nuestra tabla
        Casilla casillaSeleccionada = miTabla.getCasillas()[fila][columna];
        if(accion == 1){
            casillaSeleccionada.setEstaRevelada(true);

            if (casillaSeleccionada.getTieneMina()){
                System.out.println("Había una bomba has perdido");
                juegoTerminado = true;
            }
        } else if (accion == 2) {
            //Si el usuario escoge la accion 2, lo que hacemos es mirar si tiene bandera, si la tiene se la quitamos si no se la ponemos
            boolean estadoActual = casillaSeleccionada.getTieneBandera();
            casillaSeleccionada.setTieneBandera(!estadoActual);
        }
    }
}