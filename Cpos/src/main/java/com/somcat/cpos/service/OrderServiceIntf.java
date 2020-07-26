package com.somcat.cpos.service;

import java.util.List;

import com.somcat.cpos.domain.Criterion;
import com.somcat.cpos.domain.OrderVO;

public interface OrderServiceIntf {
	public int registOrder(OrderVO ovo);
	public int modifyOrder(OrderVO ovo);
	public int cancelOrder(int order_no);
	public List<OrderVO> getList(Criterion cri, OrderVO ovo);
	public int getTotalCount(Criterion cri, OrderVO ovo);
}
