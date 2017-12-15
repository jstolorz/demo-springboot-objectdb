package org.reddragon.objectdb.demo.demoobjectdb.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;
    private String description;

}
