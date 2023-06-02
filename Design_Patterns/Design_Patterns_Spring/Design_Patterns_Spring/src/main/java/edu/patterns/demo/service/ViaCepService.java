package edu.patterns.demo.service;

import edu.patterns.demo.model.Address;
import org.hibernate.cache.cfg.internal.AbstractDomainDataCachingConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Address verifyCep(@PathVariable("cep") String cep);

}
