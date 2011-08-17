package jp.ddo.zappey83.action;


public class Hello {
	private String replyMessage;
	
	public String getReplyMessage(){
		return replyMessage;
	}
	
	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}
	public String execute() {
		this.setReplyMessage("ようこそー");
		return "success";
	}
}
