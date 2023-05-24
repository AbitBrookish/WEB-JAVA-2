package org.generation.dependencies_injection.service;
import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServicelmpl implements StudentService {
    private List<Student> students;

    public StudentServicelmpl(){
        this.students = new ArrayList<>();
        addTestStudents();
    }

    private void addTestStudents(){
        Student newStudent1 = new Student("sophmore",10,"Alan","Johnson",2 );
        Student newStudent2 = new Student("freshmore",444,"Juliette","E",2 );
        Student newStudent3 = new Student("senior",411,"Jamilla","Theren",2 );

        students.add(newStudent1);
        students.add(newStudent2);
        students.add(newStudent3);
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public List<Student> all() {
        return students;
    }

    @Override
    public Student findById(String id) {
        for (Student student : students) {
            if (student.getIdStudent().equals(String.valueOf(id))) {
                return student;
            }
        }
        return null;
    }


}
