package org.ws.ssh.service;

import org.springframework.transaction.annotation.Transactional;
import org.ws.ssh.dao.ProductDao;
import org.ws.ssh.domain.Product;

/**
 * @author jssjh
 * 
 * 商品管理的业务层类
 */
@Transactional
public class ProductService {
	//业务层注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	
	/**业务层保存商品的方法
	 * @param product
	 */
	public void save(Product product){
		System.out.println("Service中的save方法执行了..."+product.getPname());
		productDao.save(product);
	}
}
