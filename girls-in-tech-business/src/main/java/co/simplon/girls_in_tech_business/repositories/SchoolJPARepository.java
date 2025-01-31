package co.simplon.girls_in_tech_business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.girls_in_tech_business.entities.School;

@Repository
public interface SchoolJPARepository extends JpaRepository<School, Long>{

}
