package demo.zy.testretrofit;

/**
 * Created by yizhang210244 on 2017/4/19.
 */

public class ResultBean {

    /**
     * Result : 1
     * Message : {"Edition":"1.3"}
     * Code :
     */

    private int Result;
    private ResultMessageBean Message;
    private String Code;

    public int getResult() {
        return Result;
    }

    public void setResult(int Result) {
        this.Result = Result;
    }

    public ResultMessageBean getMessage() {
        return Message;
    }

    public void setMessage(ResultMessageBean Message) {
        this.Message = Message;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }


}
