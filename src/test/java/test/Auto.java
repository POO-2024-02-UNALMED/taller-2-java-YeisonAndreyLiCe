package test;

public class Auto {
    public static int cantidadCreados = 0;
    public String modelo;
    public double precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;

    public Auto(String modelo, double precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = new Asiento[10];
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                this.asientos[i] = asientos[i];
            }
        }
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public Auto() {
        //TODO Auto-generated constructor stub
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        String message = "Auto original";
        if (motor.getRegistro() != registro) {
            message = "Las piezas no son originales";
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.getRegistro() != registro) {
                message = "Las piezas no son originales";
                break;
            }
        }

        return message;
    }

    // Getters and setters for the fields can be added here if needed.

    public static int getCantidadCreados() {
        return cantidadCreados;
    }
}
