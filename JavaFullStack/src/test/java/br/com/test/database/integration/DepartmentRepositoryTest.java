package br.com.test.database.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.javafullstack.init.WebAppConfig;
import br.com.javafullstack.model.Department;
import br.com.javafullstack.service.DepartmentServiceImpl;
import junit.framework.Assert;

@ContextConfiguration(classes={WebAppConfig.class})
@ActiveProfiles("test")
@Transactional
@TransactionConfiguration(defaultRollback=true)
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentRepositoryTest {
		
	@Autowired
	private DepartmentServiceImpl departmentService;
	
	@Test
	public void testCreate() {
		
		//this.context.register(WebAppConfig.class);
		Department d = new Department();
		d.setDepartmentName("DEPO 1");
		d.setDepartmentDescription("DESC");
		d = departmentService.create(d);
		
		Assert.assertTrue(d.getDepartmentId() > 0);
		departmentService.delete(d.getDepartmentId());
		
	}

}
