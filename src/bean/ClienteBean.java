/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author Particular
 */
public class ClienteBean {// atribui a classe clientebean
   private int codigo;
   /** @pdOid bada9078-592a-4dfd-99dc-46620d7175e6 */
   private java.lang.String nome;
   /** @pdOid 77a6355b-905c-4e80-a406-747e3086149f */
   private java.lang.String rg;
   /** @pdOid 879a7f55-9a3e-4f6c-a646-d2b32b1c38ed */
   private java.lang.String cpf;
   /** @pdOid 503d6176-eb8a-40c5-950f-57cbc1f378af */
   private java.lang.String sexo;
   /** @pdOid da4ed353-dd3c-4378-a8e7-fe454d262838 */
   private java.util.Date dataNascimento;
   /** @pdOid 78f49189-9aa5-4853-8683-d19ee7b260f3 */
   private java.lang.String telefone;
   /** @pdOid 9e19c735-2fa0-4f5d-af0f-35bdcfb2139c */
   private java.lang.String rua;
   /** @pdOid b51ec21e-9572-4847-8b0f-460526fe771d */
   private int numero;
   /** @pdOid 0468634d-5d03-44c0-a6f9-bcb565ebe632 */
   private java.lang.String cep;
   /** @pdOid 3a19ff6a-4525-4c89-9e53-34635870b405 */
   private java.lang.String bairro;
   /** @pdOid df843645-cc76-4e77-994e-5c02cf64d226 */
   private java.lang.String cidade;
   /** @pdOid 0aa383f9-6c86-4155-aab1-344a27355c15 */
   private java.lang.String estado;

    /**
     * @return the codigo
     */
    public int getCodigo() {// mostra o valor do codigo
        return codigo;//retorna codigo
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {//atribui o valor no codigo
        this.codigo = codigo;
    }
    public void setCodigo(String codigo) throws Exception{
        this.codigo = Until.Validacao.stringToInt(codigo);
    }

    /**
     * @return the nome
     */
    public java.lang.String getNome() {// atribui o valor no nome
        return nome;//retorna nome
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(java.lang.String nome) throws Exception {// atribui o valor pro nome
        if (nome!=null){//nome nao pode ser nulo
            if  ((nome.length()>=3)&&(nome.length()<=50)){//nome tem que conter acima de 3 letras e menos de 50.
                this.nome = nome;
            }
            else
                throw new Exception ("o nome deve ter entre 3 e 50 caracteres");//mensagem de texto
        }
        else
            throw new Exception ("Preenche o nome");//mensagem de texto
    }

    /**
     * @return the rg
     */
    public java.lang.String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(java.lang.String rg)throws Exception {
       if  ((rg!= null)&&(rg.length()>=3)&&(rg.length()<=50)){
            this.rg = rg;
        }
        else
            throw new Exception ("o rg deve ter entre 3 e 50 caracteres");
    }

    /**
     * @return the cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(java.lang.String cpf)throws Exception {
        if ((cpf!= null)&& (cpf.length()==14)){
                this.cpf = cpf;
            }
             else
                throw new Exception ("o cpf deve ter exatamente 14 caracteres");
    }

    /**
     * @return the sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(java.lang.String sexo)throws Exception {
        if (sexo!=null){
            if (sexo.length()==1){
                if (sexo.toUpperCase().equals("M"))
                    this.sexo = "M";
                else if (sexo.toUpperCase().equals("F"))
                    this.sexo = "F";
                else 
                    this.sexo = null;                    
            } 
            else 
                throw new Exception ("O sexo so pode ter um caracter");
        }
    }

    /**
     * @return the dataNascimento
     */
    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     public void setDataNascimento(String Data_Nascimento) throws Exception{
        this.dataNascimento = Until.Validacao.stringToDate(Data_Nascimento);
    }

    /**
     * @return the telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(java.lang.String telefone)throws Exception {
        if ((telefone!= null)&& (telefone.length()==14)){
                this.telefone = telefone;
            }
             else
                throw new Exception ("o telefone deve ter exatamente 14 caracteres");
    }

    /**
     * @return the rua
     */
    public java.lang.String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(java.lang.String rua)throws Exception {
        if  ((rua!= null)&&(rua.length()>=3)&&(rua.length()<=50)){
            this.rua = rua;
        }
        else
            throw new Exception ("o rua deve ter entre 3 e 50 caracteres");
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public java.lang.String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(java.lang.String cep)throws Exception {
            if ((cep!= null)&& (cep.length()==9)){
                this.cep = cep;
            }
             else
                throw new Exception ("o cep deve ter exatamente 9 caracteres");
    }


    /**
     * @return the bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(java.lang.String bairro) throws Exception {// atribui o valor pro nome
       if  ((bairro!= null)&&(bairro.length()>=3)&&(bairro.length()<=50)){
            this.bairro = bairro;
        }
        else
            throw new Exception ("o bairro deve ter entre 3 e 50 caracteres");
   }

    /**
     * @return the cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(java.lang.String cidade)throws Exception {
        if  ((cidade!= null)&&(cidade.length()>=3)&&(cidade.length()<=50)){
            this.cidade = cidade;
        }
        else
            throw new Exception ("o cidade deve ter entre 3 e 50 caracteres");
    }

    /**
     * @return the estado
     */
    public java.lang.String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(java.lang.String estado)throws Exception {
        if  ((estado!= null)&&(estado.length()>=3)&&(estado.length()<=50)){
            this.estado = estado;
        }
        else
            throw new Exception ("o estado deve ter entre 3 e 50 caracteres");
    }

}
