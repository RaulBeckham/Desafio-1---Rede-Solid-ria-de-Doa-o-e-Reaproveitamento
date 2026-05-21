package repository;
import java.util.ArrayList;

import model.ItemDoacao; 
public class ItemRepository {
    private ArrayList<ItemDoacao> itensdoados = new ArrayList<>();
    public void adicionarItemDoado(ItemDoacao itemDoacao)
    {
        itensdoados.add(itemDoacao);
    }
    public ArrayList<ItemDoacao> listarItens()
    {
        return itensdoados;
    }

public ItemDoacao buscarPorId(int id) {

    for (ItemDoacao item : itensdoados) {

        if (item.getId() == id) {
            return item;
        }
    }
    return null;
}
}
