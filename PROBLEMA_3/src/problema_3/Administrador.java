package problema_3;

/**
 *
 * @author IceCreamSandwich
 */

public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono {
    //ATRIBUTOS
    public double porcentajeDelBono;

    //GETTER Y SETTER
    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }
    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

    //CONSTRUCTOR DEFAULT
    public Administrador() {
        super();
        this.porcentajeDelBono = 0;
    }
    
    //CONSTRUCTOR CON ARGUMENTOS
    public Administrador(double porcentajeDelBono, String ID, String nombre, double salario) {
        super(ID, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
    //IMPLEMENTACIÓN MÉTODO calcularBono()
    @Override
    public double calcularBono(){
        return porcentajeDelBono * super.salario;
    }
    
    //IMPLEMENTACIÓN MÉTODO calcularSalario()
    @Override
    public double calcularSalario(){
        super.salario += calcularBono();
        return salario;
    }
    
    // (ADICIONAL) IMPLEMENTACIÓN toString() para
    // visualización más amigable de datos
    @Override
    public String toString(){
        String msg =
        "\n---------------------------"+
        "\nID: "+super.getID()+
        "\nNombre: "+super.getNombre()+
        "\nSalario: "+super.getSalario()+
        "\nPorcentaje del bono: "+porcentajeDelBono+
        "\n*** Salario procesado: "+calcularSalario()+
        "\n---------------------------";
        
        return msg;
    }
}
