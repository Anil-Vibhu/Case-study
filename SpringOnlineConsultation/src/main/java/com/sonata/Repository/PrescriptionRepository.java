package com.sonata.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Prescription;



@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{



}