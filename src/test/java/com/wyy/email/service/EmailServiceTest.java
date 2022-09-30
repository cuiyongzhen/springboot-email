package com.wyy.email.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {
    @Autowired
    private EmailService emailService;

    @Test
    public void sendSimpleTextMailTest() {
        String to = "673752314@qq.com";
        String subject = "springboot 发送邮件";
        String content = "简单的文本文件，测试用";
        emailService.sendSimpleTextMail(to, subject, content);
    }
}
