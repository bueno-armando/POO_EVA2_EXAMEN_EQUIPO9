package problema_3;

/**
 *
 * @author IceCreamSandwich
 */
public abstract class Empleados {
    private String ID;
    private String nombre;
    //uso de "protected" para usar la variable salario en la
    //implementación de la clase calcularSalario()d
    protected double salario;
    
    // GETTERS Y SETTERS
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //CONSTRUCTOR DEFAULT
    public Empleados() {
        this.ID = "00000000";
        this.nombre = "No Registrado";
        this.salario = -1;
    }

    //CONSTRUCTOR CON ARGUMENTOS
    public Empleados(String ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //MÉTODO ABSTRACTO "calcularSalario"
    public abstract double calcularSalario();
}
