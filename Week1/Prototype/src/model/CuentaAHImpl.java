package model;

import interfaz.ICuenta;

public class CuentaAHImpl implements ICuenta {
    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        tipo = "ahorro";
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;

        try{
            // esta es la parte principal donde se clona la instancia
            cuenta = (CuentaAHImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAHImpl [tipo= " + tipo + " , monto= " + monto + "]";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
