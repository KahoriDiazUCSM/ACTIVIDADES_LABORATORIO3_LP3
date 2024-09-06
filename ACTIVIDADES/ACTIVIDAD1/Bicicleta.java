package actividad1;

public class Bicicleta implements Vehículo {

    private String marca;
    private String nombre;

    public Bicicleta() {
        this.marca = "";
        this.nombre = "";
    }

    public Bicicleta(String marca, String nombre) {
        setMarca(marca);
        setNombre(nombre);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            this.marca = "Desconocida";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
    }

    @Override
    public void acelerar() {
        System.out.println(nombre + " está acelerando pedaleando.");
    }

    @Override
    public void frenar() {
        System.out.println(nombre + " está frenando.");
    }
}
