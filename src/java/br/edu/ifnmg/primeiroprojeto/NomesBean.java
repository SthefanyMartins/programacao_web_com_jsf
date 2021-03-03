package br.edu.ifnmg.primeiroprojeto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class NomesBean {
    
    private String nome;
    private String sobrenome;
    private String mensagem;
    
    public void dizerOla(){
        mensagem = "Olá " + nome + " " + sobrenome;
    }

    //set / get nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //set / get sobrenome
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    
    //set / get mensagem
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getMensagem() {
        return mensagem;
    }
    
}
