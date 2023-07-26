package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Pedido;
import br.senai.sp.jandira.model.Produto;

public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.descricao = "Mouse";
        p1.valor = 100.00;

        p2.descricao = "Teclado ABNT2";
        p2.valor = 17.99;

        p3.descricao = "Pen Drive";
        p3.valor = 2.99;

        Cliente c1 = new Cliente();
        c1.nome = "Fabiana";
        c1.telefone = "45987495";
        c1.email = "fabiana@gmail.com";

        Pedido ped1 = new Pedido();
        ped1.cliente = c1;
        ped1.numero = 1;
        ped1.total= 500.00;
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);
        ped1.produtos.add(p3);

        ped1.mostrarPedido();

    }
}
