package com.fusemachine.springdataJpa.Jpa.SingleTableStrategy.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fusemachine.springdataJpa.Jpa.SingleTableStrategy.entity.NonTeachingStaff;
import com.fusemachine.springdataJpa.Jpa.SingleTableStrategy.entity.TeachingStaff;

public class SaveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emFactory = null;
		try {
		emFactory = Persistence.createEntityManagerFactory("testingJpa");
		}catch(Exception e) {e.printStackTrace();}
		
		
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//Teaching Staff entity
		TeachingStaff ts1= new TeachingStaff(1,"Gopal","Msc Med","Maths");
		TeachingStaff ts2= new TeachingStaff(2,"manisha","bsc bed","english");
		
		//Non teaching staff entity
		NonTeachingStaff nts1= new NonTeachingStaff(3, "satish", "accounts");
		NonTeachingStaff nts2= new NonTeachingStaff(4, "krishna", "office");
		
		//Storing all entities
		entityManager.persist(ts1);
		entityManager.persist(ts2);
		entityManager.persist(nts1);
		entityManager.persist(nts2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emFactory.close();
	}

}
