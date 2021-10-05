package kr.deity.server.api.sample.db;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultService {
    private DefaultDomainRepository defaultDomainRepository;

    public List<DefaultDomain> listAll(){
        return defaultDomainRepository.findAll();
    }
}
