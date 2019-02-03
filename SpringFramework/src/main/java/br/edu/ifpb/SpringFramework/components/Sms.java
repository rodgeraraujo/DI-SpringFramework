package br.edu.ifpb.SpringFramework.components;

import br.edu.ifpb.SpringFramework.domain.Mensagem;
import br.edu.ifpb.SpringFramework.interfaces.Notificador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("urgente")
public class Sms implements Notificador {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("SF ::: Notificando por SMS: " + mensagem);
    }
}