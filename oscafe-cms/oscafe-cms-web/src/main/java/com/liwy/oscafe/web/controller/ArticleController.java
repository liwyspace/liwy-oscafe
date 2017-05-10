package com.liwy.oscafe.web.controller;

import com.liwy.oscafe.web.entity.Article;
import com.liwy.oscafe.web.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.*;

/**
 * Created by liwy on 2017/4/3.
 */
@Controller
public class ArticleController {
    @Autowired
    private IArticleService articleService;

    /**
     * 查询文章列表
     * @return
     */
    @RequestMapping("/articles")
    public String queryArticles(Map<String,Object> map) {
        System.out.println("进入文章列表页面");
        Map<String,Object> parms = new HashMap<String,Object>();
        List<Article> list = articleService.queryArticles(parms);
        System.out.println(list);
        map.put("articles",list);
        return "articleList";
    }

    /**
     * 进入文章新增页面
     * @return
     */
    @RequestMapping(value="/article",method = RequestMethod.GET)
    public String input(Map<String,Object> map) {
        Article article = new Article();
        map.put("article",article);
        return "article";
    }

    /**
     * 通过ID获取文章信息
     * @param id
     * @return
     */
    @RequestMapping(value="/article/{id}",method = RequestMethod.GET)
    public String getArticle(Map<String,Object> map, @PathVariable("id") Integer id) {
        System.out.println("获取文章信息");
        Article article = articleService.getArticle(id);
        map.put("article",article);
        return "article";
    }

    /**
     * 保存文章
     * @param article
     * @return
     */
    @RequestMapping(value = "/article", method = RequestMethod.POST)
    public String saveArticle(@Valid Article article, BindingResult result) {
        System.out.println("保存文章操作");
        if(result.getErrorCount()>0) {
            System.out.println("类型绑定出错了");
            for(FieldError err:result.getFieldErrors()) {
                System.out.println(err.getField()+":"+err.getDefaultMessage());
            }
            return "article";
        }
//        article.setTime(new java.sql.Date(new Date().getTime()));
        articleService.insertArticle(article);
        return "redirect:/articles";
    }

    /**
     * 更新文章
     * @param article
     * @return
     */
    @RequestMapping(value = "/article", method = RequestMethod.PUT)
    public String updateArticle(Article article) {
        System.out.println("更新文章");
        article.setTime(new java.sql.Date(new Date().getTime()));
        articleService.updateArticle(article);
        return "redirect:/articles";
    }

    /**
     * 删除文章
     * @param id
     * @return
     */
    @RequestMapping(value = "/article/{id}", method = RequestMethod.DELETE)
    public String delArticle(@PathVariable("id") Integer id) {
        System.out.println("进入删除文章");
        articleService.delArticle(id);
        return "redirect:/articles";
    }

    /**
     * 测试自定义的视图
     * @return
     */
    @RequestMapping("/myView")
    public String testMyView() {
        return "myView";//使用自定义的视图解下器，解析器类名第一个字母小写
    }

    /**
     * 测试返回json数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getJson")
    public List<Article> getJsonList() {
        System.out.println("获取Json");
        Map<String,Object> parms = new HashMap<String,Object>();
        List<Article> list = articleService.queryArticles(parms);
        return list;
    }

    /**
     * 测试国际化
     */
    @Autowired
    private ResourceBundleMessageSource resource;
    @RequestMapping("/testI18n")
    public void testI18n(Locale locale) {
        String title = resource.getMessage("i18n.title",null, locale);
        System.out.println(title);
    }

    @RequestMapping("/upload")
    public  String testUpload(@RequestParam("desc")String desc, @RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("desc:"+desc);
        System.out.println("type:"+file.getContentType());
        System.out.println("filename:"+file.getOriginalFilename());
        System.out.println("in:"+file.getInputStream());
        return "upload";
    }

}
