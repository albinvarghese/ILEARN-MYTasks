package com.uviqo.com.ILearSignUp.ApiResponse;

public class APIResponse {
	
	private int status;
    private String message;
    private Object result;

    public APIResponse(int status, String message, Object result){
        this.status = status;
        this.setMessage(message);
        this.setResult(result);
    }

    public int getStatus() {
        return status;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
