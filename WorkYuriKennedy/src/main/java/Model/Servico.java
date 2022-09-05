/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rober
 */
public class Servico {
    private int id;
    private float valor;
  //CONSTRUTOR
    
    
public Servico(int id, float valor) {
    this.id = id;
    this.valor = valor;
    }


  //GET E SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}   
