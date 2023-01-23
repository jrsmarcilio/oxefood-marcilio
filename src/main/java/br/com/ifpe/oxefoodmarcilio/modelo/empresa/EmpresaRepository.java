package br.com.ifpe.oxefoodmarcilio.modelo.empresa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>, JpaSpecificationExecutor<Empresa> {

	List<Empresa> findByChaveOrderByNomeFantasiaAsc(String chave);
	
	@Query(value = "SELECT e FROM Empresa e WHERE e.chave= :chave AND e.nomeFantasia = :nomeFantasia")
	Empresa findByChaveAndName(String chave, String nomeFantasia);

	@Query(value = "SELECT e FROM Empresa e WHERE e.id = :id AND e.chave = :chave")
	Empresa findByIdAndChave(Long id, String chave);

	@Query(value = "SELECT e FROM Empresa e WHERE e.chave = :chave")
	Empresa findByChave(String chave);

	List<Empresa> findByCategoriaId(Long id);
}
