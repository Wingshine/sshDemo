package org.ws.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.ws.ssh.domain.Product;

public class ProductDao  extends HibernateDaoSupport{
	
	public void save(Product product){
		System.out.println("dao中的save方法执行了..."+product.getPname());
		this.getHibernateTemplate().save(product);
		
	}
}
