// Aluno: Victor Gabriel Lucio || RA: A2575302


import java.util.ArrayList;
import java.util.List;

public class BDLembrete {
    // Singleton
    private static BDLembrete singleLembreteDB;
    private List<Lembrete> lembretes;
    
    private BDLembrete() {
        lembretes = new ArrayList<>();
    }
    
    // MÉTODO SINGLETON
    public static BDLembrete getSingleLembreteDB() {
        if (singleLembreteDB == null) {
            singleLembreteDB = new BDLembrete();
        }
        
        return singleLembreteDB;
    }
    
    public List<Lembrete> getLembretes() {
        return lembretes;
    }
}

