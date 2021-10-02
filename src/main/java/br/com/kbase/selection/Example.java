package br.com.kbase.selection;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Example {
    @Id
    @Column(name = "field01")
    private long field01;
}
