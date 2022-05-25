/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_composit;

/**
 *
 * @author nando
 */
public abstract class ProductComponent {
    String nome;
    Float preco;
    
    public abstract float getPreco();
    public abstract void add(ProductComponent product);
    public abstract void remove(ProductComponent product);
   
}
