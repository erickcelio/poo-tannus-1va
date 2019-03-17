import exercicio1.Aluno;
import exercicio2.Pessoa;
import exercicio3.ContaCorrente;
import exercicio4.BombaDAgua;
import exercicio5.UsaGps;
import exercicio6.CentralDeControle;
import exercicio7.ControleRemoto;
import exercicio8.NumeroComplexo;

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
                case 8:
                    exercicio8(ler);
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

    public static void exercicio8(Scanner ler) {
        boolean exec = true;
        double real = 0;
        double imaginaria = 0;
        NumeroComplexo numero = new NumeroComplexo();
        while (exec) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inicializar número");
            System.out.println("2 - Somar número");
            System.out.println("3 - Subtrair número");
            System.out.println("4 - Multiplicar número");
            System.out.println("5 - Dividir número");
            System.out.println("6 - Visualizar número");
            System.out.println("7 - Visualizar igualdade");
            System.out.println("0 - Sair");
            switch (ler.nextInt()) {
                case 1:
                    System.out.printf("Digite a parte real: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária: ");
                    imaginaria = ler.nextDouble();
                    numero.inicializaNumero(real, imaginaria);
                    System.out.println("Número inicializado com sucesso!");
                    break;
                case 2:
                    System.out.printf("Digite a parte real do numero a ser somado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser somado: ");
                    imaginaria = ler.nextDouble();
                    numero.somar(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número somado com sucesso!");
                    break;
                case 3:
                    System.out.printf("Digite a parte real do numero a ser subtraido: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser subtraido: ");
                    imaginaria = ler.nextDouble();
                    numero.subtrair(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número subtraido com sucesso!");
                    break;
                case 4:
                    System.out.printf("Digite a parte real do numero a ser multiplicado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser multiplicado: ");
                    imaginaria = ler.nextDouble();
                    numero.multiplica(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número multiplicado com sucesso!");
                    break;
                case 5:
                    System.out.printf("Digite a parte real do numero a ser dividido: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser dividido: ");
                    imaginaria = ler.nextDouble();
                    numero.dividir(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número dividido com sucesso!");
                    break;
                case 6:
                    numero.imprimeNumero();
                    break;
                case 7:
                    System.out.printf("Digite a parte real do numero a verificado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser verificado: ");
                    imaginaria = ler.nextDouble();
                    if (numero.eIgual(new NumeroComplexo(real, imaginaria))) {
                        System.out.println("Os dois números complexos são iguais!");
                    } else {
                        System.out.println("Os dois números complexos não são iguais!");
                    }
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

}
