public class MiniBus extends Bus{
    private String tipoViaje;

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente,cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println( "MiniBus = {" +
                "tipoViaje='" + tipoViaje + '\'' +
                "color='" + super.getColor() + '\'' +
                "patente='" + super.getPatente() + '\'' +
                '}');
        }
}
