package pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Veiculo> listVeiculos;
    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listVeiculos = new ArrayList<>();
    }

    public void gravaArquivo(Veiculo v) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);

            escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca() + ","
                    + v.getAnoFabricacao() + "," + v.getQuilometragem());
            escritor.newLine();

            escritor.close();
            arqw.close();

            System.out.println("Veiculo salvo no arquivo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gravaListaCompleta(List<Veiculo> lista) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqw);

            for (Veiculo v : lista) {
                escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca() + ","
                        + v.getAnoFabricacao() + "," + v.getQuilometragem());
                escritor.newLine();
            }

            escritor.close();
            arqw.close();

            System.out.println("Arquivo atualizado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Veiculo> leArquivo() {
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String placa = campos[0];
                String modelo = campos[1];
                String marca = campos[2];
                int ano = Integer.parseInt(campos[3]);
                double km = Double.parseDouble(campos[4]);

                Veiculo v = new Veiculo(placa, modelo, marca, ano, km);
                listVeiculos.add(v);
            }

            leitor.close();
            arqr.close();
        } catch (IOException e) {
            System.out.println("Arquivo ainda nao existe ou esta vazio.");
        }
        return listVeiculos;
    }
}
