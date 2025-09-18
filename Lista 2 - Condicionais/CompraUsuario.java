/*
    Pergunte ao usuário o valor unitário de um produto e a quantidade que ele quer
    comprar desse produto. Se a quantidade for até 12, o valor do produto é valor
    unitário normal vezes a quantidade. Se ele comprar mais do que 12, o valor terá
    um desconto de 10% ou o valor total da compra. Mostre o valor da compra baseado nessas
    condições.
 */

public class CompraUsuario {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo!");

        System.out.println("Qual produto você gostaria de comprar?");
        String nomeProduto = nextLine();
        System.out.println("Qual o valor dele?");
        int valorProduto = nextInt();
        System.out.println("Quantas unidades você gostaria de comprar deste produto?");
        int quantidadeProduto = nextInt();

        if (quantidadeProduto >= 12){
            double valorDesconto = (valorProduto / 100.0);
            double valorFinal = valorProduto - valorDesconto;
        } else if (quantidadeProduto < 12){
            double valorProduto * quantidadeProduto;
        }
        {

        }
    }
}
