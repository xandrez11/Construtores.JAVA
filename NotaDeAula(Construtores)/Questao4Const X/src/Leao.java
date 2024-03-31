public class Leao extends Animal{
    private String pelo;

    // Construtor da classe Leao
    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    // Método para exibir informações do leão
    public void exibirInformacoes() {
        System.out.println("Classe: " + this.classe);
        System.out.println("Locomocao: " + this.locomocao);
        System.out.println("Pelo: " + this.pelo);
    }
}
