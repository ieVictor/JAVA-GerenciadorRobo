// Aluno: Victor Gabriel Lucio || RA: A2575302

public abstract class Robo {
    private String nome;
    private String modelo;
    private String cor;

    // Construtores
    public Robo() {
        nome = "Indefinido";
        modelo = "Indefinido";
        cor = "Indefinido";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    // Setters
    public void setNome(String nome) throws RoboException {
        if (nome.length() > 15) {
            throw new RoboException("O nome deve conter menos de 15 caracteres");
        }
        else if (nome.isBlank()) {
            throw new RoboException("O campo 'Nome do robô' deve ser preenchido");
        }
               
        this.nome = nome.trim();
    }

    public void setModelo(String modelo) throws RoboException {
        if (modelo.length() > 15) {
            throw new RoboException("O modelo deve conter menos de 15 caracteres");
        }
        else if (modelo.isBlank()) {
            throw new RoboException("O campo 'Modelo' deve ser preenchido");
        }
        
        this.modelo = modelo.trim();
    }

    public void setCor(String cor) throws RoboException {
        if (cor.length() > 15) {
            throw new RoboException("A cor deve conter menos de 15 caracteres");
        }
        else if (nome.isBlank()) {
            throw new RoboException("O campo 'Cor do robô' deve ser preenchido");
        }
        
        this.cor = cor.trim();
    }
}