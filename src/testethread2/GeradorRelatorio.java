package testethread2;

public class GeradorRelatorio implements Runnable {
    
    private String nome;
    
    public GeradorRelatorio (String nome) {
        
        this.nome = nome;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 50; ++ i) {
            
            System.out.println ("Nome: " + nome + " - Linha: " + i);
            
        }
    }
    
    
    
}
