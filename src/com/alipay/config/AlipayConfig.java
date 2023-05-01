package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

/**
 * @author ShineLowry
 */
public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000122683292";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCnNoifuVBNFCi85AZYDL6TDqbVUtqcFtsJVX7CtNdHCnzCRsIbg8YPlCQfy9L8y51SiNVZGQfMe+8ojiKOkNzp7XWH9CQhN8kB47OKSLiZxMVu1cNPv5X3Aa6PsLy4w0qJiLIYq4olX6epGM02Mibw/Rw1ai+c2LQkT//jGo/G1wR4uN+Rblpu/Dpqo04DgpEmq5LVrjDnUF5zZBF9VvXAnpXCPo/58Y2KziQjG1MD6kjciE8S1R19dpgCw80mdE0TZoCIxtrejz6VRhvqFKH4bzwGQ2073zUAzCo723XtwB0p0qy7DDUqvP3dKbbE9wDT6NUPBiWUlL+3r5BpKGtjAgMBAAECggEANd+ZFzUCjULweSNSc+3vPLwcvmBKdL3cZl54T80qCwZy+bkIcwr6tiw5k1D9Mlt73Yqeim1JGPXZMQzST3KW6nuKQXpEZbtudMBjKSuS5mACaFpQ6hHFBGczUbJUq4aoLjWvg8lI4g+2mgGWpF52M3CpNQB4RKWBLK3luMrnBd3df6+cHtIwhN0sOsY2vmOehklw59AZaWw4GdyrI7EfMYl8yDJFSt+7sISKtN1q2tRcYtWScMeSGQ+dzZ0aqQ61jiLosbDpDA3peOxc2gOTRXzudVRN08+cfHvPPViyqE648Y1Gdr5qvUfbN6mPrnjsz6f2Vq6P7l/YT3Klb7FREQKBgQDU+BDHMhq/V2eTSbekuDPljDD52u6P5iDBpzuNINkv9kS+Mn5HHEk1vdgDL6kROYX3ystTn+KaQbfEsDChkNJ27lv2oOBQc2MCsjbc92DIoLbw1Kj+QsdyVnMQ0UTnpPdBAcJE553JrEOH3X16VdpJgvRv1r6h7uJMG34XihJROwKBgQDI/7c3XlEICdkLLVq/fG4AABRBgEuWK+dShj3RrBUt9vWViaC4P3+l0Ok88+Gbo6DpBJ7WotM/AOYJUgfJ2a4fdfzwAfKn5IkMrYJtakPa+oggGgM+iTHANxfKSu7RrpkZpYJiRdkFZptm/rSfLBIdvty6r9LyJZveRjW0ce+r+QKBgQDIntrnWyrZPxRCKrqFwESbJCJq7LO4+Pe4lbpCq0QNq3d8mIJeqKXKq4kXD0m8AS1TjUVXBJHp8KiV78gQGyY4hTg6r7g/8UK/InUOWTdiKAvN+Pctdmj+K7P/jrPTZ5LIOUjxsiLw/YcsMRloKgIVJ/judiRk1W12dpukvxucSwKBgEpVb7+1TMhpQ/CDRHVeohuz68nRlaKi9/ioFsKtHmQSWf6EmICrUxzSpv9Yvk3d9MtYXxnHu9IoFerKgIDg1SljbDiir8fxl9GtdXfbfd7FGoSsuhhtio2okk7I6Yt4Q7ydXhvT8w+xQ7WSauAW31hK1rzf+2Z8DCnm00O5g0aZAoGAfQJm/mEBPWMTKZzx56cyoHNFxzKq+r5+DDZDlhvmyjgx9bZCTBad+MGfX9a2jEOScDjoSkc5OxEUzmSgMRPd2OfHb7mMuWJV7B27KAQ9netnFZDlaH0pTcP1ngBt3MzrjGYYAKWH4ZMH2CxXEIvkZsANqdylXUxP7MTnuKHJ1iQ=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7yag0SaDoVzAtgj2/+uxb789QzH2X0PjoCiT9vc9GPd9lT4ABgwOvE0bAo1it4yeyP5Q1vu/RPkh1fkQ1N88Q6bqLIWuXyCd5atTRKhVJu6LG/3CK/FBqhJGYyvlUX1m1bn53n2OE5qklCYhixddFSKhJoAve9cexEUo/1MKp9uAMZ5rdXS4T/NlGErOCoHO1/vN0R9lTS3p8hXsJ14yNa8tDvHGo7j0wN0UhTYIkLfycp2Tf527saf4V8tLHT7E8R34A4qvMsK033BLjeockdwce753SndPZxghEjUs6vrXsadqmcK8nSqj9ubYtnrdaXUclIz0AOVRzn0JwTTQawIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://t2kdph.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://t2kdph.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

