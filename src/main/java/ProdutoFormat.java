import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public abstract class ProdutoFormat {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	public abstract Date getDataCadastro();
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT)
	public abstract BigDecimal getValor();

}
