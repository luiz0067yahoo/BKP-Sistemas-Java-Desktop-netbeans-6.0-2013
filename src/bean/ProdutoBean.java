/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author Particular
 */
public class ProdutoBean {//classe produtobean

    private int codigo;//variavel int codigo
    private java.lang.String nome;//variavel string nome
    private java.lang.String descricao;//variavel string descricao
    private float valor;//variavel float valor

    /**
     * @return the codigo
     */
    public ProdutoBean (){//construtor
        this.nome = null;// this é a propria classe, inicia nulo
        this.descricao = null;// inicia nulo
    }
    public int getCodigo() {//mostra o codigo
        return codigo;//retorna codigo
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {//atribui os valores
        this.codigo = codigo;// atribui codigo a codigo
    }
    public void setCodigo(String codigo)throws Exception {//metodo com poliformismo de set codigo com parametro string,throws classe de sessao usada
        this.codigo = Until.Validacao.stringToInt(codigo);//faz a validacao de codigo
    }

    /**
     * @return the nome
     */
    public java.lang.String getNome() {//mostra a classe nome
        return nome;//retorna nome
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(java.lang.String nome)throws Exception {//atribui nome a classe,throws classe de sessao usada
      if (nome!=null){//nome nao pode ser nulo
            if  ((nome.length()>=3)&&(nome.length()<=50)){//nome deve conter mais de 3 e menos de 50 caracteres.
                this.nome = nome;
            }
            else
                throw new Exception ("o nome deve ter entre 3 e 50 caracteres");//classe de excessao usada e texto de mensagem do nome
        }
        else
            throw new Exception ("Preenche o nome");//classse de excessao usada e mensagem de preencha o nome.
    }

    /**
     * @return the descricao
     */
    public java.lang.String getDescricao() {//mostra a descricao
        return descricao;//retorna descricao
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(java.lang.String descricao)throws Exception {//atribui a descricao,throws classe de sessao usada
        if  ((descricao!= null)&&(descricao.length()>=3)&&(descricao.length()<=50)){//descricao nao pode ser nula e tem que ter de 3 a 50 caracteres.
            this.descricao = descricao;
        }
        else
            throw new Exception ("o descricao deve ter entre 3 e 50 caracteres");//classe de excessao usada e mensagem de texto
    }

    /**
     * @return the valor
     */
    public float getValor() {//mostra o valor
        return valor;//retorna valor
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {// atribui o valor
        this.valor = valor;
    }
     public void setValor(String valor)throws Exception {//metodo com poliformismo de,throws classe de sessao usada
        this.valor = Until.Validacao.stringToFloat(valor,15,2);//until= é o pacote onde esta a classe validacao
        //que contem o metodo stringtofloat usado para validar numero reais.
    }

}
