package problema_3;

/**
 *
 * @author IceCreamSandwich
 */
public class EmpleadoTiempoCompleto extends Empleados{

    //CONSTRUCTOR DEFAULT
    public EmpleadoTiempoCompleto() {
        super();
    }
    
    //CONSTRUCTOR CON ARGUMENTOS
    public EmpleadoTiempoCompleto(String ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }
    
    //IMPLEMENTACIÓN MÉTODO calcularSalario()
    @Override
    public double calcularSalario(){
        return super.salario;
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
        "\n*** Salario procesado: "+calcularSalario()+
        "\n---------------------------";
        
        return msg;
    }
}
