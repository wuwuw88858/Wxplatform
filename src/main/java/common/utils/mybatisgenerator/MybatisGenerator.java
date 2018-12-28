package common.utils.mybatisgenerator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* 
* @Description: 逆向工程主程序
* @Param:  
* @return:  
* @return:
* @Author:  zhijie
* @Date: 2018/12/6 
*/ 
public class MybatisGenerator {
    public static void main(String[] args) throws Exception{
        String today = "2018-09-19";
        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        Date now = date.parse(today);
        Date d = new Date();

//        if(d.getTime() > now.getTime() + 1000*60*60*24) {
//            System.err.println("本程序具有破坏作用，应该只运行一次，如果必须要再运行，" +
//                    "需要修改today变量为今天，如:" + date.format(new Date()));
//            return;
//        }
        if (false) {return;}
        List<String> warning = new ArrayList<String>();
        boolean overwrite = true;
        InputStream is =
                MyBatisGenerator.class.getClassLoader().getResource("xml/generatorConfig.xml").openStream();
        ConfigurationParser cp = new ConfigurationParser(warning);
        Configuration config = cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback,warning);
        myBatisGenerator.generate(null);
        System.out.println("代码生成一次");

    }
}