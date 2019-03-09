import exercicio1.Aluno;
import exercicio2.Pessoa;
import exercicio3.ContaCorrente;
import exercicio4.BombaDAgua;
import exercicio5.UsaGps;
import exercicio6.CentralDeControle;
import exercicio7.ControleRemoto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroExercicio = 0;
        boolean exec = true;
        while (exec) {
            System.out.print("Selecione o numero do exercício ou digite 0 para sair: ");
            numeroExercicio = ler.nextInt();
            switch (numeroExercicio) {
                case 0:
                    exec = false;
                    break;
                case 1:
                    exercicio1(ler);
                    break;
                case 2:
                    exercicio2(ler);
                    break;
                case 3:
                    exercicio3(ler);
                    break;
                case 4:
                    exercicio4(ler);
                    break;
                case 5:
                    exercicio5(ler);
                    break;
                case 6:
                    exercicio6(ler);
                    break;
                case 7:
                    exercicio7();
                    break;
                default:
                    System.out.println("Número do exercício inválido!");
                    break;
            }
        }
    }

    public static void exercicio1(Scanner ler) {
        double[] notas = {0, 0, 0, 0};
        System.out.printf("Digite o nome do Aluno: ");
        String nome = ler.next();
        System.out.printf("Digite a sala do Aluno: ");
        String sala = ler.next();
        System.out.printf("Digite a 1 nota do Aluno: ");
        notas[0] = ler.nextDouble();
        System.out.printf("Digite a 2 nota do Aluno: ");
        notas[1] = ler.nextDouble();
        System.out.printf("Digite a 3 nota do Aluno: ");
        notas[2] = ler.nextDouble();
        System.out.printf("Digite a 4 nota do Aluno: ");
        notas[3] = ler.nextDouble();

        Aluno aluno = new Aluno(nome, notas, sala);

        System.out.println("---------------------");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sala: " + aluno.getSala());
        System.out.println("Média: " + aluno.getMedia());
        System.out.println("---------------------");
    }

    public static void exercicio2(Scanner ler) {
        String x[] = {"A","B","C","D","E","F","G","H","I","J"};
        Pessoa pessoa = new Pessoa("Erick", 20, "M", x);
        boolean exec = true;
        while (exec){
            System.out.println("Selecione a Opção");
            System.out.println("1 - Visualizar algum elemento de X");
            System.out.println("2 - Visualizar todos elementos de X");
            System.out.println("0 - Sair do exercício");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 0:
                    exec = false;
                    break;
                case 1:
                    System.out.print("Digite a posição do elemento desejado de 1 a 10: ");
                    int el = ler.nextInt();
                    if (el > 10 || el < 1) {
                        System.out.println("Elemento inválido!");
                    } else {
                        pessoa.showElementX(el);
                    }
                    break;
                case 2:
                    pessoa.showAllElementsX();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void exercicio3(Scanner ler) {
        System.out.printf("Digite o número da conta: ");
        int numero = ler.nextInt();
        ContaCorrente conta = new ContaCorrente(numero);
        boolean exec = true;
        while (exec) {
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Saldo Atual: " + conta.getSaldo());
            System.out.println("Selecione uma opção abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();
            switch (op) {
                case 0:
                    exec = false;
                    break;
                case 1:
                    System.out.printf("Digite o valor a ser depositado: ");
                    double valD = ler.nextDouble();
                    conta.depositar(valD);
                    break;
                case 2:
                    System.out.printf("Digite o valor a ser sacado: ");
                    double valS = ler.nextDouble();
                    conta.sacar(valS);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void exercicio4(Scanner ler) {
        BombaDAgua bomba = new BombaDAgua();
        boolean exec = true;
        while (exec) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ligar a bomba");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Digite o tempo para a bomba ficar ligada em segundos:");
                    int second = ler.nextInt();
                    bomba.ligar(second);
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void exercicio5(Scanner ler) {
        UsaGps usaGps = new UsaGps();
        usaGps.main(ler);
    }

    public static void exercicio6(Scanner ler) {
        CentralDeControle central = new CentralDeControle();
        central.menu(ler);
    }

    public static void exercicio7() {
        ControleRemoto controle = new ControleRemoto();
        controle.main();
    }

}
