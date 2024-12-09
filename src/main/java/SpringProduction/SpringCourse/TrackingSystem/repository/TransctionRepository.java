package SpringProduction.SpringCourse.TrackingSystem.repository;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransctionRepository  extends JpaRepository <Transaction, Integer>  {

}
