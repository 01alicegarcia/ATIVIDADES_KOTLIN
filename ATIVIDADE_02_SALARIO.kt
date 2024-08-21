import java.text.DecimalFormat

fun main() {

    var nome: String = "Alice";
    var idade:Int = 22;
    var salario:Double = 2000.00;
    var mesesTrabalhados:Int = 10;
    var produtosComprados:Int = 6;

    var salarioAnualLiquido:Double = 0.0;


    var desconto: Double =  (salario * 0.25) * mesesTrabalhados;
    var mediaGastaPorProduto = 100/produtosComprados;
    salarioAnualLiquido = (salario * mesesTrabalhados) - desconto;

    val dec = DecimalFormat("#,###.00")


    println("Olá, $nome! Seu sálario anual líquido é: R$${dec.format(salarioAnualLiquido)} ");
    println("Você gastou em média por produto: R$$mediaGastaPorProduto");
    println("\nInformações adicionais:")
    println("Nome: $nome");
    println("Produtos: $produtosComprados");
    println("Idade: $idade");
    println("Meses trabalhados: $mesesTrabalhados");
    println("Média gasta por produtos: R$$mediaGastaPorProduto");
    println("Desconto: R$$desconto");
    println("Salário bruto: R$$salario")
}
