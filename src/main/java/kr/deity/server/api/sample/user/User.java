package kr.deity.server.api.sample.user;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String userName;
    private String address;
    private String phone;

    @Builder
    User(String id, String userName){
        this.id = id;
        this.userName = userName;
    }
}
