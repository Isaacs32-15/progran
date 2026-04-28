import java.util.LinkedList;
import udla.isaac.quishpe.proyecto.repaso.BarcoNombresCompleto;

class ListaBarcos {

    LinkedList<BarcoNombresCompleto> lista = new LinkedList<>();

    // agregar al final
    public void agregar(BarcoNombresCompleto b) {
        lista.add(b);
    }

    // insertar en posición
    public void insertar(int pos, BarcoNombresCompleto b) {
        if (pos >= 0 && pos <= lista.size()) {
            lista.add(pos, b);
        }
    }

    // eliminar por matrícula
    public void eliminar(String matricula) {
        lista.removeIf(b -> b.matricula.equalsIgnoreCase(matricula));
    }

    // buscar
    public String buscar(String marca) {
        for (BarcoNombresCompleto b : lista) {
            if (b.marca.equalsIgnoreCase(marca)) {
                return "Encontrado:\n" + b;
            }
        }
        return "No encontrado";
    }

    // método extra típico: ordenar por año
    public void ordenarPorAnio() {
        lista.sort((a, b) -> a.anio - b.anio);
    }

    public String mostrar() {
        String txt = "";
        for (BarcoNombresCompleto b : lista) {
            txt += b + "\n";
        }
        return txt;
    }
}