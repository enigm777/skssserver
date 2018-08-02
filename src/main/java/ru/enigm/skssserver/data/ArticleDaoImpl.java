package ru.enigm.skssserver.data;

import ru.enigm.skssserver.model.Article;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Implementation of {@link ArticleDao}
 *
 * @author Ural Nigmatullin
 */
public class ArticleDaoImpl implements ArticleDao {

    private static final String ARTICLE_INSERT_STATEMENT = "insert into post (title, content, post_date, picture_link)"
            + " values (?, ?, ?, ?)";
    private static final String TITLE_COLUMN = "title";
    private static final String CONTENT_COLUMN = "content";
    private static final String POST_DATE_COLUMN = "post_date";
    private static final String PICTURE_LINK_COLUMN = "picture_link";

    /**
     * {@inheritDoc}
     */
    @Override
    public long saveArticle(Article article) {
        Connection connection = null;
        PreparedStatement statement = null;
        long id = 0;

        try {
            connection = DatasourceFactory.getMysqlDatasource().getConnection();
            statement = connection.prepareStatement(ARTICLE_INSERT_STATEMENT);

            statement.setString(1, article.getTitle());
            statement.setString(2, article.getContent());
            statement.setString(3, article.getPublishDate());
            statement.setString(4, article.getPictureUrl());
            id = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return id;
    }
}
