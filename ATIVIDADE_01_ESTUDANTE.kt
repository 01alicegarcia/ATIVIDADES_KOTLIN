fun main() {

    var nome: String = "";
    nome  = "Alice";

    var altura: Float = 1.50F;
    altura = 0.80F;


    val idade: Int = 15;
    val idadeDois: Int = 14;
    var idadeFinal: Int = 0;
    val identificaoAluno: Boolean = true;


    var comprimento: String = "E aí, $nome!";


    idadeFinal = idade + idadeDois;
    altura = altura * 2;


    fun estudante() {
        if (identificaoAluno == true) {
            return println("É um universitário: Sim!")
        } else {
            return println("É um universitário: Não!")
        }
    }


    println("Idade: $idadeFinal");
    println("Nome: $nome");
    println("Altura: $altura m");
    estudante();
    println("Comprimento: $comprimento");
}
