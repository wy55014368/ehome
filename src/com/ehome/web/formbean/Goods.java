package com.ehome.web.formbean;

import java.util.HashMap;
import java.util.Map;

public class Goods {

	private String goodsName;
	private String weight;
	private String prices;

	private Map<String, String> errors = new HashMap<String, String>();

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPrices() {
		return prices;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public boolean validate() {
		boolean isValidate = true;

		if (goodsName == null || goodsName.equals("")) {
			isValidate = false;
			errors.put("goodsName", "输入不能为空");
		} else {
			if (!goodsName.matches("^[\u4e00-\u9fa5]+$")) {
				isValidate = false;
				errors.put("goodsName", "输入只能是中文");
			} else {
				errors.put("goodsName", "输入合法");
			}
		}

		if (weight == null || weight.equals("")) {
			isValidate = false;
			errors.put("weight", "输入不能为空");
		} else {
			if (!weight.matches("^\\d.?\\d*$")) {
				isValidate = false;
				errors.put("weight", "输入必须是数值");
			} else {
				if (Double.parseDouble(weight) > 6.5) {
					isValidate = false;
					errors.put("weight", "输入必须在6.5之内");
				} else {
					errors.put("weight", "输入合法");
				}
			}
		}

		if (prices == null || prices.equals("")) {
			isValidate = false;
			errors.put("prices", "输入不能为空");
		} else {
			if (!prices.matches("^\\d.?\\d*$")) {
				isValidate = false;
				errors.put("prices", "输入必须是数值");
			} else {
				errors.put("prices", "输入合法");
			}
		}
		return isValidate;
	}

}
