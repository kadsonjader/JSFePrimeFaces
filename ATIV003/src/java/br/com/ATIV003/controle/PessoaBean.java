
package br.com.ATIV003.controle;

import br.com.ATIV003.modelo.Fisica;
import br.com.ATIV003.modelo.Juridica;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean (name="bean")
public class PessoaBean {
   private Fisica pf;
   private Juridica pj;
   private List<Fisica> listapf;
   private List<Juridica> listapj;
   
   public PessoaBean(){
       pf = new Fisica();
       listapf = new ArrayList<>();
       pj = new Juridica();
       listapj = new ArrayList<>();             
   }

    public Fisica getPf() {
        return pf;
    }

    public void setPf(Fisica pf) {
        this.pf = pf;
    }

    public Juridica getPj() {
        return pj;
    }

    public void setPj(Juridica pj) {
        this.pj = pj;
    }

    public List<Fisica> getListapf() {
        return listapf;
    }

    public void setListapf(List<Fisica> listapf) {
        this.listapf = listapf;
    }

    public List<Juridica> getListapj() {
        return listapj;
    }

    public void setListapj(List<Juridica> listapj) {
        this.listapj = listapj;
    }
   
    public void adicionarPF(){
        listapf.add(pf);
        pf = new Fisica();
    }
    
    public void adicionarPJ(){
        listapj.add(pj);
        pj = new Juridica();
    }
}
