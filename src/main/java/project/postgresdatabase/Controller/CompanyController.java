package project.postgresdatabase.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.postgresdatabase.model.Companies;
import project.postgresdatabase.model.CompanyService;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/names")
    public List<Companies> getNames() {
        return companyService.getAll();
    }

    @RequestMapping("/find/{symbol}")
    public Companies findCompanies(@PathVariable(name="symbol") String symbol) {
        return companyService.findById(symbol);
    }

    @RequestMapping("/{id}/{name}")
    public Companies findCompanies2 (@PathVariable(name="id") String symbol, @PathVariable(name="name") String name) {
        return companyService.findById(symbol);
    }
}
