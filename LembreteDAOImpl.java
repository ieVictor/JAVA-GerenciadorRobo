// Aluno: Victor Gabriel Lucio || RA: A2575302

import java.util.ArrayList;
import java.util.List;

public final class LembreteDAOImpl implements LembreteDAO {

    @Override
    public Lembrete get(int id) throws LembreteException {
        for (Lembrete lembrete : BDLembrete.getSingleLembreteDB().getLembretes()) {
            if(id == lembrete.getId()) return lembrete;
        }
        
        throw new LembreteException("ID não encontrado");
    }
    
    @Override
    public List<Lembrete> getAllCategory(String categoria) {
        List<Lembrete> categoryList = new ArrayList<>();
        for (Lembrete lembrete : BDLembrete.getSingleLembreteDB().getLembretes()) {
            if (lembrete.getCategoria().equals(categoria)) {
                categoryList.add(lembrete);
            }
        }
        
        return categoryList;
    }

    @Override
    public List<Lembrete> getAll() {
        return BDLembrete.getSingleLembreteDB().getLembretes();
    }

    @Override
    public Lembrete adicionar(Lembrete lembrete) throws LembreteException {
        if (lembrete.getTitulo().isBlank()) {
            throw new LembreteException("O lembrete deve conter um título!");
        }
        else if (lembrete.getTexto().isBlank()) {
            throw new LembreteException("O lembrete deve conter um texto de descrição!");
        }

        BDLembrete.getSingleLembreteDB().getLembretes().add(lembrete);
        return BDLembrete.getSingleLembreteDB().getLembretes().get(getAll().indexOf(lembrete));
    }

    @Override
    public Lembrete modificar(int id, Lembrete lembrete) throws LembreteException {
        for (Lembrete lembrete1 : BDLembrete.getSingleLembreteDB().getLembretes()) {
            if (lembrete1.getId() == id) {
                BDLembrete.getSingleLembreteDB().getLembretes().set(getAll().indexOf(lembrete1), lembrete);
                return BDLembrete.getSingleLembreteDB().getLembretes().get(getAll().indexOf(lembrete));
            }
        }

        throw new LembreteException("\nID nao encontrado!");
    }

    @Override
    public boolean deletar(int id) {
        return BDLembrete.getSingleLembreteDB().getLembretes().removeIf(lembrete -> lembrete.getId() == id);
    }
}


