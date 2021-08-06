
package seguro;

public class JubiladoDiscapacidad extends Persona{
    
    private float porcentajeDiscapacidad;

    public JubiladoDiscapacidad() {
    }

    public JubiladoDiscapacidad(float porcentajeDiscapacidad, String cedula, String nombre, float salarioBase, int aniosAporte) {
        super(cedula, nombre, salarioBase, aniosAporte);
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }
    
    @Override
    public float calcularPension() {
        float jubilacion;
        jubilacion = super.calcularPension();
        jubilacion += getSalarioBase() * (porcentajeDiscapacidad /100);
            
        return jubilacion;
    }

    public float getPorcentajeDiscapacidad() {
        return porcentajeDiscapacidad;
    }

    public void setPorcentajeDiscapacidad(float porcentajeDiscapacidad) {
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }
    
    @Override
    public String toString(){
        String datos;
        datos = "\nDiscapacidad\n";
        datos += "Cedula: " + cedula +
                "\nNombre: " + nombre +
                "\nSalario base: " + salarioBase +
                "\nAños de aporte: " + aniosAporte;
        datos += super.toString();
        datos += "\nPorcentaje discapacidad: " + porcentajeDiscapacidad + "%";
        datos += "\nPension: " + calcularPension();
        return datos;
    }
    
    
    
}
