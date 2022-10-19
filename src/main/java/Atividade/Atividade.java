
package Atividade;

import javax.swing.JOptionPane;


public class Atividade{

    public static void main(String[] args) {
        int pessoas = 0;
        int votosze = 0;
        int votosrita = 0;
        int contador = 1;
        int naosabem = 0;
        
        JOptionPane.showMessageDialog(null, "Sistema de Pesquisa Eleitoral.");
        
        String amountStr = JOptionPane.showInputDialog
        (null, "Qual será a quantidade de pessoas entrevistadas?");
        pessoas = Integer.parseInt(amountStr);

        while(contador <= pessoas){
            String optionVoted = JOptionPane.showInputDialog
        (null, "Qual candidato você deseja votar?\n 1 - Zé da Farmácia\n 2 - Rita da Padaria");
            switch(optionVoted) {
                case "1":
                    votosze += 1;
                    break;
                case "2":
                    votosrita += 1;
                    break;
                default:
                    naosabem += 1;
                    break;
            }
            contador++;
        }
        double totalZe = (100 / pessoas) * votosze;
        double totalRita = (100 / pessoas) * votosrita;

        JOptionPane.showMessageDialog
        (null, "Zé da Farmácia recebeu "+votosze+" votos,\nque corresponde a "+totalZe+"% dos votos válidos.");
        JOptionPane.showMessageDialog
        (null, "Rita da Padaria recebeu "+votosrita+" votos,\nque corresponde a "+totalRita+"% dos votos válidos.");
        JOptionPane.showMessageDialog(
                null, "Não votaram, não sabiam ou anularam:" + naosabem+" votos");
        
    }
}