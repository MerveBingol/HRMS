package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitle;

//interface i interface'e extends edebiliriz
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> { // şuan Crud operasyonları hazır.
	
	

}
