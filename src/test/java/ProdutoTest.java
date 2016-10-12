import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class ProdutoTest {

	@Test
	public void test(){
		Produto p1 = new Produto(1, "Produto1", BigDecimal.TEN, DateTime.now().toDate());
		Produto p2 = new Produto(2, "Produto2", new BigDecimal("100000.51"), DateTime.now().minusDays(1).toDate());
		Produto p3 = new Produto(3, "Produto3", new BigDecimal("50.51"), DateTime.now().minusDays(5).toDate());
		List<Produto>produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = mapper.schemaFor(Produto.class)
								 .withoutQuoteChar()
								// .sortedBy("codigo", "descricao", "dataCadastro", "valor")
								 .withColumnSeparator(';')
								 .withHeader();
		String csvContent = null;
		try {
			//mapper.addMixIn(Produto.class, ProdutoFormat.class);
			csvContent = mapper.writer(schema).writeValueAsString(produtos);
			File csvFile = new File("dados.csv");
			Files.write(csvContent, csvFile, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
		Assert.assertNotNull(csvContent);
		
	}
	
}
