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
public class ClienteDao {// classe clienteda
    private conexao con = null;//private significa que o elemento sera privado ou seja so pode ser acessado pela propria classe.
    // conexao é o tipo do atributo con, e é iniciada nulo. Co
    public ClienteDao (conexao con){//construtor da classedao
        this.con = con;// this é a propria classe, con é atributo
    }
    public void inserir (ClienteBean cliente){// inserir os dados dos clientes
    }
    public void alterar (ClienteBean cliente){// alterar os dados dos clientes
    }
    public void excluir (ClienteBean cliente){// excluir os dados dos clientes
    }
    public Vector buscar (String sql){// buscar os dados dos clientes
        return null;//retorna nulo
    }


}
