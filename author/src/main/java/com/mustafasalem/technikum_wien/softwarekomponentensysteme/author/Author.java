package com.mustafasalem.technikum_wien.softwarekomponentensysteme.author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @SequenceGenerator(name = "author_id_sequence", sequenceName = "author_id_sequence")
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "author_id_sequence")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password; // todo: hash in real deployment
}
