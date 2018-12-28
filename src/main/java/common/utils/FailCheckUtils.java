package common.utils;

import common.exceptions.FailException;
import org.springframework.context.MessageSource;

public class FailCheckUtils {

    private static MessageSource messageSource;
    public static void setMessageSource(MessageSource messageSource) {
        FailCheckUtils.messageSource = messageSource;
    }

    /*学号不符合规范(16,17,18三个年级)*/
    public static void memberIdIsTrue(String str, String messageKey, Object... args) {
        if(!(str.matches("^[1][6,7,8,9][0-9]{8}$"))){
            fail(messageKey, args);
        }
    }
    /*名字不符合规范（2-4个中文字体）*/
    public static void memberNameIsTrue(String str, String messageKey,Object... args) {
        if(!str.matches("^[\u4e00-\u9fa5]{2,4}")) {
            fail(messageKey, args);
        }
    }
    /*电话号码不符合规范（11数字）*/
    public static void telNumberIsTrue(String str, String messageKey, Object... args) {
        if(!str.matches("^[1][3,4,5,7,8][0-9]{9}$")) {
            fail(messageKey, args);
        }
    }
    /*
    * 选择的身份不存在
    * */
    public static void politicalstatusNotExist(Integer integer, String messageKey, Object... args) {
        if (!integer.toString().matches("[1-3]{1}")) {
            fail(messageKey, args);
        }
    }
//    /*
//    * 选择的组织不存在
//    * */
//    public static void tissusNotExist(Integer integer, String messageKey, Object... args) {
//        if (!integer.toString().matches("[1-2]{1}")) {
//            fail(messageKey, args);
//        }
//    }
//    /*选择的部门不存在*/
//    public static void departmentNotExist(Integer integer, String messageKey, Object... args) {
//        if(!integer.toString().matches("[1-15]{1,2}")) {
//            fail(messageKey, args);
//        }
//    }
//    /*选择的部门职位不存在*/
//    public static void departmentPositionNotExist(Integer integer, String messageKey, Object... args) {
//        if(!integer.toString().matches("[1-7]{1}")) {
//            fail(messageKey, args);
//        }
//    }
    /*待审核状态*/
    public static void isAccess(String str, String messageKey, Object... args) {
        if(str.equals("0")) {
            fail(messageKey,args);
        }
    }
    private static void fail(String msgKey, Object... args) {
        throw new FailException(messageSource.getMessage(msgKey, args,LocaleUtils.getLocale()));
    }

}
