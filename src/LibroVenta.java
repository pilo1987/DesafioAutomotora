import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public boolean guardarVenta(Cliente cliente, Vehiculo vehiculo) {

        try {
            if (cliente.getEdad() <= 18) {
                throw new IllegalArgumentException("El Cliente es un menor de Edad :  " + cliente.getEdad());
            }
            if (!fechaVenta.matches("\\d+")) {
                throw new IllegalArgumentException("La fecha de venta debe contener solo números.");
            }
            if (nombreVenta == null || nombreVenta.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre de venta no puede estar nulo o vacío.");
            }

            String nombreDirectorio = "src/ficheros";

            File directorio = new File(nombreDirectorio);
            if (!directorio.exists())
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado Exitosamente");
                } else {
                    System.out.println("Error al crear Directorio");
                    return false;
                }
            else {
                System.out.println("El Directorio ya Existe");
            }

            String nombreArchivo = nombreVenta + ".txt";
            File archivo = new File(directorio.getAbsolutePath(), nombreArchivo);

            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado exitosamente");
                } else {
                    System.out.println("El archivo ya existe");
                }

                try (FileWriter writer = new FileWriter(archivo, true)) { // 'true' para agregar contenido al archivo
                    writer.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
                    writer.write("Edad del cliente: " + cliente.getEdad() + " años" + "\n");
                    writer.write("Fecha de la venta: " + fechaVenta + "\n");
                    writer.write("Nombre de la venta: " + nombreVenta + "\n");
                }
                return true;

            } catch (IOException e) {
                System.out.println("Error en la creación del archivo");
                e.printStackTrace();
                return false;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento ilegal: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
