package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Quizz;

public interface QuizzRepository extends JpaRepository<Quizz,Integer> {

}
