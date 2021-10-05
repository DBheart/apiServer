package kr.deity.server.api.sample.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultDomainRepository extends JpaRepository<DefaultDomain,String> {
}
