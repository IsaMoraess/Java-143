import java.util.Random;

public class CPFGenerator {
    // METODO P/ GERAR UM CPF
    public int[] gerarCPF() {
        Random rand = new Random();
        int[] cpf = new int[11];

    // GERANDO OS PRIMEIROS 9 DÍGITOS
        for (int i = 0; i < 9; i++) {
            cpf[i] = rand.nextInt(10); // DIGITO ALEATORIO
        }

    // CALCULO DOS DÍGITOS VERIFICADOS
        cpf[9] = calcularDigito(cpf, 9); // 10 DIGITOS
        cpf[10] = calcularDigito(cpf, 10); // 11 DIGITOS

        return cpf;
    }

    //METODO P/ CALCULAR O DIGITO VERIFICADO
    private int calcularDigito(int[] cpf, int pos) {
        int soma = 0;
        for(int i = 0; i < pos; i++){
            soma += cpf[i] * (pos + 1 - i);
        }
        int digito = 11 - (soma % 11);
        return (digito > 9) ? 0 : digito; //RETORNA 0 SE MAIOR Q 9
    }
}
