package com.karthik.in.service;

import com.karthik.in.entity.Professor;

import java.util.List;

public interface ProfessorService {

    Professor save(Professor professor);

    Professor getById(Long id);

    List<Professor> getAllProfessor();
}
