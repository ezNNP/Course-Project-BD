package ru.stray27.project_backend.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.stray27.project_backend.entities.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL eatFood(:s_id)", nativeQuery = true)
    void eatFood(@Param("s_id") Integer settlementId);
}
