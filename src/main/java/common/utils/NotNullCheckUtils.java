package common.utils;

import com.wxplatform.mapper.GroupMemberMapper;
import common.beans.ResultBean;
import common.beans.ResultBeanUtil;
import common.beans.ResultEnum;
import common.exceptions.NullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Date;
import java.util.List;

public class NotNullCheckUtils {

    private static MessageSource messageSource;
    public static void setMessageSource(MessageSource messageSource) {
        NotNullCheckUtils.messageSource = messageSource;
    }

    /*判断字符型为空*/
    public static void NotNull(String str, String messageKey, Object... args) {
        if(str == null || str.isEmpty()) {
       fail(messageKey, args);
        }
    }



    /*
    * @Description:  判断整形数值为空
    * @Param:  integer msg
    * @return:
    * @Author:  zhijie
    * @Date: 2018/12/17
    */
    public static void NotNullInt(Integer integer, String messageKey, Object... args) {
        if(integer == null || integer == 0) {
            fail(messageKey, args);
        }
    }
    public static void NotNullLong(Long longs, String messageKey, Object... args) {
        if(longs == null || longs == 0 ) {
            fail(messageKey, args);
        }
    }
    /*
    * @Description:  判断日期类型的数据为空
    * @Param:  date msg
    * @return:
    * @Author:  zhijie
    * @Date: 2018/12/17
    */
    public static void NotNullDate(Date date, String messageKey, Object... args) {
        if(date == null) {
            fail(messageKey, args);
        }
    }

    /*成员列表为空值*/
    //判断成员列表
    public static void ListNotExist(List list, String messageKey, Object... args) {
        if (list == null || list.size() == 0) {
            fail(messageKey, args);
        }
    }
    private static void fail(String msgKey, Object... args) {
        throw new NullException(messageSource.getMessage(msgKey, args,LocaleUtils.getLocale()));
    }

}
