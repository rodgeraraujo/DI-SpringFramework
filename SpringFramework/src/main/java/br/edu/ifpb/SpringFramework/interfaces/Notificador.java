package br.edu.ifpb.SpringFramework.interfaces;

import br.edu.ifpb.SpringFramework.domain.Mensagem;

public interface Notificador {
    void notificar(Mensagem mensagem);
}