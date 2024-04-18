// Victor Gabriel Lucio | RA: A2575302

import java.time.LocalDate;

public final class Lembrete {
    private int id;
    private String titulo;
    private String categoria;
    private String texto;
    private LocalDate date;

    public Lembrete() {
        id = 0;
        titulo = "";
        categoria = "";
        texto = "";
        date = LocalDate.now();
    }

    public Lembrete(int id, String texto, LocalDate date, String categoria) {
        this.id = id;
        this.texto = texto;
        this.date = date;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Texto: " + texto + "\nData: " + date;
    }
}
