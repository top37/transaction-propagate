package com.zyc.transactionpropagate;

import com.zyc.transactionpropagate.dao.AccCodeMapper;
import com.zyc.transactionpropagate.dao.TransinfoMapper;
import com.zyc.transactionpropagate.model.Transinfo;
import com.zyc.transactionpropagate.service.DepartmentService;
import com.zyc.transactionpropagate.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratoerAccTests {

	@Autowired
	private TransinfoMapper transinfoMapper;

	@Autowired
	private AccCodeMapper accCodeMapper;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@Test
	public void generator() {
		Transinfo fi = new Transinfo();
		fi.setA(1L);
		fi.setV("qiangge666");
		transinfoMapper.updateByPrimaryKeySelective(fi);
	}

	@Test
	@Transactional
	public void generator1() {
		accCodeMapper.updateGene();
		accCodeMapper.insertGene();
	}

	@Test
	public void contextLoads() {
		employeeService.addEmpByRequired("laoda");
	}

	@Test
	public void test0() {
		employeeService.addEmpBySupports("laoer");
	}

	@Test
	public void test1() {
		employeeService.addEmpByMandatory("laosan");
	}

	@Test
	public void test2() {
		employeeService.addEmpByRequiresNew("laosi");
	}

	@Test
	public void test3() {
		employeeService.addEmpByNotSupported("laowu");
	}

	@Test
	public void test4() {
		employeeService.addEmpByNever("laoliu");
	}

	@Test
	public void test5() {
		employeeService.addEmpByNested("laoqi");
	}
}
