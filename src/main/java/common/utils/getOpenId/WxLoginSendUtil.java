package common.utils.getOpenId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WxLoginSendUtil {

        public static String sendGet(String url, String params) {
            String result ="";
           String urlName = url + "?" + params;
            BufferedReader bufferedReader = null;

            try {
                URL realUrl = new URL(urlName);
                URLConnection urlConnection = realUrl.openConnection();
                //设置通用属性
                urlConnection.setRequestProperty("accpt", "*/*");
                urlConnection.setRequestProperty("connection",  "Keep-Alive");
                urlConnection.setRequestProperty("user-agent",
                        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
                //建立链接
                urlConnection.connect();

                //自定义Buffer读取相对应信息
                bufferedReader = new BufferedReader( new InputStreamReader(
                        urlConnection.getInputStream()
                        ));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                }catch (IOException e) {
                        e.printStackTrace();
                    }

            }
            return result;
        }
}
