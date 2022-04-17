package com.emin.ACSocialMedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblposttotag")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostToTags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    long postid;
    long tagsid;
}
