package crm.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.dao.ISysUserGroupDao;
import com.crm.pojo.SysUserGroup;

public class TestHibernate {
	@Test
	public void testConf(){
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		SysUserGroup sug = new SysUserGroup();
		sug.setIncumbent("管钱");
		sug.setName("财务部");
		sug.setPrincipal("小尚");
		s.save(sug);
		t.commit();
		s.close();
	}
	
	@Test
	public void testSysUserDao(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISysUserGroupDao su = (ISysUserGroupDao) ac.getBean(ISysUserGroupDao.SYS_USER_GROUP_SERVICE);
		SysUserGroup sug = new SysUserGroup();
		sug.setIncumbent("管钱");
		sug.setName("财务部");
		sug.setPrincipal("小尚");
		su.save(sug);
		
	}
}
