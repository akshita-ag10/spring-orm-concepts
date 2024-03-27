package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;


public class StudentDaoImpl implements StudentDao {
	
	HibernateTemplate hibTemplate ;
	
	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	public int insert (Student s) {
		int i = (int) this.hibTemplate.save(s);
		return i;
	}

	
}
