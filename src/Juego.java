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

            System.out.println("Que accion quieres cometer: 1- Comprobar Casilla, 2- Poner bandera");
            int accion = sc.nextInt();


        }
    }

}