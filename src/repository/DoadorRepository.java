package repository;

import java.util.ArrayList;
import model.Doador;

public class DoadorRepository {

    private ArrayList<Doador> doadores = new ArrayList<>();

    public void adicionarDoador(Doador doador) 
    {
        doadores.add(doador);
    }

    public ArrayList<Doador> listarDoadores() 
    {
        return doadores;
    }
}