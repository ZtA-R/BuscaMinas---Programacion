class tabla {

    private final int FILAS_GAME = 9;
    private final int COLUMNAS_GAME = 9;
    private Casilla[][] casillas;

    public tabla() {
        casillas = new Casilla[FILAS_GAME][COLUMNAS_GAME];
        for (int i = 0; i < FILAS_GAME; i++) {
            for (int j = 0; j < COLUMNAS_GAME; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero() {

        for (int i = 0; i < FILAS_GAME; i++) {
            System.out.print(i + " |"); // Número de fila

            for (int j = 0; j < COLUMNAS_GAME; j++) {
                Casilla c = casillas[i][j];

                if (!c.getestaRevelada()) {
                    // Si está tapada, miramos si el usuario puso una bandera
                    if (c.getTieneBandera()) {
                        System.out.print("F|"); // F de Flag (Bandera)
                    } else {
                        System.out.print(".|"); // Casilla sin tocar
                    }
                } else {
                    // Si la casilla ESTÁ REVELADA:
                    if (c.getTieneMina()) {
                        System.out.print("*|"); // ¡Bomba!
                    } else if (c.getMinasAlrededor() > 0) {
                        System.out.print(c.getMinasAlrededor() + "|"); // El número
                    } else {
                        System.out.print(" |"); // Espacio vacío si es 0
                    }
                }
            }
            System.out.println();
        }
    }







}