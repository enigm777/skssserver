package ru.enigm.skssserver.data;

import ru.enigm.skssserver.domain.ArticleRepository;
import ru.enigm.skssserver.model.Article;

/**
 * Implementation of {@link ArticleRepository}
 *
 * @author Ural Nigmatullin
 */
public class ArticleRepositoryImpl implements ArticleRepository {

    private ArticleDao articleDao = new ArticleDaoImpl();

    /**
     * {@inheritDoc}
     */
    @Override
    public long saveArticle(Article article) {
        return articleDao.saveArticle(article);
    }
}
