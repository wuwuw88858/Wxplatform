package common.utils;

import java.util.Locale;

public class LocaleUtils {

    private static final ThreadLocal<Locale> locale = new ThreadLocal<Locale>() {
        protected Locale initialValue() {
            return Locale.CHINESE;
        }
    };


    public static void setLocale(String locale) {
        setLocale(new Locale(locale));
    }

    public static void setLocale(Locale locales) {
        locale.set(locales);
    }

    public static Locale getLocale() {
        return locale.get();
    }

}
