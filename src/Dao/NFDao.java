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
public class NFDao {// classe do produto
    private conexao con = null;//atributo conexao con na classe produtodao e inicia nulo
    public NFDao (conexao con){//construtor da nfdao
        this.con = con;
    }
    public void inserir (NFDao cliente){//metodo inserir da nfdao
    }
    public void alterar (NFDao cliente){//metodo alterar da nfdao
    }
    public void excluir (NFDao cliente){//metodo excluir da nfdao
    }
    public Vector buscar (String sql){//metodo buscar da nfdao
        return null;//retorna nulo
    }
}
