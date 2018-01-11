package com.liwy.oscafe.common.web.dao.impl;

import com.liwy.oscafe.common.web.dao.IArticleDao;
import com.liwy.oscafe.common.web.entity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

/** 通过Spring jdbcTemplet实现的Dao
 * Created by liwy on 2017/4/3.
 */
public class ArticleDaoImpl implements IArticleDao {
    private JdbcTemplate jdbcTemplet;

    @Override
    public List<Article> queryArticles(Map<String, Object> params) {
        System.out.println("DaoImpl查询");
        RowMapper<Article> rowMapper = new BeanPropertyRowMapper<Article>(Article.class);
        return jdbcTemplet.query("select id, title,author,content,time from liwy_article",rowMapper);
    }

    @Override
    public Article getArticle(int id) {
        return null;
    }

    @Override
    public int insertArticle(Article article) {
        System.out.println("DaoImpl更新");
        return jdbcTemplet.update("insert into liwy_article(id,title,author,content,time) values(?,?,?,?,?)",
                article.getId(),article.getTitle(),article.getAuthor(),article.getContent(),article.getTime());
    }

    @Override
    public int updateArticle(Article article) {
        return 0;
    }

    @Override
    public int delArticle(int id) {
        return 0;
    }
}
