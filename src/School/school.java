package School;

import java.util.ArrayList;
import java.util.Scanner;

public class school {
    public static void main(String[] args) {
        ArrayList<Children> listaCrianca = new ArrayList<>();

        System.out.print("Seja bem vindo ao sistema de cadastro escolar");

        Scanner scanner = new Scanner(System.in);


        int selecionar;

        do {
            System.out.print("Escolha dentre as opções: 1 - Cadastrar uma nova criança / 2 - Listar crianças cadastradas / 0 - Sair");
            selecionar = scanner.nextInt();
            System.out.print("");

            switch (selecionar){
                case 1:

                    Children novaCrianca = new Children();
                    Class novaClasse = new Class();

                    System.out.print("Digite o nome da criança: ");
                    novaCrianca.nome = scanner.next();

                    System.out.print("Digite o sobrenome da criança: ");
                    novaCrianca.sobrenome = scanner.next();

                    System.out.print("Digite a data de nascimento da criança: ");
                    novaCrianca.dataNascimento = scanner.nextInt();

                    System.out.print("Digite o local de nascimento da criança: ");
                    novaCrianca.localNacimento = scanner.next();

                    System.out.print("Digite a professora: ");
                    novaClasse.professora =scanner.next();

                    System.out.print("Digite a sala de aula da criança: ");
                    novaClasse.sala = scanner.next();

                    novaCrianca.crianca= (Children) novaClasse;

                    listaCrianca.add(novaCrianca);

                    System.out.print("O cadastro foi realizado com sucesso!");
                    break;
                case 2:
                    if (!listaCrianca.isEmpty()){
                        for (Children cadaCrianca : listaCrianca){
                            System.out.print("");
                            System.out.print("Nome: "+cadaCrianca.nome);
                            System.out.print("Sobrenome: "+cadaCrianca.sobrenome);
                            System.out.print("");
                            System.out.print("Data de nascimento: "+cadaCrianca.dataNascimento);
                            System.out.print("");
                            System.out.print("Local de Nascimento: "+cadaCrianca.localNacimento);
                            System.out.print("");
                            System.out.print("Sua professora será: "+cadaCrianca.professora);
                            System.out.print("");
                            System.out.print("A sua sala é: "+cadaCrianca.sala);
                        }
                    }else {
                        System.out.print("Lista vazia!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.print("Opção invalida, digite uma opção válida para continuar.");
                    break;
            }
        }while (selecionar != 0);
    }
}
