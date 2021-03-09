
package mx.unam.aragon.dp;


public class Direccion {
    private String colonia;
    private String calle;
    private String estado;
    private String cp;
    private String numero;

    public Direccion() {
    }

    public Direccion(String colonia, String calle, String estado, String cp, String numero) {
        this.colonia = colonia;
        this.calle = calle;
        this.estado = estado;
        this.cp = cp;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Direccion{" + "colonia=" + colonia + ", calle=" + calle + ", estado=" + estado + ", cp=" + cp + ", numero=" + numero + '}';
    }
    
    
}
