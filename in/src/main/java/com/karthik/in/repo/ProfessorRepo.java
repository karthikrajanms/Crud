package com.karthik.in.repo;

import com.karthik.in.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepo extends JpaRepository<Professor,Long> {
}
