package models;

public class SecureResponse<T>{
    private boolean success;
    private T data;
    private String warningMessage;
    
    public SecureResponse(boolean success, T data, String warningMessage) {
        this.success = success;
        this.data = data;
        this.warningMessage = warningMessage;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getWarningMessage() {
        return warningMessage;
    }
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

}