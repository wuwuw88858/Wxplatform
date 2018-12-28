package common.utils.getOpenId;

/*
*获取code工具
* @params:code
* @return:code
* */
public class GetOpenIdUtil {

    public static String getOpenId(String code) {

        /*如果code为空*/

        //请求地址
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        //微信小程序唯一识别符（后台获取)
        String appid = "wx1365986f993abe81";
        //微信小程序密钥
        String appSecret = "e3907e5712fbb00c4103690f0ccf67db";
        //授权
        String grade_type = "authorization_code";
         /*向微信服务器通过三个参数来获取用户敏感信息*/
        //请求参数
        String params = "appid=" + appid + "&secret=" + appSecret + "&js_code=" + code + "&grant_type=" +
                grade_type;
        String openId = WxLoginSendUtil.sendGet(url, params);
        return openId;
    }
}
