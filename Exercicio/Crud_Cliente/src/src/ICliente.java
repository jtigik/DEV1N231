/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Collection;

/**
 *
 * @author jtsilva
 */
public interface ICliente {
    
    public Boolean cadastrar(Cliente cliente);
    
    public Cliente consultar(Long cpf);
    
    public void alterar(Long cpf);
    
    public Boolean excluir(Long cpf);
    
    public Collection<Cliente> buscarTodos();
}
