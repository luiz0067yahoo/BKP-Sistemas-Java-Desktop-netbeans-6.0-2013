/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;// pacote dao
// importar as classes usadas no codigo
import bean.ProdutoBean;
import Until.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 *
 * @author Particular
 */
public class ProdutoDao {//classe do produto
    private conexao con = null;// atributo conexao con na classe produtodao e inicia nulo
    public ProdutoDao (conexao con){//construtor do produtodao
        this.con = con;
    }
    public void inserir (ProdutoBean Produto) throws SQLException{//metodo inserir do produtobean, throws para o codigo na excessao nao segue a frente.
        if (con != null){// se a conexao for nula, nao faça nada.
            if (!con.isConected())// verifica se esta conectado
              con.conect();//conecta ao banco
            String sql = "insert into produto (nome,descricao,valor) values (?, ?, ?);";// sql com os tres parametros
            PreparedStatement statement = con.getC().prepareStatement(sql);// prepara os paramentros
            try {//bloco protegido
                statement.setString(1, Produto.getNome()); // coloca o valor do nome do produto no parametro
                statement.setString(2, Produto.getDescricao());// coloca o valor da descricao do produto no parametro
                statement.setFloat(3, Produto.getValor());// coloca o valor do valor do produto no parametro
                statement.execute();// executa as intruçoes sql
                con.query("COMMIT;");// confirma instruçao sql
                statement.close();// fecha os parametros
            } catch (SQLException e) {
                throw new SQLException(e.getMessage());
            }
           
            
        }
    }
    public void alterar (ProdutoBean Produto) throws SQLException{//altera o produto no banco
        if (con != null){// se a conexao for nula, nao faça nada.
            if (con.isConected())// verifica se esta conectado
              con.conect();//conecta ao banco
            String sql = "update produto set nome = ?, descricao = ?, valor = ? where(codigo=?);";// sql com os tres parametros
            PreparedStatement statement = con.getC().prepareStatement(sql);// prepara os paramentros
            try {//bloco protegido
                statement.setString(1, Produto.getNome()); // coloca o valor do nome do produto no parametro
                statement.setString(2, Produto.getDescricao());// coloca o valor da descricao do produto no parametro
                statement.setFloat(3, Produto.getValor());// coloca o valor do valor do produto no parametro
                statement.setInt(4, Produto.getCodigo());// coloca o valor do produto do produto no parametro
                statement.execute();// executa as intruçoes sql
                con.query("COMMIT;");// confirma instruçao sql
                statement.close();// fecha os parametros
            } catch (SQLException e) {// excessao
                throw new SQLException(e.getMessage());// erro sql
            }

            
        }
    }
    public void excluir (ProdutoBean Produto) throws SQLException{//exclui o produto
        if (con != null){// se a conexao for nula, nao faça nada.
            if (con.isConected())// verifica se esta conectado
              con.conect();//conecta ao banco
            String sql = "delete from produto where (codigo=?);";// sql com um parametro
            PreparedStatement statement = con.getC().prepareStatement(sql);// prepara os paramentros
            try {//bloco protegido
                statement.setInt(1, Produto.getCodigo());// coloca o valor do produto do produto no parametro
                statement.execute();// executa as intruçoes sql
                con.query("COMMIT;");// confirma instruçao sql
                statement.close();// fecha os parametros
            } catch (SQLException e) {
                throw new SQLException(e.getMessage());
            }
          
        }
    }
    public List<ProdutoBean> buscar (String sql) throws SQLException, Exception{//busca o produto
        List<ProdutoBean> list = null;// a lista a inicia nulo,
        ResultSet rs = null;
        if (con != null){// se a conexao for nula, nao faça nada.
            if (con.isConected())// verifica se esta conectado
              try{
                con.conect();//conectado
                }
              catch(Exception erro){
                throw new Exception("Nao foi possivel conectar ao banco de dados");
              }
            try{
                rs = con.query(sql);//atribui a variavel rs do tipo resultset o resultado da busca com base na instrucao sql
            }
            catch(Exception erro){
                //throw new Exception("Erro na busca");
                throw new Exception(erro.getMessage());
            }
            list = new ArrayList<ProdutoBean>();// cria um novo array list do tipo produtobean e armazena na variavel list
            ProdutoBean produto;//cria variavel produto do tipo produtobean
            if(rs != null){
                try{
                    while(rs.next()){//laço de repeticao enquanto houver proximo registro
                        produto = new ProdutoBean();//cria novo produtobean e armazena em produto
                        produto.setCodigo(rs.getInt("Codigo"));// seta o codigo buscado da consulta
                        produto.setNome(rs.getString("Nome"));//seta o nome buscado da consulta
                        produto.setDescricao(rs.getString("Descricao"));//seta a descricao buscado da consulta
                        produto.setValor(rs.getFloat("Valor"));//seta o valor buscado da consulta
                        list.add(produto);//add o produto variavel na lista ou list
                    }
                }
                catch(Exception erro){
                    throw new Exception(erro.getMessage());
                }
            }
            rs.close();//fecha a consulta
            con.getStatment().close ();//fecha os parametros

        }
        return list;//retorna lista
       
    }
    public List<ProdutoBean> buscar () throws SQLException, Exception{// metodo buscar com poliformismo instrucao sql ja pronta
        String sql = "select codigo,nome,descricao,valor from produto;";//instrucao sql pronta
        return  buscar(sql);//retorna buscar sql
    }


}
