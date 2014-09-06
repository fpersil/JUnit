/*** @author fpersil***/
package com.fpersil.Subscription;

import org.junit.*;
import static org.junit.Assert.*;

public class SubscriptionSimpleTest {

	@Test
	public void  test_returnPrice() {
		Subscription S = new Subscription (200,2);
		assertTrue (S.monthlyPrice() == 100);
	}
	
	@Test
	public void test_roundUp() {
		Subscription S2 = new Subscription (200,3);
		assertTrue (S2.monthlyPrice() == 66.67);
	}
}