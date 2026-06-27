package com.example.demo.Entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NOMBRE",length =100)
    private String nombre;

    @Column(name = "PRECIO",precision = 10 , scale = 2)
    private BigDecimal precio;



    public Integer getId(){return  id;}
    public void setId(Integer id){this.id=id;}

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}

    public BigDecimal getPrecio(){return precio;}
    public void setPrecio(BigDecimal precio){
        if(precio.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("no se puede usar un numero negatio o neutro de precio");
        } this.precio=precio;


    }

}
