package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * ProductVO
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 1:30
 * Modified by:
 */
@Data
public class ProductVO {

	@JsonProperty("name")
	private String categoryName;

	@JsonProperty("type")
	private Integer categoryType;

	@JsonProperty("foods")
	List<ProductInfoVO> productInfoVOList;
}
