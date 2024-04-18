// Aluno: Victor Gabriel Lucio || RA: A2575302

public final class Articulado extends Industrial {
    
    private int velocidade;
    private String funcao;
    private int qntdEixos;

    // Construtores
    public Articulado() {
        velocidade = 20; // metros
        qntdEixos = 0;
        funcao = "Indefinido";
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getQntdEixos() {
        return qntdEixos;
    }

    public String getFuncao() {
        return funcao;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setQntdEixos(int qntdEixos) {
        this.qntdEixos = qntdEixos;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
