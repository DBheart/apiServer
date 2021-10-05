package kr.deity.server.api.sample.db;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class DefaultDomain {
    @Id
    private String uid;

    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;

    @Builder
    public DefaultDomain(String id,String user, String date){
        this.uid = id;
        this.createUser = user;
        this.updateUser = user;
        this.createDate = date;
        this.updateDate = date;
    }
}
