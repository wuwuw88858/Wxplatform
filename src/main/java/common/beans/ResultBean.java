package common.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/*
*返回对象包装类
*@param:
*@return:
* */
@Data
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "0";    //成功全局码：0
    public static final String FAIL = "1";

    /*返回的信息*/
    private String code = SUCCESS;
    private boolean success = true;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T count;

    public ResultBean() {
        super();
    }
    public ResultBean(T data){
        super();
        this.data = data;
    }
    public ResultBean(Throwable e) {
        super();
        this.code = FAIL;
    }

    public ResultBean(T data, T count) {
        super();
        this.count = count;
        this.data = data;
    }
//    private Integer code;
//    private String msg;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private T data;

}
