/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author Particular
 */
public class NFBean {//classe de nota fiscal

   private int numeroDaNf;//variavel privada de numeros da nf
    private java.util.Date data;//variavel privada de data
    private java.util.Date hora;//variavel privada de hora
    private java.lang.String status;//variavel privadade status
    private int codigo_Cliente;//variavel privada de codigo cliente

    /**
     * @return the numeroDaNf
     */
    public int getNumeroDaNf() {//mostra o numero da Nf
        return numeroDaNf;// retorna numero da nf
    }

    /**
     * @param numeroDaNf the numeroDaNf to set
     */
    public void setNumeroDaNf(int numeroDaNf) {//atribui numero da nf a classe
        this.numeroDaNf = numeroDaNf;//informa o numero digitado
    }
     public void setNumeroDaNf(String numeroDaNf)throws Exception {//classe de sessao usada
        this.numeroDaNf =Until.Validacao.stringToInt (numeroDaNf);//validacao de numero da nf
    }

    /**
     * @return the data
     */
    public java.util.Date getData() {//mostra a data
        return data;//retorna data
    }

    /**
     * @param data the data to set
     */
    public void setData(java.util.Date data) {
        this.data = data;
    }
    public void setData(String data)throws Exception {//classe de sessao usada
        this.data = Until.Validacao.stringToDate(data);//validacao de data
    }

    /**
     * @return the hora
     */
    public java.util.Date getHora() {//mostra a hora
        return hora;//retorna hora
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(java.util.Date hora) {
        this.hora = hora;
    }
    public void setHora(String hora)throws Exception {//conversao de texto para hora, throws classe de sessao usada
        this.hora = Until.Validacao.stringToDate(hora,"HH:mm:ss");//conversao de hora.
    }

    /**
     * @return the status
     */
    public java.lang.String getStatus() {//mostra o status
        return status;//retorna status
    }

    /**
     * @param status the status to set
     */
    public void setStatus(java.lang.String status)throws Exception {
        if (status!=null){// status nao pode ser nulo
            if  ((status.length()>=3)&&(status.length()<=50)){//status deve conter entre 3 a 50 caracteres
                this.status = status;
            }
            else
                throw new Exception ("o Status deve ter entre 3 e 50 caracteres");//classe de sessao usada e mensagem de status
        }
        else
            throw new Exception ("Preenche o Status");//mensagem para preencher status
    }

    /**
     * @return the codigo_Cliente
     */
    public int getCodigo_Cliente() {//codigo mostra codigo cliente
        return codigo_Cliente;//retorna codigo cliente
    }

    /**
     * @param codigo_Cliente the codigo_Cliente to set
     */
    public void setCodigo_Cliente(int codigo_Cliente) {
        this.codigo_Cliente = codigo_Cliente;
    }
    public void setCodigo_Cliente(String codigo_Cliente)throws Exception  {//
        this.codigo_Cliente = Until.Validacao.stringToInt(codigo_Cliente);//validacao de codigo cliente
    }
}
