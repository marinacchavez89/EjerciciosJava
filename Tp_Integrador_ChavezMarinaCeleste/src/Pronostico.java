class Pronostico {
    private Partido partido;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, ResultadoEnum resultado) {
        this.partido = partido;
        this.resultado = resultado;
    }

	public ResultadoEnum getResultado() {
		return resultado;
	}

    // Agregar getters y setters si es necesario
}





