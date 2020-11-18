package com.run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Person;

public class Runner {

	  public static void main(String[] args) {
		  EntityManagerFactory em= Persistence.createEntityManagerFactory("myjpa");
		  EntityManager e= em.createEntityManager();
		  EntityTransaction t= e.getTransaction();
		  t.begin();
		  Person p=new Person(5024,"Tharun","Chennai");
		  e.persist(p); // jpa understands that you create a new row
		 
		  t.commit();
		  Query q =e.createQuery("Select p from Person p");
		  List<Person> l=q.getResultList();
		  System.out.println(l);
		  e.close();
	}
}
