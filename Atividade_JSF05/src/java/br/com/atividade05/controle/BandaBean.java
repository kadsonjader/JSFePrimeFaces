
package br.com.atividade05.controle;

import br.com.atividade05.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean (name="bean")
public class BandaBean {
    //declaracao dos objetos
    private Pessoa integrante;
    private List<Pessoa> banda;
    
    //construtor
    public BandaBean(){
        integrante =  new Pessoa();
        banda = new ArrayList<>();
    }

    public Pessoa getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Pessoa integrante) {
        this.integrante = integrante;
    }

    public List<Pessoa> getBanda() {
        return banda;
    }

    public void setBanda(List<Pessoa> banda) {
        this.banda = banda;
    }
    
    public void adicionar(){
        banda.add(integrante);
        integrante = new Pessoa();
    }
}
