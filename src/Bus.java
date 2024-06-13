public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int asientosDisponibles(int asientosUtilizados) {
        if (asientosUtilizados >= cantidadDeAsientos) {
            return cantidadDeAsientos - asientosUtilizados;
        }

        return 0;
    }
}