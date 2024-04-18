// Aluno: Victor Gabriel Lucio | RA: A2575302

import java.util.List;
import java.util.Map;

public class ArticuladoDAOImpl implements ArticuladoDAO {
    
    private static ArticuladoDAOImpl singleArticuladoDAO;
    
    public static ArticuladoDAOImpl getSingleArticuladoDAO() {
        if (singleArticuladoDAO == null) {
            singleArticuladoDAO = new ArticuladoDAOImpl();
        }
        
        return singleArticuladoDAO;
    }
    
    @Override // Sobrescrita
    public Articulado get(int id) throws ArticuladoException {
        for (Articulado articulado : BDArticulado.getSingleBDArticulado().getArticulados()) {
            if(id == articulado.getId()) return articulado;
        }
        
        throw new ArticuladoException("ID não encontrado");
    }

    @Override
    public Articulado modificar(int id, Articulado articulado) throws ArticuladoException {
        for (Articulado articulado1 : BDArticulado.getSingleBDArticulado().getArticulados()) {
            if (articulado1.getId() == id) {
                BDArticulado.getSingleBDArticulado().getArticulados().set(getAll().indexOf(articulado1), articulado);
                return BDArticulado.getSingleBDArticulado().getArticulados().get(getAll().indexOf(articulado));
            }
        }

        throw new ArticuladoException("\nID não encontrado!");
    }

    @Override
    public Articulado adicionar(Articulado articulado) throws ArticuladoException {
        // Tratamento inteiros
        if (articulado.getVelocidade() <= 0) {
            throw new ArticuladoException("A velocidade deve ser um número positivo");
        } 
        else if (articulado.getQntdEixos() <= 0) {
            throw new ArticuladoException("A quantidade de eixos deve ser um número positivo");
        }
        
        // Tratamento strings      
        Map<String, String> campos = Map.of(   
                "nome da indústria", articulado.getNomeIndustria(),
                "modelo do robô", articulado.getModelo(),
                "cor do robô", articulado.getCor(),
                "nome do robô", articulado.getNome()
        );
        
        for (Map.Entry<String, String> campo :campos.entrySet()) {
            if (campo.getValue().isBlank()) {
                throw new ArticuladoException("O " + campo.getKey() + " deve ser inserido!");
            }
        }

        BDArticulado.getSingleBDArticulado().getArticulados().add(articulado);
        BDArticulado.getSingleBDArticulado().setIdCounter(
                BDArticulado.getSingleBDArticulado().getIdCounter() + 1
        );
        return BDArticulado.getSingleBDArticulado().getArticulados().get(getAll().indexOf(articulado));
    }

    @Override
    public boolean deletar(int id) {
        
        return BDArticulado.getSingleBDArticulado().getArticulados().removeIf(articulado -> articulado.getId() == id);
    }
    
    @Override
    public List<Articulado> getAll() {
        return BDArticulado.getSingleBDArticulado().getArticulados();
    }
}
