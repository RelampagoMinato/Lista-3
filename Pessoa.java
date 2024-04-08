class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String getMensagemIdade() {
        if (idade < 18) {
            return "Menor de idade";
        } else {
            return "Maior de idade";
        }
    }
}