package jp.ddo.zappey83.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 2832832985958412994L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("マイインターセプタ【前】処理");
		String result = invocation.invoke();
		System.out.println("マイインターセプタ【後】処理");
		return result;
	}

}
