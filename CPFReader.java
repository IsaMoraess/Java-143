import java.util.Scanner;
public class CPFReader {
    public void lerEValidarCPF(){
    //METODO P/ LER E VALIDAR CPF
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = sc.next();
        CPFValidator validator = new CPFValidator();
        boolean isValid = validator.validarCPF(cpf);
        System.out.println("CPF " + (isValid ? "válido" : "inválido"));
    }
}
