package ru.enigm.skssserver.domain;

import ru.enigm.skssserver.model.Article;

/**
 * Repository interface for Article
 *
 * @author Ural Nigmatullin
 */
public interface ArticleRepository {

    /**
     * Save article in repository
     *
     * @param article article to save
     * @return id of saved article
     */
    long saveArticle(Article article);
}
