package pkg;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> lista = arquivo.leArquivo();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== CADASTRO DE VEICULOS =====");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Alterar quilometragem do veiculo");
            System.out.println("3 - Excluir veiculo pela placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");

            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {

                System.out.print("Placa: ");
                String placa = teclado.nextLine();

                System.out.print("Modelo: ");
                String modelo = teclado.nextLine();

                System.out.print("Marca: ");
                String marca = teclado.nextLine();

                System.out.print("Ano de fabricacao: ");
                int ano = Integer.parseInt(teclado.nextLine());

                System.out.print("Quilometragem: ");
                double km = Double.parseDouble(teclado.nextLine());

                Veiculo v = new Veiculo(placa, modelo, marca, ano, km);

                try {
                    Socket s = new Socket("localhost", 1234);
                    System.out.println("Conexao estabelecida com sucesso");

                    ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(s.getInputStream());

                    out.writeObject(v);

                    String resposta = (String) in.readObject();
                    System.out.println("Resposta do servidor: " + resposta);

                    if (resposta.startsWith("SUCESSO")) {
                        lista.add(v);
                    }

                    s.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (opcao == 2) {

                System.out.print("Digite a placa do veiculo: ");
                String placa = teclado.nextLine();

                boolean encontrado = false;
                for (Veiculo v : lista) {
                    if (v.getPlaca().equalsIgnoreCase(placa)) {
                        System.out.print("Nova quilometragem: ");
                        double novaKm = Double.parseDouble(teclado.nextLine());
                        v.setQuilometragem(novaKm);
                        arquivo.gravaListaCompleta(lista);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Veiculo com placa " + placa + " nao encontrado.");
                }

            } else if (opcao == 3) {

                System.out.print("Digite a placa do veiculo a excluir: ");
                String placa = teclado.nextLine();

                Veiculo aRemover = null;
                for (Veiculo v : lista) {
                    if (v.getPlaca().equalsIgnoreCase(placa)) {
                        aRemover = v;
                        break;
                    }
                }

                if (aRemover != null) {
                    lista.remove(aRemover);
                    arquivo.gravaListaCompleta(lista);
                    System.out.println("Veiculo removido com sucesso.");
                } else {
                    System.out.println("Veiculo com placa " + placa + " nao encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema. Ate logo!");
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        teclado.close();
    }
}
