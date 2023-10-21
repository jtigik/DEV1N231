/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jtsilva
 */
public class ClienteMap implements ICliente{

    private Map<Long, Cliente> map;
    
    public ClienteMap(){
        this.map = new HashMap<>();
    }
    
    @Override
    public Boolean cadastrar(Cliente cliente) {
        
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;   
    }

    @Override
    public Cliente consultar(Long cpf) {
        
        return this.map.get(cpf);
    }

    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        
        if(clienteCadastrado != null){
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCel(cliente.getCel());
            clienteCadastrado.setCep(cliente.getCep());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEndereco2(cliente.getEndereco2());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Boolean excluir(Long cpf) {
        
        Cliente clienteCadastado = this.map.get(cpf);
        
        if(clienteCadastado != null){
            this.map.remove(clienteCadastado.getCpf(), clienteCadastado);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

    @Override
    public void alterar(Long cpf) {
        System.out.println("Nada aqui...");
    }
    
}
