package br.com.ifpe.oxefoodmarcilio.servicos.cupomDesconto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefoodmarcilio.modelo.cupomDesconto.CupomDesconto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CupomDescontoRequest {

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataInicioVigencia;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataFimVigencia;

	private String chaveEmpresa;

	private String codigoDesconto;

	private Double percentualDesconto;

	private Double valorDesconto;

	private Double valorMinimoPedidoPermitido;

	private int quantidadeUso;

	public CupomDesconto buildCupomDesconto() {
		return CupomDesconto.builder().chaveEmpresa(chaveEmpresa).codigoDesconto(codigoDesconto)
				.percentualDesconto(percentualDesconto).valorDesconto(valorDesconto)
				.valorMinimoPedidoPermitido(valorMinimoPedidoPermitido).quantidadeUso(quantidadeUso)
				.dataInicioVigencia(dataInicioVigencia).dataFimVigencia(dataFimVigencia).build();
	}
}
