package com.emin.ACSocialMedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblfollower")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    /**
     * takip edilen kişi
     */
    long userid;
    /**
     * userid yi takip eden kişi
     */
    long followerid;
    int status;


}
