    package udla.isaac.quishpe.proyecto.repaso;

import java.util.ArrayList;

public class ColaBarcos {

    ArrayList<BarcoNombresCompleto> cola;

    public ColaBarcos() {
        cola = new ArrayList<>();
    }

    // Encolar
    public void encolar(BarcoNombresCompleto b) {
        cola.add(b);
    }

    // Desencolar
    public BarcoNombresCompleto desencolar() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.remove(0);
    }

    // R1: llenar cola
    public void llenarCola() {

        cola.clear(); // limpia antes

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

        return texto;
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

        ColaBarcos nueva = new ColaBarcos();
        String texto = "";

        for (BarcoNombresCompleto b : cola) {
            if (b.marca.equalsIgnoreCase(marcaBuscar)) {
                nueva.encolar(b);
            }
        }

        texto += "COLA ORIGINAL:\n";
        for (BarcoNombresCompleto b : cola) {
            texto += b + "\n";
        }

        texto += "\nCOLA COPIADA:\n";
        for (BarcoNombresCompleto b : nueva.cola) {
            texto += b + "\n";
        }

        return texto;
    }
}