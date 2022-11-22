/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author Particular
 */
public class ItemBean {//classe Item
    private int codigo_produto;//variavel privada de codigo produto
    private int numero_da_nf;//variavel privada de numero da nf
    private int quantidade;//variavel privada de quantidade

    /**
     * @return the codigo_produto
     */
    public int getCodigo_produto() {//mostra o codigo produto
        return codigo_produto;//retorna codigo produto
    }

    /**
     * @param codigo_produto the codigo_produto to set
     */
    public void setCodigo_produto(int codigo_produto) {//atribui codigo_produto a classe
        this.codigo_produto = codigo_produto;//informa codigo_produto a classe
    }
    public void setCodigo_produto(String codigo_produto)throws Exception {// classe de sessao usada
        this.codigo_produto = Until.Validacao.stringToInt(codigo_produto);//validacao de codigo produto
    }

    /**
     * @return the numero_da_nf
     */
    public int getNumero_da_nf() {//mostra o numero da nf
        return numero_da_nf;//retorna numero da nf
    }

    /**
     * @param numero_da_nf the numero_da_nf to set
     */
    public void setNumero_da_nf(int numero_da_nf) {//atribui numero da nf a classe
        this.numero_da_nf = numero_da_nf;//informa numero da nf a classe
    }
    public void setNumero_da_nf(String numero_da_nf)throws Exception {//classe de sessao usada
        this.numero_da_nf = Until.Validacao.stringToInt(numero_da_nf);//validacao de numero da nf
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {//mostra a quantidade
        return quantidade;//retorna a quantidade
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {//atribui quantidade parametro a quantidade da classe
        this.quantidade = quantidade;
    }
    public void setQuantidade(String quantidade)throws Exception {// classe de sessao usada
        this.quantidade = Until.Validacao.stringToInt (quantidade);//validacao de quantidade
    }


    /**
     * @return the codigo_produto
     */
}
