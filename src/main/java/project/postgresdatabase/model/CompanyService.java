package project.postgresdatabase.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.postgresdatabase.JPACompanyRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    JPACompanyRepository repository;


    public Companies findById(String symbol) {
        return repository.findById(symbol).orElse(null);
    }
    public List<Companies> getAll() {
        return repository.findAll();
    }
//
//    public void create(Companies companies) {
//        repository.save(companies);
//    }
//
//    public void update (Companies companies) {
//        Companies update = repository.findById(companies.getId()).orElse(null);
//        update.setName(companies.getName());
//        repository.save(update);
//    }

//    public void delete(Long id) {
//        repository.delete(id);
//    }
}
