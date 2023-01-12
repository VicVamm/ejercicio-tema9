public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();


        cliente1.setEdad(25);
        cliente1.setNombre("Victor");
        cliente1.setTelefono(755859424);
        cliente1.setCredito(596699.00);

        System.out.println("soy el cliente: " + cliente1.getNombre() + ", mi edad es de " + cliente1.getEdad() + ", mi numero de telefono es: " + cliente1.getTelefono() + " y tengo un crédito de: $" + cliente1.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(40);
        trabajador.setNombre("Alfredo");
        trabajador.setTelefono(94944040);
        trabajador.setSalario(400);

        System.out.println("soy el trabajador: " + trabajador.getNombre() + ", con " + trabajador.getEdad() + " años, mi numero de telefono es: " + trabajador.getTelefono() + "y mi salario es de: $" + trabajador.getSalario() );



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
