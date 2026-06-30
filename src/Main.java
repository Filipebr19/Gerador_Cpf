//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando os 8 primeiros dígitos do cpf
        int n;
        String cpf = "";

        for(int i = 0; i < 8; i++) {
            n = (int) ((int)0 + Math.random() * (10));
            cpf += Integer.toString(n);
        }
        // Definindo nono dígito como 7 = RJ
        cpf += "7";

        // Calculando décimo dígito
        int d1 = 0;
        int peso = 10;
        for(int i = 0; i < cpf.length(); i++) {
            char caracter = cpf.charAt(i);
            d1 += peso * Integer.parseInt(String.valueOf(caracter));
            peso--;
        }
        int res = d1 % 11;
        d1 = (res < 2) ? 0 : 11 - res;
        cpf += Integer.toString(d1);

        // Calculando o décimo primeiro dígito
        int d2 = 0;
        peso = 11;
        for(int i = 0; i < cpf.length(); i++) {
            char caracter = cpf.charAt(i);
            d2 += peso * Integer.parseInt(String.valueOf(caracter));
            peso--;
        }
        int res2 = d2 % 11;
        d2 = (res2 < 2) ? 0 : 11 - res2;
        cpf += Integer.toString(d2);

        // Cpf gerado
        System.out.println(cpf);
    }
}