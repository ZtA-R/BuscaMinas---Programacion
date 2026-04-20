class tabla {

    private final int FILAS_GAME = 9;
    private final int COLUMNAS_GAME = 9;


    public char [][] tableroBuscaMinas(){
        char [][] talberoOriginal = new char[FILAS_GAME][COLUMNAS_GAME];
        for(int i = 0; i< talberoOriginal.length; i++){
            for(int j = 0; j < talberoOriginal.length; j++){
                    talberoOriginal[i][j] = 0;
            }
        }
        return talberoOriginal;
    }

    public void imprimirTablero(char[][] tableroOriginal){
        for(int i = 0; i< FILAS_GAME;i++){
            for(int j = 0; j < COLUMNAS_GAME; j++){
                if (j == 0) System.out.println("|");
                System.out.println(tableroOriginal[i][j] + "|");
            }
            System.out.println();
        }
    }
}