public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();

        cliente1.setEdad(25);
        cliente1.setNombre("Victor");
        cliente1.setTelefono(755859424);

        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Nombre del Cliente: " + cliente1.getNombre());
        System.out.println("Telefono del cliente: " + cliente1.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private long telefono;


    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public long getTelefono() {
        return telefono;
    }

}
class Cliente extends Persona {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }
}
class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}