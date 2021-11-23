package cn.gok.common;

/**
 * @Description:
 * @Param:  * @param null
 * @return:
 * @Author: olj
 * @Date: 2021/11/15
 */
public class ResultData<T>
{
    private static final String SUCCESS ="0";
    private static final String FAIL ="0";
    private  String code;
    private  String msg;
    private  T Data;
    private  Long count;

    public ResultData(String code, String msg, T data, Long count) {
        this.code = code;
        this.msg = msg;
        Data = data;
        this.count = count;
    }
    public ResultData(){}
    public ResultData(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        Data = data;

    }
    public  static ResultData success(){
        return  new ResultData(SUCCESS,"操作成功",null);
    }
    public static ResultData fail(){
        return  new ResultData(FAIL,"操作失败",null);
    }
    public static ResultData buildMsg(String code, String msg){
        return new ResultData(code,msg,null);
    }
    public  static <T> ResultData buildData(T data){
        return  new ResultData(SUCCESS,"操作成功",data);
    }
    public static <T> ResultData page(T data, long count){
        return  new ResultData(SUCCESS,"操作成功",data,count );
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
