public class Arara extends Animal{
    private int qtdeOvos;

    // Construtor da classe Arara
    public Arara(String classe, String locomocao, int qtdeOvos) {
        super(classe, locomocao);
        this.qtdeOvos = qtdeOvos;
    }

    // Método para exibir informações da arara
    @Override
    public void exibirInformacoes() {
        System.out.println("Classe:" + this.classe);
        System.out.println("Locomocao: " + this.locomocao);
        System.out.println("Qtde de ovos: " + this.qtdeOvos);
    }

    // Métodos getters para acessar os atributos da classe Arara
    public int getQtdeOvos() {
        return this.qtdeOvos;
    }
}
