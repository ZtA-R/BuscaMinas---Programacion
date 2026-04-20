class Casilla {

    private boolean tieneMina = false;
    private boolean estaVacio = true;
    private boolean tieneBandera = false;
    private int minasAlrededor = 0;

    public boolean getTieneMina(){
        return tieneMina;
    }

    public boolean getEstaVacio(){
        return estaVacio;
    }

    public boolean getTieneBandera(){
        return tieneBandera;
    }

    public int getMinasAlrededor(){
        return minasAlrededor;
    }

    public void setTieneMina( boolean tieneMina){
        this.tieneMina = tieneMina;
    }

    public void setEstaVacio(boolean estaVacio){
        this.estaVacio = estaVacio;
    }

    public void setTieneBandera(boolean tieneBandera){
        this.tieneBandera = tieneBandera;
    }

    public void setMinasAlrededor(int minasAlrededor) {
        this.minasAlrededor = minasAlrededor;
    }
}
