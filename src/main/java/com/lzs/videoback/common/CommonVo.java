package com.lzs.videoback.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CommonVo {
    private Integer code;
    private String message;
    private Object data;
    public static CommonVo OK(Object data){
        CommonVo commonVo = new CommonVo();
        commonVo.setData(data);
        commonVo.setCode(20000);
        commonVo.setMessage("ok");
        return commonVo;
    }

}
