package com.fusemachine.springdata.service;

import java.util.List;

import com.fusemachine.springdata.entity.Article;

public interface IArticleService {

	List<Article> getAllArticles();
	Article getArticleById(long articleId);
	boolean addArticle(Article article);
	void updateArticle(Article article);
	void deleteArticle(int articleId);
}
