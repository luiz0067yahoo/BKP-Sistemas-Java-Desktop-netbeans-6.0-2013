/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import bean.ClienteBean;
import Until.conexao;
import java.util.Vector;
/**
 *
 * @author Particular
 */
public class ItemDao {//classe do produto
    private conexao con = null;//atributo conexao con na classe do itemdao e inicia nulo
    public ItemDao (conexao con){//construtor itemdao
        this.con = con;
    }
    public void inserir (ItemDao cliente){//metodo inserir itemdao
    }
    public void alterar (ItemDao cliente){//metodo alterar itemdao
    }
    public void excluir (ItemDao cliente){//metodo excluir itemdao
    }
    public Vector buscar (String sql){//metodo buscar string
        return null;//retorna nulo
    }
} 
