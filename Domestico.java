// Aluno: Victor Gabriel Lucio || RA: A2575302


public abstract class Domestico extends Robo {
    private String nomeProprietario;
    private Bateria bateria;

    // Construtores
    public Domestico() {
        nomeProprietario = "Indefinido";
        bateria = new Bateria();
    }

    // Getters
    public String getProprietario() {
        return nomeProprietario;
    }

    public Bateria getBateria() {
        return bateria;
    }

    // Setters
    public void setProprietario(String nomeProprietario) throws RoboException {
        if (nomeProprietario.length() > 20) {
            throw new RoboException("O nome do proprietário deve conter menos de 20 letras");
        }
        else if (nomeProprietario.isBlank()) {
            throw new RoboException("O campo 'Proprietário' deve ser preenchido!");
        }
        
        this.nomeProprietario = nomeProprietario.trim();
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
}
