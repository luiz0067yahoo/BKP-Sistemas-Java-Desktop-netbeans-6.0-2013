package Until;

import java.sql.*;

/**
*
* @author mayron
*/
public class conexao {//classe conexao
  private String local;//variavel privada string local
  private String user;//variavel privada string user 'usuario'
  private String senha;//variavel privada string senha
  private Connection c;//variavel privadad conexao
  private Statement statment;//variavel privada statement 'status'
  private String str_conexao;//variavel string str_conexao
  private String driverjdbc;//variavel string driverjdbc
  private boolean conected;//variavel boolean conectado

  public conexao(String bd, String local, String porta, String banco, String user, String senha) {//conexao das string bd,local,porta,banco,user e senha
    conected = false;//conexao falsa
    if (bd.equals("PostgreSql")){
      setStr_conexao("jdbc:postgresql://"+ local +":" + porta +"/"+ banco);//atribui str_conexao local,porta e banco
      setLocal(local);//atribui local
      setSenha(senha);//atribui senha
      setUser(user);//atribui user
      setDriverjdbc("org.postgresql.Driver");//atribui driverjdbc
   }else {
      if (bd.equals("MySql")) {//envia informacao ao mysql
         setStr_conexao("jdbc:mysql://"+ local +":" + porta +"/"+ banco);//atribui  str_conexao local,porta e banco
         setLocal(local);//atribui local
         setSenha(senha);//atribui senha
         setUser(user);//atribui user
         setDriverjdbc("com.mysql.jdbc.Driver");//atribui driverjdbc ao mysql
     }
   }
  }
  public void configUser(String user, String senha) {//configuracao de user e senha
    setUser(user);//atribui user
    setSenha(senha);//atribui senha
  }

  public void configLocal(String banco) {//configuracao local - banco
    setLocal(banco);//atribui ao banco
  }

//Conexão com o Banco de Dados
 public void conect(){//conecta
   try {//bloco protegido
    Class.forName(getDriverjdbc());
    setC(DriverManager.getConnection(getStr_conexao(), getUser(), getSenha()));//atribui c conexai,user e senha
    setStatment(getC().createStatement());
    conected = true;//conecta - verdadeiro
   }catch (Exception e) {//bloco de erro
    System.err.println(e);
    e.printStackTrace();
  }
 }

 public void disconect(){//desconecta
  try {//bloco protegido
   getC().close();
   conected = false;//conecta falso
   }catch (SQLException ex) {
    System.err.println(ex);
    ex.printStackTrace();
   }
  }

  public ResultSet query(String query){//atribui query
   try {//bloco protegido
   return getStatment().executeQuery(query);//retorna statment e executa query
   }catch (SQLException ex) {
   ex.printStackTrace();
   return null;//retorna nulo
   }
  }

// GETs AND SETs
public String getLocal() {//mostra local
return local;//retorna local
}

public void setLocal(String local) {//atribui o local a classe
this.local = local;//informa local a classe
}

public String getUser() {//mostra user 'usuario'
return user;//retorna user
}

public void setUser(String user) {//atribui user a classe
this.user = user;//informa user a classe
}

public String getSenha() {//mostra senha
return senha;//retorna senha
}

public void setSenha(String senha) {//atribui senha a classe
this.senha = senha;//informa senha a classe
}

public Connection getC() {//mostra c 'conexao'
return c;//retorna c
}

public void setC(Connection c) {//atribui c 'conexao' a classe
this.c = c;//informa conexao a classe
}

public Statement getStatment() {//mostra statment
return statment;//retorna statment
}

public void setStatment(Statement statment) {//atribui statment a classe
this.statment = statment;//informa statment a classe
}

public String getStr_conexao() {//mostra str_conexao
return str_conexao;//retorna str_conexao
}

public void setStr_conexao(String str_conexao) {//atribui str_conexao a classe
this.str_conexao = str_conexao;//informa str_conexao a classe
}

public String getDriverjdbc() {//mostra o driverjdbc
return driverjdbc;//retorna driverjdbc
}

public void setDriverjdbc(String driverjdbc) {//atribui driverjdbc a classe
this.driverjdbc = driverjdbc;//informa driverjdbc a classe
}

    /**
     * @return the conectado
     */
    public boolean isConected() {//conecta
        return conected;//retorna conectado
    }

}