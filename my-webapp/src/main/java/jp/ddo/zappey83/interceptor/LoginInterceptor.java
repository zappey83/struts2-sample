package jp.ddo.zappey83.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.ddo.zappey83.domain.User;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -3201722342712638531L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		if(session.getAttribute("user") != null) {
			return invocation.invoke();
		}
		if(isLoginSuccess(request.getParameter("userId"), request.getParameter("password"))) {
			User user = new User();
			user.setUserId((String) request.getAttribute("userId"));
			user.setPassword((String) request.getAttribute("password"));
			session.setAttribute("user", user);
			return "login-success";
		}
		
		return "login";
	}

	private boolean isLoginSuccess(String userId, String password) {
		return userId != null && password != null;
	}

}
