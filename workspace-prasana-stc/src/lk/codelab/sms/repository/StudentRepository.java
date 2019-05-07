package lk.codelab.sms.repository;

import java.util.List;

import lk.codelab.sms.modal.Student;

public interface StudentRepository {

	List<Student> fethAllStudents();

}