/*2.1 - Exercício do CPF
Crie 4 classes dentro do mesmo pacote segundo os critérios abaixo:
• Classe 1: deve ter o método principal, que use o switch para criar 
ou validar um CPF.
• Classe 2: deve ter dois métodos com o mesmo nome e parâmetros diferentes
(sobrecarga de método);
o Um método deve receber o número de CPF (String), converter para array int e
verificar se o mesmo é válido ou não e retornar um valor boolean (true para CPF
válido e false para CPF inválido).
o O outro método não deve receber parâmetro algum, mas deve retornar um
número de CPF válido como sendo um array int.
• Classe 3: deve ler um número de CPF, chamar o método que valida o CPF e de
acordo com a resposta do tipo boolean, informar se o CPF é válido ou não.
• Classe 4: deve chamar o método que cria um CPF e mostrar o número gerado no
formato array int.*/

public class metodo{
    public static void main(String[] args){
    //OPÇÃO PARA USER
        System.out.println("1-Validar o CPF");
        System.out.println("2-Criar o CPF");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int opcao = sc.nextInt();

    //SWITCH P/ OPÇÕES
        switch(opcao){
            case 1: 
                System.out.println("Digite o CPF: ");
                String cpf = sc.next();
                CPFValidator validator = new CPFValidator();
                boolean isValid = validator.validarCPF(cpf);
                System.out.println("CPF " + (isValid ? "válido" : "inválido"));
                break;
            case 2:
                CPFGenerator generator = new CPFGenerator();
                int[] cpfGerado = generator.gerarCPF();
                System.out.print("CPF Gerado: ");
                for (int digit : cpfGerado){
                    System.out.print(digit);
                }
                System.out.println();
                break;
            default:
            System.out.println("Opção inválida.");
                break;
        }
    }
}