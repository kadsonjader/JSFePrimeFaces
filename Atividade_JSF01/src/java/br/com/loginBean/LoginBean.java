
package br.com.loginBean;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {   
   private String matricula;
   private String senha;
   private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    public void exibirMensagem(){
        String matriculaCerto = "201612195";
        String senhaCerto = "12345";
        if(matricula.equals(matriculaCerto) && senha.equals(senhaCerto)){
           mensagem = "Bem vindo mano kadson firmeza ?";
       }else{
           mensagem = "Erro no Login ou matricula";
       }
   }
}
