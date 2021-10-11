package kr.deity.server.api.sample.db;

import lombok.Data;

@Data
public class DefaultDomain {

    private String uuid;

    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
}
