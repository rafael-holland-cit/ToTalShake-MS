package br.com.pagamentos.repository;

import br.com.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
