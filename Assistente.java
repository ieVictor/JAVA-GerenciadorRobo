// Aluno: Victor Gabriel Lucio || RA: A2575302

import java.time.LocalDate;
import java.util.List;

public final class Assistente extends Domestico {
    private final LembreteDAO lembreteDAO = new LembreteDAOImpl();
    private int idCounter;
    private String assVirtual;
    private boolean sensor;
    
    private static Assistente singleAssistente;

    // Construtores
    private Assistente() {
        assVirtual = "Indefinido";
        sensor = false;
        idCounter = 1;
    }
    
    // MÉTODO SINGLETON
    public static Assistente getSingleAssistente() {
        if (singleAssistente == null) {
            singleAssistente = new Assistente();
        }
        
        return singleAssistente;
    }

    public String getAssVirtual() {
        return assVirtual;
    }

    public boolean getSensor() {
        return sensor;
    }
    
    public int getIdCounter() {
        return idCounter;
    }

    // Setters
    public void setAssVirtual(String assVirtual) throws RoboException {
        if (assVirtual.length() > 15) {
            throw new RoboException("O assistente virtual deve conter menos de 15 caracteres");
        }
        else if (assVirtual.isBlank()) {
            throw new RoboException("O campo 'Assistente virtual' deve ser preenchido");
        }
        
        this.assVirtual = assVirtual.trim();
    }

    public void setSensor(boolean sensor) {
        this.sensor = sensor;
    }
    
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    // Methods
    public Lembrete adicionarLembrete(String titulo, String categoria, String texto, LocalDate data) throws LembreteException {
        Lembrete lembrete = new Lembrete();
        lembrete.setId(idCounter);
        lembrete.setTitulo(titulo);
        lembrete.setCategoria(categoria);
        lembrete.setTexto(texto);
        lembrete.setDate(data);
        lembreteDAO.adicionar(lembrete);
        idCounter++;
        
        return lembrete;
    }
    
    public Lembrete consultarLembrete(int id) throws LembreteException {
        return lembreteDAO.get(id);
    }
    
    public List<Lembrete> consultarLembreteCategoria(String categoria) throws LembreteException {
        return lembreteDAO.getAllCategory(categoria);
    }

    public void modificarLembrete(int id, String titulo, String categoria, String texto, LocalDate data) throws LembreteException {
        if(lembreteDAO.getAll().isEmpty()) {
            throw new LembreteException("""
                    
                    O lembrete nao foi modificado
                    Lista de lembretes vazia!""");
        }

        Lembrete lembrete = new Lembrete();
        lembrete.setId(id); // O usuário não pode mudar o ID
        lembrete.setTitulo(titulo);
        lembrete.setTexto(texto);
        lembrete.setCategoria(categoria);
        lembrete.setDate(data);
        lembreteDAO.modificar(id, lembrete);
    }
    
    public void removerLembrete(int id) throws LembreteException {
        if (!lembreteDAO.deletar(id)) {
            throw new LembreteException("Não foi possível deletar o Lembrete!");
        }
    }
}
