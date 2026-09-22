/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_instituto_innova;

/**
 *
 * @author UCA40403
 */
public class Alumno {
   private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nivelSocioeconomico;
    private String tipoBeca;
    private double pensionBase;
    private double pensionFinal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }

    public double getPensionBase() {
        return pensionBase;
    }

    public void setPensionBase(double pensionBase) {
        this.pensionBase = pensionBase;
    }

    public double getPensionFinal() {
        return pensionFinal;
    }

    public void setPensionFinal(double pensionFinal) {
        this.pensionFinal = pensionFinal;
    }
    
    private void calcularPensionFinal() {
        if (this.tipoBeca != null) {
            if (this.tipoBeca.equalsIgnoreCase("Total")) {
                this.pensionFinal = 0;
            } else if (this.tipoBeca.equalsIgnoreCase("Parcial")) {
                this.pensionFinal = this.pensionBase * 0.50; // 50% de descuento
            } else {
                this.pensionFinal = this.pensionBase; // Sin beca
            }
        }
        
    }
     public void verDatos() {
        System.out.println("NOMBRE: " + this.nombre + " | DOC: " + this.tipoDocumento + 
                " (" + this.numeroDocumento + ") | NIVEL: " + this.nivelSocioeconomico + 
                " | BECA: " + this.tipoBeca + " | PENSION A PAGAR: S/ " + this.pensionFinal);
    }
}
