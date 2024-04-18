// Aluno: Victor Gabriel Lucio || RA: A2575302

import java.util.List;

public interface LembreteDAO extends DAO<Lembrete> {
    @Override
    Lembrete get(int id) throws LembreteException;
    
    @Override
    Lembrete modificar(int id, Lembrete lembrete) throws LembreteException;
    
    @Override
    Lembrete adicionar(Lembrete lembrete) throws LembreteException;
    
    List<Lembrete> getAllCategory(String categoria);
}
