package com.ehome.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.entity.Waybill;
import com.ehome.service.IUserService;
import com.ehome.service.impl.UserServiceImpl;

//负责运单管理的socket
public class Order_manager extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		Map<String,String> wbMap = new HashMap<String,String>();
		IUserService ius = new UserServiceImpl();
		//从上一级获取的运单号
		String goodsWaybillId = "718000872256";
		try {
			Waybill wb = ius.select_wb(goodsWaybillId);
			if(wb != null){
				String wb_id = wb.getWb_Id();
				
				String wayPersonName = wb.getWayPersonName();
				String wayPersonNumber = wb.getWayPersonNumber();
				
				String consigneeName = wb.getConsigneeName();
				String consigneeNum = wb.getConsigneeNum();
				String consigneeAddress = wb.getConsigneeAddress();
				
				String consignerName = wb.getConsignerName();
				String consignerNumber = wb.getConsignerNumber();
				String consignerAddress = wb.getConsignerAddress();
				
				wbMap.put("wb_id", wb_id);
				wbMap.put("goodsWaybillId", goodsWaybillId);
				
				wbMap.put("wayPersonName", wayPersonName);
				wbMap.put("wayPersonNumber", wayPersonNumber);
				
				wbMap.put("consigneeName", consigneeName);
				wbMap.put("consigneeNum", consigneeNum);
				wbMap.put("consigneeAddress", consigneeAddress);
				
				wbMap.put("consignerName", consignerName);
				wbMap.put("consignerNumber", consignerNumber);
				wbMap.put("consignerAddress", consignerAddress);
				
				request.setAttribute("wbMap", wbMap);
				request.getRequestDispatcher("/WEB-INF/jsp/order_manager.jsp").forward(request, response);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
