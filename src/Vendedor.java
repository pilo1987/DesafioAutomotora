public class Vendedor extends Persona {
    private String direccion;

    public Vendedor(String nombre, String rut, int edad) {
        super(nombre, rut, edad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
