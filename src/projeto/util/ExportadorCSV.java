package projeto.util;

import projeto.modelo.Resultado;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class ExportadorCSV {

    public static void salvar(
            List<Resultado> resultados,
            String nomeArquivo
    ) {

        Path caminho = Path.of(nomeArquivo);

        try (
                BufferedWriter writer =
                        Files.newBufferedWriter(
                                caminho,
                                StandardCharsets.UTF_8
                        )
        ) {

            writer.write(
                    "algoritmo,tipoVetor,n,comparacoes,trocas,tempoMs"
            );

            writer.newLine();

            for (Resultado resultado : resultados) {

                String linha = String.format(
                        Locale.US,
                        "%s,%s,%d,%d,%d,%.6f",
                        resultado.getAlgoritmo(),
                        resultado.getTipoVetor(),
                        resultado.getN(),
                        resultado.getComparacoes(),
                        resultado.getTrocas(),
                        resultado.getTempoMs()
                );

                writer.write(linha);
                writer.newLine();
            }

            System.out.println();
            System.out.println(
                    "CSV criado em: "
                            + caminho.toAbsolutePath()
            );

        } catch (IOException e) {

            System.err.println(
                    "Erro ao gerar CSV: "
                            + e.getMessage()
            );
        }
    }
}
