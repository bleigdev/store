package com.core.store.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="productos")
public class productos implements Serializable {

    private static final long serialVersionUID = 4048798961366546485L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nombre_producto;

    @Column()
    private String costo;

    @Column()
    private String precio;

}
