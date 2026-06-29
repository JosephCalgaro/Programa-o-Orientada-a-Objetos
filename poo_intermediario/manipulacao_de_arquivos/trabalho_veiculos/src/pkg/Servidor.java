package pkg;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> lista = arquivo.leArquivo();

        try {
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Socket servidor criado com sucesso");

            while (true) {

                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado.");

                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Veiculo v = (Veiculo) in.readObject();

                System.out.println("Recebi veiculo: " + v.getPlaca() + " - " + v.getModelo());

                boolean placaDuplicada = false;
                for (Veiculo existente : lista) {
                    if (existente.getPlaca().equalsIgnoreCase(v.getPlaca())) {
                        placaDuplicada = true;
                        break;
                    }
                }

                String resposta;
                if (placaDuplicada) {
                    resposta = "ERRO: Placa " + v.getPlaca() + " ja cadastrada.";
                } else {
                    lista.add(v);
                    arquivo.gravaArquivo(v);
                    resposta = "SUCESSO: Veiculo " + v.getPlaca() + " cadastrado com sucesso.";
                }

                System.out.println(resposta);
                out.writeObject(resposta);

                cliente.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
