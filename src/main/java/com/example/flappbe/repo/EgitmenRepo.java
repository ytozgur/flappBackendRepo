package com.example.flappbe.repo;

import com.example.flappbe.model.egitmen.EgitmenModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EgitmenRepo extends JpaRepository<EgitmenModel, Long> {
}
