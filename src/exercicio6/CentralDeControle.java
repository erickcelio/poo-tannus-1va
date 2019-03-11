package exercicio6;

import java.util.Scanner;

public class CentralDeControle {
    private Controlador controlador = new Controlador(666);
    public void menu(Scanner ler) {
        boolean exec = true;
        while (exec) {
            System.out.println("Selecione uma opção:");
            if (controlador.isAtivo()) {
                System.out.println("1 - Desligar Sistema");
                System.out.println("2 - Verificar Sensores");
                System.out.println("3 - Ligar Sensor");
                System.out.println("4 - Desligar Sensor");
                System.out.println("5 - Testar Sensor");
            } else {
                System.out.println("1 - Ligar Sistema");
            }
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o código de segurança:");
                    if (controlador.verificarCodigo(ler.nextInt())){
                        if (controlador.isAlarmeAtivado())
                            controlador.desativarAlarmes();
                        else
                            controlador.ligarSistema();
                    }
                    break;
                case 2:
                    if (controlador.isAtivo())
                        controlador.mostrarStatusSensores();
                    else
                        System.out.println("Opção inválida");
                    break;
                case 3:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresDesligados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.ligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 4:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.desligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 5:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.testarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    if (opcao != controlador.getCodSeguranca())
                        System.out.println("Opção inválida");
                    else
                        controlador.desativarAlarmes();
                    break;
            }
        }
    }
}
