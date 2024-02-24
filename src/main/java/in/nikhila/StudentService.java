package in.nikhila;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService {
@Autowired
	private StudentRepo repo;
	
	@PostMapping("/studentdetails")
	public String studDetails(@RequestBody StudentEntity e)
	{
		StudentEntity e1= new StudentEntity(2,e.getName(),e.getAge());
		repo.save(e1);
		return "details recorded";
	}
	@GetMapping("/getdetails")
	public List<StudentEntity> getDetails()
	{
		List<StudentEntity> e=repo.findAll();
		return e;
	}
	@GetMapping("/get")
	public String gethello()
	{
		return "hello";
	}
}
