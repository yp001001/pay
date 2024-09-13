package com.pay;

import com.pay.config.WxPayConfig;
import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PrivateKey;

/**
 * @program: pay
 * @description:
 * @author: yp
 * @create: 2024-09-09 22:48
 **/
//@SpringBootTest
public class ApplicationTest {

    @Resource
    private WxPayConfig wxPayConfig;

    public static void main(String[] args) throws FileNotFoundException {
        PrivateKey privateKey = PemUtil.loadPrivateKey(new FileInputStream("apiclient_key.pem"));
        System.out.println(privateKey);
    }

}
