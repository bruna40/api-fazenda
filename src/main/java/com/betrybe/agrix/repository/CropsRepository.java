package com.betrybe.agrix.repository;

import com.betrybe.agrix.entity.CropsEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Crops repository.
 */
@Repository
public interface CropsRepository extends JpaRepository<CropsEntity, Long> {
  List<CropsEntity> findByid(Long id);
  
  List<CropsEntity> findAllByFarmId(Long farmId);
}
