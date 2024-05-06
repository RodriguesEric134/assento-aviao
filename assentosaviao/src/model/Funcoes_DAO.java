package model;

import javax.swing.JOptionPane;

public class Funcoes_DAO {
    private static boolean[] assentos = new boolean[6];

    public static void adicionarReserva(int assento) {
        if (assento >= 1 && assento <= assentos.length) {
            if (!assentos[assento - 1]) {
                assentos[assento - 1] = true;
                JOptionPane.showMessageDialog(null, "Assento " + assento + " reservado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Assento " + assento + " já está ocupado. Por favor, escolha outro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Assento inválido. Por favor, escolha um assento válido.");
        }
    }

    public static void removerReserva(int assento) {
        if (assento >= 1 && assento <= assentos.length) {
            if (assentos[assento - 1]) {
                assentos[assento - 1] = false;
                JOptionPane.showMessageDialog(null, "Reserva do assento " + assento + " removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não há reserva no assento " + assento + ". Nenhuma ação realizada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Assento inválido. Por favor, escolha um assento válido.");
        }
    }

    public static void encerrarSistema() {
        JOptionPane.showMessageDialog(null, "Encerrando o sistema de reserva. Obrigado!");
        System.exit(0);
    }

    public static String exibirAssentosDisponiveis() {
        StringBuilder mensagem = new StringBuilder("Assentos disponíveis:\n");
        for (int i = 0; i < assentos.length; i++) {
            mensagem.append((i + 1)).append(" [").append(assentos[i] ? "x" : " ").append("]   ");
            if ((i + 1) % 2 == 0)
                mensagem.append("\n");
        }
        return mensagem.toString();
    }
}
