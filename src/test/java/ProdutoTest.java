import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class ProdutoTest {

	@Test
	public void test(){
		Produto p1 = new Produto(1, "Produto1", BigDecimal.TEN, DateTime.now().toDate());
		Produto p2 = new Produto(1, "Produto2", new BigDecimal("100000.51"), DateTime.now().minusDays(1).toDate());
		
		List<Produto>produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = mapper.schemaFor(Produto.class).withoutQuoteChar().withColumnSeparator(';').withHeader();
		String result = null;
		try {
			mapper.addMixIn(Produto.class, ProdutoFormat.class);
			result = mapper.writer(schema).writeValueAsString(produtos);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		Assert.assertNotNull(result);
		
	}
	
}
