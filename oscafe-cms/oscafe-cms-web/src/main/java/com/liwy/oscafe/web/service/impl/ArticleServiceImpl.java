package com.liwy.oscafe.web.service.impl;

import com.liwy.oscafe.web.dao.IArticleDao;
import com.liwy.oscafe.web.entity.Article;
import com.liwy.oscafe.web.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by liwy on 2017/4/3.
 */

@Service("articleService")
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private IArticleDao articleDao;

    @Override
    public List<Article> queryArticles(Map<String, Object> params) {
        return  articleDao.queryArticles(params);
    }

    @Override
    public Article getArticle(int id) {
        return articleDao.getArticle(id);
    }

    @Override
    public int insertArticle(Article article) {
        return articleDao.insertArticle(article);
    }

    @Override
    public int updateArticle(Article article) {
        return articleDao.updateArticle(article);
    }

    @Override
    public int delArticle(int id) {
        return articleDao.delArticle(id);
    }
}
