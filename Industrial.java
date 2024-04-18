// Aluno: Victor Gabriel Lucio || RA: A2575302


public abstract class Industrial extends Robo {
    private int id;
    protected int consumoEnergia;
    private String nomeIndustria;
    private boolean condicao;
    protected ConexaoHidraulica conexao;

    // Construtores
    public Industrial() {
        nomeIndustria = "Indefinido";
        consumoEnergia = 0;
        conexao = new ConexaoHidraulica();
    }

    // Getters
    public String getNomeIndustria() {
        return nomeIndustria;
    }
    
    public ConexaoHidraulica getConexao() {
        return conexao;
    }
    
    public int getId() {
        return id;
    }
    
    public boolean getCondicao() {
        return condicao;
    }

    // Setters
    public void setNomeIndustria(String industria) {
        this.nomeIndustria = industria;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void setConexao(ConexaoHidraulica conexao) {
        this.conexao = conexao;
    }
    
    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }
    
    // Methods
    public int getConsumoEnergia() {
        calcConsumoEnergia();
        return consumoEnergia;
    }
    
    private void calcConsumoEnergia() {
        int potencia = conexao.getFluxoFluido() * conexao.getPressao() / 600;
        this.consumoEnergia = potencia / 24; // 24 horas de funcionamento
    }
}
