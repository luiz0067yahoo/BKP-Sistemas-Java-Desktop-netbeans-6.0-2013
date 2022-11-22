/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Until;

import java.util.Date;

/**
 *
 * @author Particular
 */
public class Validacao{ //classe do produto
    public static Date stringToDate (String valor) throws Exception{//classe texto e data e throws para o codigo na excessao nao segue a frente.
        try {//bloco protegido
            return stringToDate (valor,"dd/MM/yyyy");//retorna data
        }
        catch (Exception erro){//bloco de erro
            return stringToDate (valor,"yyyy-MM-dd");//retorna data
        }
    }
    public static Date stringToDate (String valor,String formato) throws Exception{// converter texto em data - throws classe de sessao usada
        //java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");// cria o formato dd/MM/yyyy
        java.text.SimpleDateFormat formato_data = new java.text.SimpleDateFormat(formato);


        try {// bloco protegido
            return formato_data.parse(valor);//converte texto em data
        }
        catch (java.text.ParseException erro) {// catch, bloco de erro, ParseException especifico para erro de conversao de texto
           throw new Exception (" O valor nao é uma data válida"+ erro.getMessage());// cria excessao
        }
        //return data;// retorna data
    }
    public static float stringToFloat (String valor) throws Exception{ // converter texto em numero
        float resultado=0; // inicia variavel com zero
        try { //bloco protegido
            return Float.parseFloat(valor);//retorna valor
        }
        catch (Exception erro){//bloco de erro
            throw new Exception (" O valor nao é um numero real"+ erro.getMessage());//mensagem de erro
        }
        //return resultado;
    }
    public static float stringToFloat (String valor,int qtd_inteiros,int qtd_decimais) throws Exception{
        int posicao = 0;
        valor = valor.replaceAll(",", ".");
        posicao = valor.indexOf(".");
        String inteiro = "";
        String decimal = "";
        inteiro = valor.substring(0, posicao);//erro pode estar aqui
        decimal = valor.substring(posicao, valor.length()-1);// ou aquii, desgraçaa.
        if((inteiro.length() <= qtd_inteiros)&&(decimal.length() <= qtd_decimais)){
            return stringToFloat(valor);
        }
        else
            throw new Exception ("o numero deve ter até "+ qtd_inteiros+" numeros antes a virgula\n e "+ qtd_decimais+" apos a virgula");
    }
    public static int stringToInt (String valor) throws Exception{

        try {
            return Integer.parseInt(valor);
        }
        catch (Exception erro){
           throw new Exception ("O valor nao é um numero inteiro valido "+ erro.getMessage());
        }
        //return resultado;
    }
}
