package jonatas.metodos;

public class usuario {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();
        
        
            System.out.println("TV ligada ? " + smartTv.ligada);
            System.out.println("Qual canal ? " + smartTv.canal);
            System.out.println("Qual volume ? " +smartTv.volume);
            
        smartTv.ligar();
         System.out.println("Novo status > TV ligada ? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
        }
    }
