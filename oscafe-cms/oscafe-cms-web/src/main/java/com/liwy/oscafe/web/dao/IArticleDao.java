package com.liwy.oscafe.web.dao;

import com.liwy.oscafe.web.entity.Article;

import java.util.List;
import java.util.Map;

/**
 * Article数据访问接口
 */
public interface IArticleDao {
	/**
	 * 查找文章列表
	 * @param params
	 * @return
	 */
	List<Article> queryArticles(Map<String, Object> params);

	/**
	 * 通过文章ID获取文章
	 * @param id
	 * @return
	 */
	Article getArticle(int id);

	/**
	 * 添加文章
	 * @param article
	 * @return
	 */
	int insertArticle(Article article);

	/**
	 * 修改文章
	 * @param article
	 * @return
	 */
	int updateArticle(Article article);

	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	int delArticle(int id);
}
