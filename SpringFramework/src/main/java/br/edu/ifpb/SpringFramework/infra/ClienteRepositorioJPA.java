package br.edu.ifpb.SpringFramework.infra;

import br.edu.ifpb.SpringFramework.domain.Cliente;
import br.edu.ifpb.SpringFramework.interfaces.ClienteRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorioJPA implements ClienteRepositorio {
    @Override
    public void salvar(Cliente cliente) {
        System.out.println("SF ::: Salvando o cliente com JPA: " + cliente);
    }
}
