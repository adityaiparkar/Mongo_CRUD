package MongoDB_crud.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import MongoDB_crud.repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController 
{
		@Autowired
		public StudentRepository studentrepo ;
	
	
		@GetMapping(value = "/allstudents")
		public List<Student> getAllStudents()
		{
			return studentrepo.findAll() ;
		}
	
		@PostMapping(value = "/create")
		public String createStudent(@RequestBody Student student)
		{
			Student insertedStudent = studentrepo.insert(student) ;
			
			return "Student is created in DB " + insertedStudent.getName() ;
		}
}
