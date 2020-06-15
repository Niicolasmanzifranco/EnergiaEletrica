package companenergia;

import javax.swing.JOptionPane;

public class CompanEnergia {

    public static void main(String[] args) {
        //CLASSE PRNCIPAL
        EnergiaEletrica dados = new EnergiaEletrica();
        dados.setNome((JOptionPane.showInputDialog("Proprietário: ")));
        dados.setEndereco((JOptionPane.showInputDialog("Endereço da propriedade: ")));
        dados.setLeituraAnterior(Double.parseDouble(JOptionPane.showInputDialog("Digite qual a leitura anterior: ")));
        dados.setLeituraAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite qual a leitura atual: ")));
        
        dados.subtracao(dados.getLeituraAtual(),dados.getLeituraAnterior());
        dados.te1(dados.getSub());
        dados.tusd1(dados.getSub());
        dados.somatusdte(dados.getTe(),dados.getTusd());
        dados.verificarBandeira(dados.getSub());
        dados.conta(dados.getSemBandeira());
        dados.cobranca(dados.getVerificarBandeira(),dados.getConta());
        dados.imprimirConta(dados.getConta());
        dados.recibo(dados.getLeituraAtual(),dados.getLeituraAnterior(),dados.getSub(),dados.getSemBandeira(),dados.getVerificarBandeira(),dados.getBandeiraFinal());
        
    }
    
}
