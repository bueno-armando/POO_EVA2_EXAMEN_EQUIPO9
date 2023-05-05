package problema_3;

/**
 *
 * @author IceCreamSandwich
 */
public class EmpleadoTiempoParcial extends Empleados {
    //ATRIBUTOS
    private double pagoPorHora;
    private double horasTrabajadas;

    //GETTER Y SETTER
    public double getPagoPorHora() {
        return pagoPorHora;
    }
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //CONSTRUCTOR DEFAULT
    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = -1;
        this.horasTrabajadas = -1;
    }
    
    //CONSTRUCTOR CON ARGUMENTOS
    public EmpleadoTiempoParcial(double pagoPorHora, double horasTrabajadas, 
            String ID, String nombre, double salario) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //IMPLEMENTACIÓN MÉTODO calcularSalario()
    @Override
    public double calcularSalario(){
        return pagoPorHora * horasTrabajadas;
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
        "\nPago por hora: "+pagoPorHora+
        "\nHoras trabajadas: "+horasTrabajadas+
        "\n*** Salario procesado: "+calcularSalario()+
        "\n---------------------------";
        return msg;
    }
}
