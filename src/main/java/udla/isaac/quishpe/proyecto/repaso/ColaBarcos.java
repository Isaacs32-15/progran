package udla.isaac.quishpe.proyecto.repaso;

import java.util.LinkedList;
import java.util.Queue;

public class ColaBarcos {

    private Queue<BarcoNombresCompleto> cola;

    public ColaBarcos() {
        cola = new LinkedList<>();
    }

    // Encolar
    public void encolar(BarcoNombresCompleto b) {
        cola.add(b);
    }
        //desencolar
 public String desencolarTexto() {

    if (cola.isEmpty()) {
        return "No hay barcos";
    }

    BarcoNombresCompleto b = cola.poll();

    return "Se eliminó:\n" + b;
}
 
 public String verPrimero() {

    if (cola.isEmpty()) {
        return "No hay barcos";
    }

    return "Primero en la cola:\n" + cola.peek();
}
    // R1: llenar cola
    public void llenarCola() {
        cola.clear();

        encolar(new BarcoNombresCompleto());
        encolar(new BarcoNombresCompleto("A1", "Toyota", 2010, "Velero"));
        encolar(new BarcoNombresCompleto("A2", "Mazda", 2015, "Yate"));
        encolar(new BarcoNombresCompleto("A3", "Toyota", 2005, "Lancha"));
        encolar(new BarcoNombresCompleto("A4", "Nissan", 2020, "Velero"));
    }

    // Mostrar
    public String mostrarCola() {
        String texto = "";

        for (BarcoNombresCompleto b : cola) {
            texto += b + "\n";
        }

        return texto.isEmpty() ? "No hay barcos" : texto;
    }

    // R2: calcular costos
    public String calcularCosto() {

        String texto = "";

        for (BarcoNombresCompleto b : cola) {

            if (b.anio < 1950 || b.anio > 2024) {
                texto += "Año inválido\n";
                continue;
            }

            int antiguedad = 2024 - b.anio;
            int costo = 0;

            if (b.tipo.equals("Velero"))
                costo = antiguedad * 200;
            else if (b.tipo.equals("Yate"))
                costo = antiguedad * 300;
            else if (b.tipo.equals("Lancha"))
                costo = antiguedad * 100;

            texto += b + "\n";
            texto += "Antigüedad: " + antiguedad + "\n";
            texto += "Costo: $" + costo + "\n";
            texto += "-------------\n";
        }

        return texto;
    }

    // R3: copiar por marca
    public String copiarPorMarca(String marcaBuscar) {

        Queue<BarcoNombresCompleto> nueva = new LinkedList<>();
        String texto = "";

        for (BarcoNombresCompleto b : cola) {
            if (b.marca.equalsIgnoreCase(marcaBuscar)) {
                nueva.add(b);
            }
        }

        texto += "COLA ORIGINAL:\n";
        for (BarcoNombresCompleto b : cola) {
            texto += b + "\n";
        }

        texto += "\nCOLA COPIADA:\n";
        for (BarcoNombresCompleto b : nueva) {
            texto += b + "\n";
        }

        return texto;
    }
}