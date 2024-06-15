public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jose Tomas","16.647.186-9",15);
        Vehiculo vehiculo = new Vehiculo("Blanco", "BX-FS-44");

        LibroVenta venta = new LibroVenta("pilito", "");
        boolean exito = venta.guardarVenta(cliente, vehiculo);
        }
    }