package cotiinformatica.repositories;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import cotiinformatica.entities.Produto;
import cotiinformatica.interfaces.ProdutoRepository;

import java.io.File;

public class ProdutoJsonRepository implements ProdutoRepository  {

    @Override
    public void exportarDados(Produto produto) throws Exception {

        var mapper = new JsonMapper();

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("c:\\temp\\produto_"+ produto.getId() +".json"),
                produto
        );

    }
}
