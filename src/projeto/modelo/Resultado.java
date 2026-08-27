package projeto.modelo;

public class Resultado {

    private String algoritmo;
    private String tipoVetor;
    private int n;
    private long comparacoes;
    private long trocas;
    private double tempoMs;

    public Resultado() {
    }

    public Resultado(
            String algoritmo,
            String tipoVetor,
            int n,
            long comparacoes,
            long trocas,
            double tempoMs
    ) {
        this.algoritmo = algoritmo;
        this.tipoVetor = tipoVetor;
        this.n = n;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
        this.tempoMs = tempoMs;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getTipoVetor() {
        return tipoVetor;
    }

    public void setTipoVetor(String tipoVetor) {
        this.tipoVetor = tipoVetor;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(long comparacoes) {
        this.comparacoes = comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    public void setTrocas(long trocas) {
        this.trocas = trocas;
    }

    public double getTempoMs() {
        return tempoMs;
    }

    public void setTempoMs(double tempoMs) {
        this.tempoMs = tempoMs;
    }

    @Override
    public String toString() {
        return algoritmo
                + " | vetor " + tipoVetor
                + " | n = " + n
                + " | comparacoes = " + comparacoes
                + " | trocas = " + trocas
                + " | tempo(ms) = " + tempoMs;
    }
}
