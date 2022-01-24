import com.company.Cliente;

public class Main {

    public static void main (String[]args) {
        Cliente Matheus = new Cliente();
        Matheus.setNome("Matheus");


        Conta cc = new ContaCorrente(Matheus);
        Conta poupança = new ContaPoupança(Matheus);

        ((ContaCorrente) cc).imprimirExtrato();
        ((ContaPoupança)poupança).imprimirExtrato();
    }

}
