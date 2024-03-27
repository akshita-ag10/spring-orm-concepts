package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student s = new Student(23, "Akshita", "Delhi");
//        Student stu = (Student) context.getBean("s");
        StudentDao  sDao = (StudentDao) context.getBean("studentDao");
        int rInserted = sDao.insert(s);
        System.out.println("rows inserted are : " + rInserted);
    }
}
