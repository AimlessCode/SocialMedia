package com.emin.ACSocialMedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblfollow")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id ;
    long userid;
    long followid;
    /**
     * eğer bir kişi bir kişiyi takip etmiyorsa bu değer ya hiç yoktur yada 0'dır
     * 0-> takip etmiyor
     * 1-> takip ediyor
     * 2-> takip istegi göndermiş onayda bekliyor.
     */
    int status;


}
