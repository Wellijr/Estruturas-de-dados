/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author wellington.omjunior
 */
public class Lista {
    private Elemento inicio,atual,aux;
 
    public void inserir(Object objeto){
    if(inicio==null){
    inicio= new Elemento(objeto,null);
    aux=inicio;
    
        }else{
        atual=new Elemento(objeto,null);
        aux.setProx(atual);
        aux=atual;
       }
    }
}
