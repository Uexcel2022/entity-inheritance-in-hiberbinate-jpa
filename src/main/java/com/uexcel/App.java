package com.uexcel;

import org.hibernate.annotations.SourceType;

import com.uexcel.entity.Computer;
import com.uexcel.entity.Desktop;
import com.uexcel.entity.Laptop;
import com.uexcel.persistence.CustomEntityManager;

import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = CustomEntityManager.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            // Laptop laptop = new Laptop();
            // laptop.setId(1L);
            // laptop.setName("DesertWind");
            // laptop.setBrand("Apple");
            // laptop.setPrice("$1500");

            // Desktop desktop = new Desktop();
            // desktop.setId(2L);
            // desktop.setName("ThouderStorm");
            // desktop.setBrand("Hp");
            // desktop.setPrice("$1000");

            // entityManager.persist(laptop);
            // entityManager.persist(desktop);

            // String sql = "SELECT c FROM Computer c";
            // entityManager.createQuery(sql, Computer.class)
            // .getResultList().forEach(System.out::println);
            // entityManager.getTransaction().commit();

            String sql = "SELECT c FROM Laptop c";
            entityManager.createQuery(sql, Laptop.class)
                    .getResultList().forEach(System.out::println);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }
}
