package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * ProductCategory
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-05 23:43
 * Modified by:
 */
@Data
@Entity
public class ProductCategory {
	@Id
	@GeneratedValue
	private Integer categoryId;

	/** 类目名字. */
	private String categoryName;

	/** 类目编号. */
	private Integer categoryType;

	private Date createTime;

	private Date updateTime;
}
