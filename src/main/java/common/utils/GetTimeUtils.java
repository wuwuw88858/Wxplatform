package common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: Wxplatform
 * @description: 获取当前系统的时间,转化成时间,精确到秒戳，最终作为编号
 * @author: zhijie
 * @create: 2018-12-06 22:29
 **/
public class GetTimeUtils {

    public static String setSthIdByCurrentTime()  {

        SimpleDateFormat df = new SimpleDateFormat("YYMMddHHmmss");
        String dateString = df.format(new Date());
        Date date = null;
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long s=date.getTime();
        String somethingId = Long.toString(s/1000);
        return somethingId;
    }
}
