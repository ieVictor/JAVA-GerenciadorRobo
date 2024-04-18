// Aluno: Victor Gabriel Lucio || RA: A2575302


public final class ConexaoHidraulica {
    private int pressao;
    private int fluxoFluido;
    private int vazao;
    

    // Construtores
    public ConexaoHidraulica() {
        pressao = 0;
        fluxoFluido = 0;
        vazao = 0;
    }
    
    // Getters
    public int getPressao() {
        return pressao;
    }

    public int getVazao() {
        return vazao;
    }
    
    public int getFluxoFluido() {
        return fluxoFluido;
    }

    // Setters
    public void setPressao(int pressao) throws ConexaoHidraulicaException {
        if (pressao <= 0) throw new ConexaoHidraulicaException(
                "A pressão deve ser um número positivo"
        );
        
        this.pressao = pressao;
    }

    public void setVazao(int vazao) throws ConexaoHidraulicaException {
        if (vazao <= 0) throw new ConexaoHidraulicaException(
                "A vazão deve ser um número positivo!"
        );
        
        this.vazao = vazao;
    }
    
    public void setFluxoFluido(int fluxoFluido) throws ConexaoHidraulicaException {
        if (fluxoFluido <= 0) throw new ConexaoHidraulicaException(
                "O fluxo de fluído deve ser um número positivo"
        );
        
        this.fluxoFluido = fluxoFluido;  
    }
}
