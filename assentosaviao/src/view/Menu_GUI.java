package view;

import javax.swing.JOptionPane;
import model.Funcoes_DAO;

public class Menu_GUI {
    public static void menu() {
        while (true) {
            // Solicitar a escolha do usuário e exibir os assentos disponíveis
            String opcao = JOptionPane.showInputDialog(null, Funcoes_DAO.exibirAssentosDisponiveis() +
                    "\nSelecione uma opção:\n1 - Reservar assento\n2 - Remover reserva\n0 - Encerrar o sistema");

            switch (opcao) {
                case "1":
                    int assentoReserva = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento que deseja reservar:"));
                    Funcoes_DAO.adicionarReserva(assentoReserva);
                    break;
                case "2":
                    int assentoRemocao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento que deseja remover a reserva:"));
                    Funcoes_DAO.removerReserva(assentoRemocao);
                    break;
                case "0":
                    Funcoes_DAO.encerrarSistema();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
