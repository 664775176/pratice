package com.zhangchao.rpc;

/**
 * HelloServiceImpl
 *
 * @author william.liangf
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name;
    }

}