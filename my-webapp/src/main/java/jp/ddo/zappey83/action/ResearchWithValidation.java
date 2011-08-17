package jp.ddo.zappey83.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

@Validations(requiredStrings = {
		@RequiredStringValidator(fieldName = "name", message = "名前を入力してください"),
		@RequiredStringValidator(fieldName = "email", message = "メールアドレスを入力してください") }, emails = { @EmailValidator(fieldName = "email", message = "有効なメールアドレスを入力してください", shortCircuit = true) })
public class ResearchWithValidation extends ActionSupport {
	private static final long serialVersionUID = -1061397396445174747L;

	private String name, email, fruit;
	private int age;

	public String execute() {
		return "success";
	}

	@Override
	public void validate() {
		if (name == null) {
			addActionError("名前を入力してください");
		}
		if (age >= 40 && !fruit.isEmpty()) {
			addActionError("40歳以上は果物を選択できません");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@RequiredFieldValidator(message = "せんたくしてください")
	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public int getAge() {
		return age;
	}

	@IntRangeFieldValidator(min = "18", max = "99", message = "${min}歳以上（${max}歳以下）の方が対象です。（入力値：${age}歳）")
	public void setAge(int age) {
		this.age = age;
	}

}
