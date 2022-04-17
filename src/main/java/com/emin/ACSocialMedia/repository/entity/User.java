package com.emin.ACSocialMedia.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Pojo ile ilgili eklenmesi gereken kodların karmaşıklığını azaltmak ve daha kolay bir
 * kullanım sağlamak amacıyla Lambok Project geliştirilimtir. Kullanım için anatasyonlarının eklemek yeterli
 */

@Table(name = "tbluser")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String username;
    String borndate;
    String email;
    String phone;
    String avatar;
    String phonetoken;
    long createprofile;



}
