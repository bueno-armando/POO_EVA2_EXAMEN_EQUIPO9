package problema_3;

/**
 *
 * @author IceCreamSandwich
 */

public class PROBLEMA_3 {

    public static void main(String[] args) {        
        //TEST: EMPLEADO TIEMPO PARCIAL
        EmpleadoTiempoParcial empleadoTP_1 = new EmpleadoTiempoParcial(
                220, 50, "DRC2918", "Julian Gonzo", 1000);
        System.out.println(empleadoTP_1);
        
        //TEST: EMPLEADO TIEMPO COMPLETO
        EmpleadoTiempoCompleto empleadoTC_1 = 
                new EmpleadoTiempoCompleto("UMDG59", "Lionel Banderas", 1000);        
        System.out.println(empleadoTC_1);
        
        //TEST: ADMINISTRADOR
        Administrador admin_1 = 
                new Administrador(0.35, "TRMF22", "Tomás Puentes", 2000);        
        System.out.println(admin_1);
    }
    
}
