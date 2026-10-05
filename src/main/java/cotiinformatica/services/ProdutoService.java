package cotiinformatica.services;

import cotiinformatica.entities.Produto;
import cotiinformatica.interfaces.ProdutoRepository;
import cotiinformatica.repositories.ProdutoJsonRepository;
import cotiinformatica.repositories.ProdutoXmlRepository;

import javax.swing.*;
import java.util.Date;
import java.util.UUID;

public class ProdutoService {

    public void cadastrarproduto () {
        var produto = new Produto();

        produto.setId(UUID.randomUUID());
        produto.setDataHoraCadastro(new Date());
        produto.setNome(JOptionPane.showInputDialog("Informe o nme do produto: "));
        produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("informe o preco: ")));
        produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o quantidade: ")));

        var opcao = JOptionPane.showInputDialog("Informe 1 para xml ou 2 para json:");

        ProdutoRepository produtoRepository;

        switch (Integer.parseInt(opcao)) {
            case 1:
                produtoRepository = new ProdutoXmlRepository();
                break;

            case 2:
                produtoRepository = new ProdutoJsonRepository();
                break;

            default:
                JOptionPane.showInputDialog(null, "Opção inválida");
                return;
        }

    }

}
