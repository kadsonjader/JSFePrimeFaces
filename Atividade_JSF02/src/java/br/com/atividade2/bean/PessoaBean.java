
package br.com.atividade2.bean;

import br.com.atividade2.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

@ManagedBean
public class PessoaBean {
    private Pessoa pessoa;
    private List pessoas;
    // metodo construtor
    public PessoaBean(){
         pessoa = new Pessoa();
         pessoas = new ArrayList<Pessoa>();
   }
    
    // get e set
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List getPessoas() {
        return pessoas;
    }

    public void setPessoas(List pessoas) {
        this.pessoas = pessoas;
    }
    
    public void adicionar(){
        pessoas.add(pessoa);
        pessoa = new Pessoa();
    }
}

