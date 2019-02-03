package br.edu.ifpb.SpringFramework.infra;

import br.edu.ifpb.SpringFramework.domain.Cliente;
import br.edu.ifpb.SpringFramework.interfaces.ClienteRepositorio;
import br.edu.ifpb.SpringFramework.interfaces.Notificador;
import br.edu.ifpb.SpringFramework.domain.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class ClienteServico {

    @Qualifier("importante")
    @Autowired
    private Notificador notificador;
    @Autowired
    private ClienteRepositorio repositorio;

    public void salvar(Cliente cliente) {
        this.repositorio.salvar(cliente);
        this.notificador.notificar(
                new Mensagem(
                        cliente.getEmail(), "Acesso ao sistema", "Olá..."
                )
        );
    }
}