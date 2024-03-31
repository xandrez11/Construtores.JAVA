//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("Ave", "Asas", 1);

        System.out.println("Informações do Leao:");
        leao.exibirInformacoes();

        System.out.println("Informações da Arara:");
        arara.exibirInformacoes();
    }
}