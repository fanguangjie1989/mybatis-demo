package examples.mybatis.mapper;

import java.util.List;

import examples.mybatis.entity.Orders;
import examples.mybatis.entity.OrdersCustom;

public interface OrdersCustomMapper {
	/**
	 * 关联查询订单用户信息resulttype
	 * @return
	 * @throws Exception
	 */
	List<OrdersCustom> findOrdersUsers()  throws Exception;
	/**
	 * 用户订单关联查询resultMap
	 * @return
	 * @throws Exception
	 */
	List<Orders> findOrdersUsersResultMap() throws Exception;
	/**
	 * 用户订单订单详情关联查询resultMap
	 * @return
	 * @throws Exception
	 */
	List<Orders> findOrdersUsersOrderDetailResultMap() throws Exception;
	/**
	 * 用户订单订单详情关联查询resultMap
	 * @return
	 * @throws Exception
	 */
	List<Orders> findOrdersUsersOrderDetailItemsResultMap() throws Exception;
}
