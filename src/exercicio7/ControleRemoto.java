package exercicio7;

import java.util.Scanner;

public class ControleRemoto {
    public void main() {
        Scanner ler = new Scanner(System.in);
        Televisao televisao = new Televisao();
        boolean exec = true;
        while (exec) {
            System.out.println("Controle Remoto Menu");
            System.out.println("1 - Aumentar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Aumentar Canal");
            System.out.println("4 - Diminuir Canal");
            System.out.println("5 - Mudar para Canal específico");
            System.out.println("6 - Mostrar Volume e Canal atual");
            System.out.println("0 - Sair");
            switch (ler.nextInt()) {
                case 1:
                    this.aumentarVolume(televisao);
                    break;
                case 2:
                    this.diminuirVolume(televisao);
                    break;
                case 3:
                    this.aumentarCanal(televisao);
                    break;
                case 4:
                    this.diminuirCanal(televisao);
                    break;
                case 5:
                    System.out.println("Digite o numero do canal");
                    this.mudarCanal(televisao, ler.nextInt());
                    break;
                case 6:
                    this.mostrarStatusTelevisao(televisao);
                    break;
                case 0:
                    exec = false;
                    break;
            }
        }
    }
    private void aumentarVolume(Televisao televisao) {
        if (televisao.volume < 100)
            televisao.volume = televisao.volume + 1;
    }

    private void diminuirVolume(Televisao televisao) {
        if (televisao.volume > 0)
            televisao.volume = televisao.volume - 1;
    }

    private void diminuirCanal(Televisao televisao) {
        televisao.canal = televisao.canal - 1 ;
    }

    private void aumentarCanal(Televisao televisao) {
        televisao.canal = televisao.canal + 1 ;
    }

    private void mudarCanal(Televisao televisao, int novoCanal) {
        televisao.canal = novoCanal ;
    }

    private void mostrarStatusTelevisao(Televisao televisao) {
        System.out.println("Canal: " + televisao.canal);
        System.out.println("Volume: " + televisao.volume);
    }
}
