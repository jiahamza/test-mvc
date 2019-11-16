package com.test;

import com.controller.TestController;
import com.entity.UserEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 需要咨询JAVA高级VIP课程的可以加若曦老师：2408349392
 * 需要视频资料或者咨询课程的可以加安其拉老师：2246092212
 * author：鲁班学院-商鞅老师
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Method test = TestController.class.getMethod("test", String.class, HttpServletRequest.class, HttpServletResponse.class, UserEntity.class);
        System.out.println(test.getParameters()[0].getName());
    }
}
