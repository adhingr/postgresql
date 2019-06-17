package project.postgresdatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import project.postgresdatabase.model.Companies;

@Component
public interface JPACompanyRepository extends JpaRepository<Companies, String> {

}
