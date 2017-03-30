package org.ws.ssh.action;

import org.ws.ssh.domain.Product;
import org.ws.ssh.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product =  new Product();
	//模型驱动使用的类
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts和Spring整合过程中的按名称自动注入的业务层类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/*
	 * 保存商品的执行方法:save
	 */
	public String save(){
		System.out.println("Action中的save方法执行了..."+product.getPname());
		productService.save(product);
		return NONE;
	}
	
	
}
