package com.liwy.oscafe.web.controller.conversion;

import com.liwy.oscafe.web.entity.Article;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义类型转换器
 * Created by liwy on 2017/4/4.
 */
@Component
public class MyConversion implements Converter<String,Article> {
    @Override
    public Article convert(String s) {
        //44,liwytitle,liwy,liwy123
        if(s != null){
            String [] vals = s.split(",");
            if(vals != null && vals.length == 4){
                Integer id = Integer.valueOf(vals[0]);
                String title = vals[1];
                String author = vals[2];
                String content = vals[3];
                Article article = new Article();
                article.setId(id);
                article.setTitle(title);
                article.setAuthor(author);
                article.setContent(content);
                article.setTime(new java.sql.Date(new Date().getTime()));
                return article;
            }
        }
        return null;
    }
}
