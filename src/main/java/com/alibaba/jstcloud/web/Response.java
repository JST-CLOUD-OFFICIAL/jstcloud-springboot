package com.alibaba.jstcloud.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


/**
 * base response
 *
 * @author daiqixiang.dqx@alibaba-inc.com
 * @since 2023/03/19
 * @param <T> the data model type
 */
@Data
public class Response<T> {

    private Integer code;

    private String message;

    private T data;

    public Response(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @JsonIgnore
    public static <R> Response<R> success(R data){
        return new Response<>(200, "", data);
    }

    @JsonIgnore
    public static <R> Response<R> success(){
        return new Response<>(200, "", null);
    }

    @JsonIgnore
    public static <R> Response<R> fail(Integer code, String message){
        return new Response<>(code, message, null);
    }

}
