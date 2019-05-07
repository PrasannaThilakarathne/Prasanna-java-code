package lk.codelab.sms.service;

import java.util.List;

import lk.codelab.sms.modal.Student;
import lk.codelab.sms.repository.HibernateStudentRepository;
import lk.codelab.sms.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	
	StudentRepository repository ; //new HibernateStudentRepository();
	public StudentRepository getRepository() {
		return repository;
	}
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}
	/* (non-Javadoc)
	 * @see lk.codelab.sms.service.StudentService#fetchAllStudent()
	 */
	@Override
	public List<Student> fetchAllStudent(){
		return repository.fethAllStudents();
	}
}
