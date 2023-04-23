import java.util.ArrayList;
import java.util.List;

class Ronda {
    private List<Partido> partidos;
    private List<Resultado> resultados;

    public Ronda(List<Partido> partidos, List<Resultado> resultados) {
        this.partidos = partidos;
        this.resultados = resultados;
    }

    public int calcularPuntaje(Pronostico pronostico) {
        int puntaje = 0;
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            Resultado resultado = resultados.get(i);
            ResultadoEnum resultadoPronosticado = pronostico.getResultado();

            // Comparar resultado con pronóstico
            // Acumular puntaje
        }
        return puntaje;
    }
}