//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("camisa", 49.99, "camisa polo azul");
        Produto produto2 = new Produto("calça", 99.99, "calça jeans preta");

    // Imprimir detalhes dos produtos

        System.out.println("Detalhes do Produto 1:");
        produto1.imprimirDetalhes();

        System.out.println("\nDetalhes do Produto 2:");
        produto2.imprimirDetalhes();
        }
}