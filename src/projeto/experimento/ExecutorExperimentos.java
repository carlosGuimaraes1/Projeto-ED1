package projeto.experimento;

import projeto.algoritmos.*;
import projeto.modelo.Resultado;
import projeto.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExecutorExperimentos {

    private static final int REPETICOES = 3;

    private static final int[] TAMANHOS = {
            1000,
            5000,
            10000,
            15000,
            20000,
            25000,
            30000,
            35000,
            40000,
            45000,
            50000
    };

    public static void executar() {

        aquecerJVM();

        List<Resultado> resultadosGerais =
                new ArrayList<>();

        for (int n : TAMANHOS) {

            System.out.println();
            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "Tamanho do vetor: " + n
            );

            System.out.println(
                    "======================================"
            );

            // VETOR A
            int[] vetorA =
                    GeradorVetores.getVetorCrescente(n);

            executarTipoVetor(
                    vetorA,
                    "A",
                    resultadosGerais
            );

            // VETOR B
            int[] vetorB =
                    GeradorVetores.getVetorDecrescente(n);

            executarTipoVetor(
                    vetorB,
                    "B",
                    resultadosGerais
            );

            // VETOR C
            int[] vetorC =
                    GeradorVetores.getVetorAleatorio(n);

            executarTipoVetor(
                    vetorC,
                    "C",
                    resultadosGerais
            );
        }

        ExportadorCSV.salvar(
                resultadosGerais,
                "resultados.csv"
        );

        System.out.println();
        System.out.println(
                "Total de resultados: "
                        + resultadosGerais.size()
        );
    }

    private static void executarTipoVetor(
            int[] vetorOriginal,
            String tipo,
            List<Resultado> resultadosGerais
    ) {

        System.out.println();
        System.out.println(
                "Vetor tipo: " + tipo
        );

        Resultado bolha =
                executarBolha(
                        vetorOriginal,
                        tipo
                );

        Resultado bolhaOtimizado =
                executarBolhaOtimizado(
                        vetorOriginal,
                        tipo
                );

        Resultado insercao =
                executarInsercao(
                        vetorOriginal,
                        tipo
                );

        Resultado selecao =
                executarSelecao(
                        vetorOriginal,
                        tipo
                );

        resultadosGerais.add(bolha);
        resultadosGerais.add(bolhaOtimizado);
        resultadosGerais.add(insercao);
        resultadosGerais.add(selecao);

        System.out.println(bolha);
        System.out.println(bolhaOtimizado);
        System.out.println(insercao);
        System.out.println(selecao);
    }

    private static Resultado executarBolha(
            int[] original,
            String tipo
    ) {

        Resultado referencia = null;

        double somaTempos = 0;

        for (int i = 0; i < REPETICOES; i++) {

            int[] copia =
                    Arrays.copyOf(
                            original,
                            original.length
                    );

            Resultado atual =
                    Bolha.ordenar(
                            copia,
                            tipo
                    );

            somaTempos += atual.getTempoMs();

            if (referencia == null) {
                referencia = atual;
            }
        }

        referencia.setTempoMs(
                somaTempos / REPETICOES
        );

        return referencia;
    }

    private static Resultado executarBolhaOtimizado(
            int[] original,
            String tipo
    ) {

        Resultado referencia = null;

        double somaTempos = 0;

        for (int i = 0; i < REPETICOES; i++) {

            int[] copia =
                    Arrays.copyOf(
                            original,
                            original.length
                    );

            Resultado atual =
                    BolhaOtimizado.ordenar(
                            copia,
                            tipo
                    );

            somaTempos += atual.getTempoMs();

            if (referencia == null) {
                referencia = atual;
            }
        }

        referencia.setTempoMs(
                somaTempos / REPETICOES
        );

        return referencia;
    }

    private static Resultado executarInsercao(
            int[] original,
            String tipo
    ) {

        Resultado referencia = null;

        double somaTempos = 0;

        for (int i = 0; i < REPETICOES; i++) {

            int[] copia =
                    Arrays.copyOf(
                            original,
                            original.length
                    );

            Resultado atual =
                    Insercao.ordenar(
                            copia,
                            tipo
                    );

            somaTempos += atual.getTempoMs();

            if (referencia == null) {
                referencia = atual;
            }
        }

        referencia.setTempoMs(
                somaTempos / REPETICOES
        );

        return referencia;
    }

    private static Resultado executarSelecao(
            int[] original,
            String tipo
    ) {

        Resultado referencia = null;

        double somaTempos = 0;

        for (int i = 0; i < REPETICOES; i++) {

            int[] copia =
                    Arrays.copyOf(
                            original,
                            original.length
                    );

            Resultado atual =
                    Selecao.ordenar(
                            copia,
                            tipo
                    );

            somaTempos += atual.getTempoMs();

            if (referencia == null) {
                referencia = atual;
            }
        }

        referencia.setTempoMs(
                somaTempos / REPETICOES
        );

        return referencia;
    }

    private static void aquecerJVM() {

        System.out.println(
                "Realizando aquecimento da JVM..."
        );

        int[] vetor =
                GeradorVetores.getVetorAleatorio(1000);

        Bolha.ordenar(
                vetor.clone(),
                "AQUECIMENTO"
        );

        BolhaOtimizado.ordenar(
                vetor.clone(),
                "AQUECIMENTO"
        );

        Insercao.ordenar(
                vetor.clone(),
                "AQUECIMENTO"
        );

        Selecao.ordenar(
                vetor.clone(),
                "AQUECIMENTO"
        );

        System.out.println(
                "Aquecimento concluido."
        );
    }
}
