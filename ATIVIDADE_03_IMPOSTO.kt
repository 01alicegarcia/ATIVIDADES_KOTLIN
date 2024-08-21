fun main() {
    var nome:String = "AliceGarcia"

    val preco:Double = 0.30
    val quantidade:Int = 9

    var taxaImposto: Double = 30.0 / 100.0
    var margemDeLucro:Double = 70.0 / 100.0

    var valorTotal:Double = preco * quantidade
    var valorComImposto:Double =  valorTotal + (valorTotal * taxaImposto)
    var precoDeVenda: Double = valorComImposto * (1 + margemDeLucro)


    val valorComImpostoFormatado = "R$%.2f".format(valorComImposto)
    val precoDeVendaFormatado = "R$%.2f".format(precoDeVenda)

    println("Produto: $nome")
    println("Valor Total com Impostos: $valorComImpostoFormatado")
    println("Preço de Venda Sugerido: $precoDeVendaFormatado")
}
