package kr.deity.server.api.sample.user;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Auth {
    @Id
    private Long id;
    private String name;

    @Builder
    public Auth(Long id,String name){
        this.id = id;
        this.name = name;
    }
}
