/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class Porta {
    public final Estado aberta = new Aberta();
    public final Estado fechada = new Fechada();
    public final Estado fechando = new Fechando();
    public final Estado abrindo = new Abrindo();
    public final Estado manterAberta = new ManterAberta();
    Estado[] estados = {aberta, fechada, fechando, abrindo, manterAberta};
    private Estado estadoAtual;
    
    
    public Estado status(){
        return estadoAtual;
    }
    
    public void setEstado(int i){
        this.estadoAtual = estados[i];
    }
    
    public void clicar(){
        estadoAtual = estadoAtual.clicar();
    }
    
    
}
