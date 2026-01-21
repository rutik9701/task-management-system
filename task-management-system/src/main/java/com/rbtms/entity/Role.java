@Entity
@Table(name = "roles")
package com.rbtms.entity;


import org.hibernate.annotations.NamedEntityGraph;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

     @Column(unique = true, nullable = false)
    private String name;
    
    
}
