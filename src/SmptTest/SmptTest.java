package SmptTest;

import java.io.File;

public class SmptTest {
    public static void main(String[] args) {
        SmtpMailSender sms = SmtpMailSender.createSmtpMailSender("\"Black Fox\"<blackfox@gameeden.org>");

        sms.addLogManager(new LogPrinter());//添加日志管理器

        if(sms.sendTextMail("\"Sol\"<1300136919@qq.com>","STMP邮件测试","这是一封测试邮件。",new File[]{new File("wallpaper.png")})==SmtpMailSender.SUCCESSFUL) {
            System.out.println("邮件发送成功。");
        } else {
            System.out.println("邮件发送失败。");
        }
    }
}

/**
 * 一个简单的日志管理器。
 */
class LogPrinter implements LogManager {
    public void output(String info)
    {
        System.out.println(info);//将日志打印到控制台
    }
}
