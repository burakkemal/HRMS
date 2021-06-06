package kodlama.io.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.DepartmentService;
import kodlama.io.HRMS.core.utilities.results.DataResult;
import kodlama.io.HRMS.core.utilities.results.Result;
import kodlama.io.HRMS.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
	
private DepartmentService departmentService;
	
	@Autowired
	public DepartmentsController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Department department)
	{
		return departmentService.add(department);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Department>> getAll()
	{
		return departmentService.getAll();
	}
}
