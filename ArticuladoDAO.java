// Aluno: Victor Gabriel Lucio || RA: A2575302

public interface ArticuladoDAO extends DAO<Articulado> {
    Articulado get(int id) throws ArticuladoException;
    Articulado modificar(int id, Articulado articulado) throws ArticuladoException;
    Articulado adicionar(Articulado articulado) throws ArticuladoException;
    boolean deletar(int id);
}
