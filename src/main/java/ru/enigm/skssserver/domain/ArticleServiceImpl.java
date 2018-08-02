package ru.enigm.skssserver.domain;

import ru.enigm.skssserver.model.Article;

/**
 * Implementation of {@link ArticleService}
 *
 * @author Ural Nigmatullin
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean saveArticle(Article article) {
        long saveId = articleRepository.saveArticle(article);
        return saveId > 0;
    }
}
