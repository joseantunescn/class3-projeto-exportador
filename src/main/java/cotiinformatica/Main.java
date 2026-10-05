package cotiinformatica;

import cotiinformatica.services.ProdutoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        var produtoService = new ProdutoService();

        produtoService.cadastrarproduto();


    }
}
