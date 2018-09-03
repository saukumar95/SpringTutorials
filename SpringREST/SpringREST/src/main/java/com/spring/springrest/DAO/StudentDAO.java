/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.springrest.DAO;

import com.spring.springrest.model.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

    // Dummy database. Initialize with some dummy values.
    private static List students;

    {
        students = new ArrayList();
        students.add(new Student(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
        students.add(new Student(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
        students.add(new Student(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
    }

    /**
     * Returns list of customers from dummy database.
     *
     * @return list of customers
     */
    public List list() {
        return students;
    }

    /**
     * Return customer object for given id from dummy database. If customer is
     * not found for id, returns null.
     *
     * @param id customer id
     * @return customer object for given id
     */
    public Student get(Long id) {
        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }

    /**
     * Create new customer in dummy database. Updates the id and insert new
     * customer in list.
     *
     * @param student Customer object
     * @return customer object with updated id
     */
    public Student create(Student student) {
        student.setId(System.currentTimeMillis());
        students.add(student);
        return student;
    }

    /**
     * Delete the customer object from dummy database. If customer not found for
     * given id, returns null.
     *
     * @param id the customer id
     * @return id of deleted customer object
     */
    public Long delete(Long id) {

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            if (st.getId().equals(id)) {
                students.remove(st);
                return id;
            }
        }
        return null;

    }

    /**
     * Update the customer object for given id in dummy database. If customer
     * not exists, returns null
     *
     * @param id
     * @param student
     * @return customer object with id
     */
    public Student update(Long id, Student student) {

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            if (st.getId().equals(id)) {
                student.setId(st.getId());
                students.remove(st);
                students.add(student);
                return student;
            }
        }
        return null;
    }

}
