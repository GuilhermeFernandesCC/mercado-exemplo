package Repositories;

import exemplo.Produto;

import java.util.Collection;
import java.util.HashMap;

public class ProdutoRepository {
    HashMap catalogo = new HashMap<String,Produto>();

    public void addProduto(Produto p){
          catalogo.put(p.getId(),p);
    }
    public void removeProduto(String id){
        catalogo.remove(id);
    }
    public Object getProduto(String id){
        return catalogo.get(id);
    }
    public void updateProduto(String id,Produto p){
        catalogo.replace(id, p);
    }
    public Collection getAllProdutos(){
        return catalogo.values();
    }
}

