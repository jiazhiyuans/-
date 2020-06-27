package com.aliEducation.entity.mysql;

import com.aliEducation.validator.isMobile;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="Mysql")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "header_url")
    private String headerUrl;
    @Column(name = "password")
    private String password;
    @isMobile()
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "create_time")
    private Date createTime;
}
