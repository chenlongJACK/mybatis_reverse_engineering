package utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
public class FullyAutomatic {
    public static void main(String[] args) throws Exception{
        List<String> warnings=new ArrayList<String>();
        boolean overwrite=true;
        File configFile=new File("D:\\develop\\IdeaProject\\springboot_demo\\mybatis_reverse_engineering\\src\\main\\resources\\config.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成成功");

    }
}
