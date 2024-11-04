package org.example.notificacoes;

public class SistemaNotificacaoFacade {
    private NotificacaoEmail email;
    private NotificacaoSMS sms;

    public SistemaNotificacaoFacade(){
        email = new NotificacaoEmail();
        sms = new NotificacaoSMS();
    }

    public void enviarNotificacoes(String mensagem){
        email.enviarEmail(mensagem);
        sms.enviarSMS(mensagem);
    }
}
