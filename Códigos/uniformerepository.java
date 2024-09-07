package com.xsauniformes.repository;

import com.xsauniformes.model.Uniforme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniformeRepository extends JpaRepository<Uniforme, Long> {
}
