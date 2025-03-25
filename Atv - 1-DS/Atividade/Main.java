package Atividade;

import java.util.Scanner;
import Atividade.Pessoa;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String S;
        int op;

        do {
            System.out.println("SISTEMA DE CADASTRO DE PESSOAS!");

            System.out.println("Escolha uma operacao: ");
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("2 - Editar dados de uma pessoa cadastrada: ");
            System.out.println("3 - Visualizar dados de uma pessoa cadastrada: ");
            System.out.println("4 - Excluir dados de uma pessoa cadastrada: ");
            System.out.println("5 - Sair: ");

            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cadastrando uma nova pessoa!");
                    System.out.println("Insira o nome da pessoa: ");
                    pessoa.setNome(ler.nextLine());
                    System.out.println("Insira a idade da pessoa: ");
                    pessoa.setIdade(ler.nextInt());
                    System.out.println("Insira o email da pessoa");
                    pessoa.setEmail(ler.nextString());

                    System.out.println("DADOS CADASTRADOS COM SUCESSO!");

                    break;
            
                case 2: 
                    System.out.println("EDITANDO DADOS DE UM CADASTRO");

                    System.out.prinln("Insira o novo nome da pessoa:");
                    pessoa.setNome(ler.nextLine());

                    System.out.println("Insira a nova idade da pessoa: ");
                    pessoa.setIdade(ler.nextInt());

                    System.out.println("Insira o novo email da pessoa: ");
                    pessoa.setEmail(ler.nextLine());

                    System.out.println("DADOS ATUALIZADOS COM SUCESSO!");
                    break;

                case 3: 
                    System.out.println("VISUALIZANDO DADOS CADASTRADOS!");

                    System.out.println("Nome: "+pessoa.getNome());
                    System.out.println("Idade: "+pessoa.getIdade());
                    System.out.println("Email: "+pessoa.getEmail());

                    break;

                case 4: 
                    System.out.println("EXCLUINDO DADOS CADASTRADOS!");

                    pessoa = new pessoa();
                    System.out.println("DADOS EXCLUIDOS!");
                    break;

                case 5:
                    System.out.println("SAINDO DO PROGRAMA!");
                    System.out.println("Você realmente deseja sair do programa? S/N");
                    S = ler.nextLine().toLowerCase();

                    if (S.equals("s")) {
                        System.out.println("SAINDO...");
                        break;
                    }

                    else if (S.equals("n")) {
                        System.out.println("RETORNADO AO MENU");
                        return;
                    }

                    else {
                        System.out.println("OPÇÂO INVÁLIDA!");
                        break;
                    }
                    break;

                default:
                    System.out.println("OPÇÂO INVÁLIDA!");
                    break;
            }
        } while(op != 5);
        
    }
}