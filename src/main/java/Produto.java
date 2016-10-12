import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String descricao;
	private BigDecimal valor;
	
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
