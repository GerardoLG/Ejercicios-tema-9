public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Fulano");
        cliente.setEdad(30);
        cliente.setNumeroTelefono("123 456 7890");
        cliente.setCredito(5000);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNumeroTelefono());
        System.out.println(cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Sultano");
        trabajador.setEdad(25);
        trabajador.setNumeroTelefono("987 654 3210");
        trabajador.setSalario(25000);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNumeroTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    private String nombre;
    private String numeroTelefono;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}