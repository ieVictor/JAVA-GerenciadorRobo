// Aluno: Victor Gabriel Lucio | RA: A2575302

import java.util.ArrayList;
import java.util.List;

public class BDArticulado {
    
    // Singleton
    private static BDArticulado singleBDArticulado;
    private final List<Articulado> articulados;
    private int idCounter;
    
    private BDArticulado() {
        articulados = new ArrayList<>();
        idCounter = 1;
    }
    
    // MÉTODO SINGLETON
    public static BDArticulado getSingleBDArticulado() {
        if (singleBDArticulado == null) {
            singleBDArticulado = new BDArticulado();
        }
        
        return singleBDArticulado;
    }
    
    public List<Articulado> getArticulados() {
        return articulados;
    } 
    
    public int getIdCounter() {
        return idCounter;
    }
    
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }
}
