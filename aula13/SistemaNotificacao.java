package revisao;
import java.util.Arrays;
import java.util.List;

// Classe Base
class Notificacao {
    // Método base que será sobrescrito
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação genérica: " + mensagem);
    }
}

// Classe Derivada: NotificacaoEmail
class NotificacaoEmail extends Notificacao {
    
    // Sobrescrita (Override) do método original
    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-mail] Enviando para o destinatário padrão: " + mensagem);
    }

    // Sobrecarga (Overload) para aceitar UM destinatário específico
    public void enviar(String mensagem, String destinatario) {
        System.out.println("[E-mail] Enviando para <" + destinatario + ">: " + mensagem);
    }

    // Sobrecarga (Overload) usando Varargs (...) para aceitar UM OU MAIS destinatários
    public void enviar(String mensagem, String... destinatarios) {
        System.out.println("[E-mail] Enviando em massa para os destinatários " + Arrays.toString(destinatarios) + ": " + mensagem);
    }
}

// Classe Derivada: NotificacaoApp
class NotificacaoApp extends Notificacao {
    
    // Sobrescrita (Override) com a lógica específica do aplicativo (Push)
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Push App] Disparando notificação na tela do celular: " + mensagem);
    }
}

// Classe Principal para demonstração
public class SistemaNotificacao {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DE NOTIFICAÇÕES ===\n");

        // 1. Demonstração da Notificação por App (Sobrescrita)
        Notificacao app = new NotificacaoApp();
        app.enviar("Seu pedido saiu para a entrega!");

        System.out.println();

        // 2. Demonstração da Notificação por E-mail (Sobrescrita e Sobrecargas)
        NotificacaoEmail email = new NotificacaoEmail();

        // Chamando o método padrão (Sobrescrito)
        email.enviar("Bem-vindo à nossa plataforma!");

        // Chamando a sobrecarga com 1 destinatário
        email.enviar("Sua fatura está fechada.", "usuario@email.com");

        // Chamando a sobrecarga com múltiplos destinatários (Varargs)
        email.enviar("Manutenção programada no sistema amanhã.", "admin@empresa.com", "suporte@empresa.com", "diretoria@empresa.com");
    }
}


