package testethread2;

public class TesteThread2 {

    public static void main(String[] args) {
        
        // Apresenta mensagem de início de aplicação
        System.out.println ("Início da aplicação!!!");
        
        // Cria um objeto que pode ser executado em thread
        GeradorRelatorio relatorio1 = new GeradorRelatorio ("Thread 1");
        GeradorRelatorio relatorio2 = new GeradorRelatorio ("Thread 2");
        GeradorRelatorio relatorio3 = new GeradorRelatorio ("Thread 3");
        
        // Cria a thread com o objeto
        Thread thread1 = new Thread (relatorio1);
        Thread thread2 = new Thread (relatorio2);
        Thread thread3 = new Thread (relatorio3);
        
        // Inicia a execução da thread
        thread1.start ();
        thread2.start ();
        thread3.start ();
        
        // Apresenta uma mensagem de final de main
        System.out.println ("main() terminou e a thread executou!");
    }
    
}
