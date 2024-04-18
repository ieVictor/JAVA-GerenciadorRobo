// Aluno: Victor Gabriel Lucio || RA: A2575302


public final class Bateria {
    private String tipo;
    private int carga;
    private int capacidade;
    private int voltagem;
    private int temperatura;

    // Construtores
    public Bateria() {
        tipo = "Indefinido";
        carga = 200;
        capacidade = 250;
        voltagem = 12;
        temperatura = 20;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }
    
    public int getCarga() {
        return carga;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public int getTemperatura() {
        return temperatura;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCarga(int carga) throws BateriaException {
        if (carga < 0) {
            throw new BateriaException("A carga deve ser positiva!");
        } 
        
        this.carga = carga;
    }

    public void setCapacidade(int capacidade) throws BateriaException {
        if (capacidade < 0) {
            throw new BateriaException("A capacidade deve ser positiva!");
        }
        
        this.capacidade = capacidade;
    }
    
    public void setVoltagem(int voltagem) throws BateriaException {
        if (voltagem < 0) {
            throw new BateriaException("A voltagem deve ser positiva!");
        }
        
        this.voltagem = voltagem;
    }

    public void setTemperatura(int temperatura) throws BateriaException {
        if (temperatura > 60) {
            throw new BateriaException(temperatura + "ºC é muito quente, a bateria não aguentaria!");
        }
        else if (temperatura < -5) {
            throw new BateriaException(temperatura + "ºC é muito frio, pode causar mal funcionamento!");
        }
        this.temperatura = temperatura;
    }
}
