package ru.stray27.project_backend.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.stray27.project_backend.entities.Settlement;

public interface SettlementRepository extends CrudRepository<Settlement, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL increasepopulation(:id)", nativeQuery = true)
    void increasePopulation(@Param("id") Integer id);
}
