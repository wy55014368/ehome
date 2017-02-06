package com.ehome.entity;

public class Waybill {

	private String wb_Id;//主键ID
	private String goodsWaybillId;//货物运单号
	
	private String  wayPersonName;//配送人姓名
	private String  wayPersonNumber;//配送人电话
	
	private String  consigneeName;//收货人姓名
	private String  consigneeNum;//收货人电话
	private String  consigneeAddress;//收货人地址
	
	private String  consignerName;//发货人姓名
	private String  consignerNumber;//发货人电话
	private String  consignerAddress;//发货人地址
	public String getWb_Id() {
		return wb_Id;
	}
	public void setWb_Id(String wb_Id) {
		this.wb_Id = wb_Id;
	}
	public String getGoodsWaybillId() {
		return goodsWaybillId;
	}
	public void setGoodsWaybillId(String goodsWaybillId) {
		this.goodsWaybillId = goodsWaybillId;
	}
	public String getWayPersonName() {
		return wayPersonName;
	}
	public void setWayPersonName(String wayPersonName) {
		this.wayPersonName = wayPersonName;
	}
	public String getWayPersonNumber() {
		return wayPersonNumber;
	}
	public void setWayPersonNumber(String wayPersonNumber) {
		this.wayPersonNumber = wayPersonNumber;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	public String getConsigneeNum() {
		return consigneeNum;
	}
	public void setConsigneeNum(String consigneeNum) {
		this.consigneeNum = consigneeNum;
	}
	public String getConsigneeAddress() {
		return consigneeAddress;
	}
	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	public String getConsignerName() {
		return consignerName;
	}
	public void setConsignerName(String consignerName) {
		this.consignerName = consignerName;
	}
	public String getConsignerNumber() {
		return consignerNumber;
	}
	public void setConsignerNumber(String consignerNumber) {
		this.consignerNumber = consignerNumber;
	}
	public String getConsignerAddress() {
		return consignerAddress;
	}
	public void setConsignerAddress(String consignerAddress) {
		this.consignerAddress = consignerAddress;
	}
	public Waybill(String wb_Id, String goodsWaybillId, String wayPersonName, String wayPersonNumber,
			String consigneeName, String consigneeNum, String consigneeAddress, String consignerName,
			String consignerNumber, String consignerAddress) {
		super();
		this.wb_Id = wb_Id;
		this.goodsWaybillId = goodsWaybillId;
		this.wayPersonName = wayPersonName;
		this.wayPersonNumber = wayPersonNumber;
		this.consigneeName = consigneeName;
		this.consigneeNum = consigneeNum;
		this.consigneeAddress = consigneeAddress;
		this.consignerName = consignerName;
		this.consignerNumber = consignerNumber;
		this.consignerAddress = consignerAddress;
	}
	
	public Waybill(){
		
	}
	@Override
	public String toString() {
		return "Waybill [wb_Id=" + wb_Id + ", goodsWaybillId=" + goodsWaybillId + ", wayPersonName=" + wayPersonName
				+ ", wayPersonNumber=" + wayPersonNumber + ", consigneeName=" + consigneeName + ", consigneeNum="
				+ consigneeNum + ", consigneeAddress=" + consigneeAddress + ", consignerName=" + consignerName
				+ ", consignerNumber=" + consignerNumber + ", consignerAddress=" + consignerAddress + "]";
	}
	
	
	
}
