package ru.enigm.skssserver.domain;

import ru.enigm.skssserver.model.Article;

/**
 * Service interface for saving articles
 *
 * @author Ural Nigmatullin
 */
public interface ArticleService {

    /**
     * Save article
     *
     * @param article entered article
     * @return true if saving was successful
     */
    boolean saveArticle(Article article);
}
