package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) {
		// 전체조회하기 위해 시키기 위해 list가 필요하니까.
		ShopService<Cust,Cart> service
		= new ShopServiceImpl();

		List<Cart> list = null;
		try {
			list = service.myCart("id01");

			if (list.size() == 0) { // 바구니에 값이 하나도 없으면
				System.out.println("조회할 데이터가 없습니다.");
			} else { // 그게아니면 정상적으로 for문을 통해 전체출력
				for (Cart obj : list) {
					System.out.println(obj);
				}
			}
		} catch (Exception e) { // 조회할 값 없으면 예외처리
			System.out.println(e.getMessage());
		}
	}

}
