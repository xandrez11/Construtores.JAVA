public abstract class Animal {
    // Atributos da classe Animal
    private String classe;
    private String locomocao;

    // Construtor da classe Animal
    public Animal(String classe, String locomocao) {
        this.classe = classe;
        this.locomocao = locomocao;
    }

    // Método abstrato para exibir informações específicas do animal
    public abstract void exibirInformacoes();
}
