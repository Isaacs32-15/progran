/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udla.isaac.quishpe.proyecto.repaso;

/**
 *
 * @author ISSAC
 */
public class BarcoNombresCompleto {
    String matricula;
    String marca;
    int anio;
    String tipo;

    public BarcoNombresCompleto() {
        matricula="A224D";
        marca="Susuki";
        anio= 2014;
        tipo="velero";
    }

    public BarcoNombresCompleto(String matricula, String marca, int anio, String tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return matricula + "-"+ marca+"-"+anio+"-"+tipo;
    }
    
    
}
