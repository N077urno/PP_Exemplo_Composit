/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_composit;

import java.util.ArrayList;

/**
 *
 * @author nando
 */
public class ProductComposit extends ProductComponent{
    private ArrayList <ProductComponent> produtos = new ArrayList<ProductComponent>(); 
    
    @Override
    public float getPreco(){
        float soma = 0;
        for(int i=0; i<this.produtos.size();i++){
            soma = soma + this.produtos.get(i).getPreco();
        }
        
        return(soma);
        
    }
    
    @Override 
    public void add(ProductComponent produto){
        this.produtos.add(produto);
        
    }
    
    @Override
    public void remove(ProductComponent produto){
        int index;
        
        index = this.produtos.indexOf(produto);
        
        if(index != -1){
            this.produtos.get(index).remove(produto);
        }
        
    }
    
}
