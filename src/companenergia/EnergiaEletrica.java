package companenergia;

import javax.swing.JOptionPane;

public class EnergiaEletrica {
    private String nome;
    private String endereco;
    private double leituraAtual; //leitura1
    private double leituraAnterior; //leitura2
    private double tusd; //tusd
    private double te; //te
    private double conta; //icms
    private double sub;   //diferenca
    private double cobranca; //acrescimo
    private String verificarBandeira; //bandeira
    private double semBandeira; //totalSemBandeira
    private double comBandeira; //totalComBandeira
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
        this.leituraAtual = leituraAtual;
    }
    
    public double getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(double leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }
    
    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }
    
    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }
    
    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }
    
    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }
    
    public double getCobranca() {
        return cobranca;
    }

    public void setCobranca(double cobranca) {
        this.cobranca = cobranca;
    }
    
    public String getVerificarBandeira() {
        return verificarBandeira;
    }

    public void setVerificarBandeira(String verificarBandeira) {
        this.verificarBandeira = verificarBandeira;
    }
    
    public double getSemBandeira() {
        return semBandeira;
    }

    public void setSemBandeira(double semBandeira) {
        this.semBandeira = semBandeira;
    }

    public double getComBandeira() {
        return comBandeira;
    }

    public void setComBandeira(double comBandeira) {
        this.comBandeira = comBandeira;
    }
    
    public double getBandeiraFinal() {
        return comBandeira;
    }

    public void setTotalBandeira(double bandeiraFinal) {
        this.comBandeira = bandeiraFinal;
    }
    
    public double subtracao(double leituraAnterior, double leituraAtual){    
        this.sub = this.leituraAtual - this.leituraAnterior;
        return this.sub;        
    }
        
    public double tusd1(double sub){
        this.tusd = this.sub * 0.30;
        return this.tusd;
    }
        
    public double te1(double sub){
        this.te = this.sub * 0.29;
        return this.te;
    } 
    
    public double somatusdte(double tusd, double te){
        this.semBandeira = this.tusd + this.te;
        return this.semBandeira;
    }
    
    public double conta(double semBandeira){
        this.conta = this.semBandeira * 0.25;
        this.conta = this.conta + this.semBandeira;
        return conta;
    }
    
    public String verificarBandeira(double sub){
        if (this.sub < 100) {
            this.verificarBandeira = "Verde";
        }
        else if (this.sub > 101 && this.sub < 150) {
            this.verificarBandeira = "Amarelo";
        }
        else if (this.sub > 150 && this.sub < 200) {
            this.verificarBandeira = "Vermelho Patamar 1";
        }
        else {
            this.verificarBandeira = "Vermelho Patamar 2";
        }
        return this.verificarBandeira;
    }
    
    public double cobranca(String verificarBandeira, double conta){
        if ("Verde".equals(this.verificarBandeira)) {
            this.cobranca = 1;
        }
        
        if ("Amarelo".equals(this.verificarBandeira)) {
            this.cobranca = 0.04169;
        }
        
        if ("Vermelho Patamar 1".equals(this.verificarBandeira)) {
            this.cobranca = 0.04169;
        }
        
        if ("Vermelho Patamar 2".equals(this.verificarBandeira)) {
            this.cobranca = 0.06243;
        }
        return this.cobranca;
    }
    
    public double imprimirConta(double conta){
        this.comBandeira = this.conta * this.cobranca;
        this.comBandeira = this.comBandeira+this.conta;
        return this.comBandeira;
    }
    
    void recibo(double leituraAtual, double leituraAnterior, double sub, double semBandeira, String verificarBandeira, double bandeiraFinal) {
        JOptionPane.showMessageDialog(null,
                "Nome do propretário: " + this.nome
                + "\nEndereço da propriedade: " + this.endereco
                + "\nLeitura antiga: " + this.leituraAnterior 
                + "\nLeitura atual: " + this.leituraAtual
                + "\nTotal gasto: " + this.sub
                + "\nBandeira: " + this.verificarBandeira
                + "\nTotal sem bandeira: " + this.semBandeira
                + "\nTotal com bandeira " + this.comBandeira);
    }

}
