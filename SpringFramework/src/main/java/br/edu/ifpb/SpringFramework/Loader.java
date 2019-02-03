package br.edu.ifpb.SpringFramework;

import br.edu.ifpb.SpringFramework.domain.Cliente;
import br.edu.ifpb.SpringFramework.infra.ClienteServico;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Loader {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan(Loader.class.getPackage().getName());
        context.refresh();

        ClienteServico servico = context.getBean(ClienteServico.class);
        servico.salvar(
                new Cliente(1, "Rogério", "rogerio.araujo@mail.com")
        );

        context.close();

    }
}
