
package seguro;

public class JubiladoPatronal extends Persona{
    
    private float porcentajeInfalcion;
    private boolean empresaPrivada;

    public JubiladoPatronal() {
    }
    
    public JubiladoPatronal(float porcentajeInfalcion, boolean empresaPrivada, String cedula, String nombre, float salarioBase, int aniosAporte) {
        super(cedula, nombre, salarioBase, aniosAporte);
        this.porcentajeInfalcion = porcentajeInfalcion;
        this.empresaPrivada = empresaPrivada;
    }        

    @Override
    public float calcularPension() {
        float jubilacion;
        jubilacion = super.calcularPension();
        jubilacion += getSalarioBase() * (porcentajeInfalcion /100);
        if(empresaPrivada){
            jubilacion += 0.1 * jubilacion;
        }else{
            jubilacion += 0.05 * jubilacion;
        }
            
        return jubilacion;
    }
    
    @Override
    public String toString(){
        String datos = "\nPatronal\n";
        datos += super.toString();
        datos += "\nPorcentaje inflacion: " + porcentajeInfalcion + "%";
        datos += "Cedula: " + cedula +
                "\nNombre: " + nombre +
                "\nSalario base: " + salarioBase +
                "\nAños de aporte: " + aniosAporte;
        if(empresaPrivada){
            datos += "\nEmpresa: privada";
        }else{
            datos += "\nEmpresa: publica";
        }
        datos += "\nPension: " + calcularPension();
        return datos;
    }

    public float getPorcentajeInfalcion() {
        return porcentajeInfalcion;
    }

    public void setPorcentajeInfalcion(float porcentajeInfalcion) {
        this.porcentajeInfalcion = porcentajeInfalcion;
    }

    public boolean isEmpresaPrivada() {
        return empresaPrivada;
    }

    public void setEmpresaPrivada(boolean empresaPrivada) {
        this.empresaPrivada = empresaPrivada;
    }
}
