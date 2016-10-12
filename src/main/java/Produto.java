import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"codigo", "descricao", "dataCadastro", "valor"})
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Codigo")
	private Integer codigo;
	
	@JsonProperty("Descrição")
	private String descricao;
	
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT)
	@JsonProperty("Valor")
	private BigDecimal valor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	@JsonProperty("Data Cadastro")
	private Date dataCadastro;
	
	public Produto() {
	}

	public Produto(Integer codigo, String descricao, BigDecimal valor, Date dataCadastro) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
	
}
