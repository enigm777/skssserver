package ru.enigm.skssserver.data;

import ru.enigm.skssserver.model.Article;

/**
 * Data access object for Article
 *
 * @author Ural Nigmatullin
 */
public interface ArticleDao {

    /**
     * Save article to DB
     *
     * @param article article to save
     * @return id of saved article
     */
    long saveArticle(Article article);
}
