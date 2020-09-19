package com.andremata.apppesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.andremata.apppesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {

	@Query("SELECT obj FROM Record obj WHERE "
			+ "(COALESCE(:minData, NULL) IS NULL OR obj.moment >= :minData) AND "
			+ "(COALESCE(:maxData, NULL) IS NULL OR obj.moment <= :maxData)")
	Page<Record> consultar(Instant minData, Instant maxData, Pageable pageable);
}
