package exercicio5;

import java.util.Scanner;

public class UsaGps {
    public void main(Scanner ler) {
        boolean exec = true;
        Gps gps;
        System.out.println("Deseja iniciar o gps com idioma e rota definida?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        if (ler.nextInt() == 1) {
            System.out.print("Digite o idioma desejado: ");
            String idioma = ler.next();
            System.out.print("Digite a rota desejada: ");
            String rota = ler.next();
            gps = new Gps(idioma, rota);
        } else {
            gps = new Gps();
        }
        while (exec) {
            System.out.println("Selecione uma opção");
            System.out.println("1 - Definir idioma do GPS");
            System.out.println("2 - Definir rota do GPS");
            System.out.println("3 - Mostrar informações Atuais do GPS");
            System.out.println("0 - Sair");
            switch (ler.nextInt()) {
                case 1:
                    System.out.print("1 - Digite o novo idioma: ");
                    gps.setIdioma(ler.next());
                    break;
                case 2:
                    System.out.print("1 - Digite a nova rota: ");
                    gps.setRota(ler.next());
                    break;
                case 3:
                    gps.mostrar();
                    break;
                case 0:
                    exec = false;
                    break;
            }
        }
    }
}
