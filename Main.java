package Atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Atividade.Pessoa;

public class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();
    int op = 0;
    String S;

    do {
      System.out.println("Sistema de Cadastro de Pessoas!");
      System.out.println("Escolha a Operacao: ");

      System.out.println("1 - Cadastrar nova uma nova pessoa: ");
      System.out.println("2 - Editar dados de uma pessoa cadastrada: ");
      System.out.println("3 - Visualizar dados de uma pessoa cadastrada: ");
      System.out.println("4 - Excluir dados de uma pessoa cadastrada: ");
      System.out.println("5 - Sair: ");

      op = ler.nextInt();
      int i;

      switch (op) {
        case 1:

          Pessoa Pessoa = new Pessoa();

          System.out.println("Cadastrando uma nova pessoa!");

          System.out.println("insira o nome da pessoa: ");
          Pessoa.setNome(ler.nextLine());

          System.out.println("Insira a idade da pessoa: ");
          Pessoa.setIdade(ler.nextInt());

          System.out.println("Insira o Email da pessoa: ");
          Pessoa.setEmail(ler.nextLine());

          System.out.println("PESSOA CADASTRADA COM SUCESSO!");

          break;

        case 2:
          System.out.println("Editando dados de uma pessoa!");

          System.out.println("Escolha a pessoa de quem você irá editar os dados");
          for (i = 0; i < cadastro.size(); i++) {
            System.out.printf("1 %d - %s", i + 1, cadastro.get(i).getNome());
            i = ler.nextInt();

          }

          do {
            System.out.println("Escolha quais os dados você deseja alterar: ");

            System.out.println("1 - Nome");
            System.out.println("2 - Idade");
            System.out.println("3 - Email");

            op = ler.nextInt();

            switch (op) {
              case s1:

                cadastro.get(i).getNome();
                System.out.println("Insira o novo nome da pessoa: ");
                System.out.println("Você tem certeza que deseja alterar esse dado?");
                System.out.println("Insira S/N");
                S = ler.nextLine().toLowerCase();

                if (S.equals("s")) {
                  System.out.println("Altere o nome da pessoa");
                  Pessoa.setNome(ler.nextLine());

                  System.out.println("DADOS ATUALIZADOS COM SUCESSO!");
                } else if (S.equals("n")) {
                  break;

                } else {

                }

              case 2:
                cadastro.get(i).getIdade();
                System.out.println("Insira a nova idade da pessoa: ");
                System.out.println("Você tem certeza que deseja alterar esse dado?");
                System.out.println("Insira S/N");
                S = ler.nextLine().toLowerCase();

                if (S.equals("s")) {
                  System.out.println("Altere a idade da pessoa: ");
                  Pessoa.setIdade(ler.nextInt());

                  System.out.println("DADOS ATUALIZADOS COM SUCESSO!");
                }

                else if (S.equals("n")) {
                  break;
                } else {

                }

                cadastro.setIdade(ler.nextInt());
                break;

              case 3:
                cadastro.get(i).getEmail();
                System.out.println("Insira o novo email da pessoa: ");
                System.out.println("Você tem certeza que deseja alterar esse dado?");
                System.out.println("Insira S/N");
                S = ler.nextLine().toLowerCase();

                if (S.equals("s")) {
                  System.out.println("Altere o email da pessoa: ");
                  Pessoa.setEmail(ler.nextLine());

                  System.out.println("DADOS ATUALIZADOS COM SUCESSO");

                }
                break;

              default:
                break;
            }
          } while (op != 3);

        case 3:
          System.out.println("Visualizando cadastros!");

          System.out.println("Escolha um cadastro para visualizar seus dados: ");

          for (i = 0; i < cadastro.size(); i++) {

            System.out.printf(" 1 %d  - %s", i + 1, cadastro.get(i).getNome());
            i = ler.nextInt(cadastro);

          }

          System.out.printf("1 - %s", cadastro.get(i).getNome());
          System.out.printf("2 - %s", cadastro.get(i).getIdade());
          System.out.printf("3 - %s", cadastro.get(i).getEmail());

          break;

        case 4:
          System.out.println("Excluindo cadastros");

          for (i = 0; i < cadastro.size(); i++) {
            System.out.printf("1 %d - %s", i + 1, cadastro.get(i).getNome());
          }

          System.out.println("Escolha um cadastro para ser excluído");
          i = ler.nextInt(cadastro);
          System.out.println("Você tem certeza de que deseja excluir esse cadastro?");
          System.out.println("Insira S/N");
          S = ler.nextLine().toLowerCase();

          if (S.equals("s")) {
            cadastro.get(i).remove();

            System.out.println("CADASTRO REMOVIDO COM SUCESSO!");
          }

          else if (S.equals("n")) {
            System.out.println("OK! OPERACAO CANCELADA!");
            return;
          }

          else {
            System.out.println("ERRO! OPERACAO CANCELADA!");
          }
        
        case 5:
          System.out.println("Você tem crteza de que deseja sair do programa?");
          System.out.println("Insira S/N");
          S = ler.nextLine().toLowerCase();

          if (S.equals("s")) {
            break;
          } 
          else if (S.equals("n")) {
            return
          }
          else {
            return
          }
      }
    } while (op != 5);
  }
}