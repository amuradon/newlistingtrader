package cz.amuradon.tralon.newlistingtrader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

import cz.amuradon.tralon.newlistingtrager.ComputeInitialPrice;
import cz.amuradon.tralon.newlistingtrager.ExchangeInfo;
import cz.amuradon.tralon.newlistingtrager.OrderBook;
import cz.amuradon.tralon.newlistingtrager.SymbolInfo;

public class ComputeInitialPriceTest {

	@Test
	public void test() {
		ComputeInitialPrice compute = new ComputeInitialPrice("20.0");
		List<List<BigDecimal>> asks = new ArrayList<>();
		asks.add(Lists.newArrayList(new BigDecimal("0.3"), new BigDecimal("5")));
		asks.add(Lists.newArrayList(new BigDecimal("0.35"), new BigDecimal("20")));
		asks.add(Lists.newArrayList(new BigDecimal("0.36"), new BigDecimal("30")));
		
		OrderBook orderBook = new OrderBook(null, asks); 
		BigDecimal result = compute.execute("VPTUSDT",
				new ExchangeInfo(Collections.singletonList(
						new SymbolInfo("VPTUSDT", "VPT", "USDT", 1, true, 2, 6, 6))),
				orderBook);
		Assertions.assertEquals(new BigDecimal("0.408000"), result);
	}
}
