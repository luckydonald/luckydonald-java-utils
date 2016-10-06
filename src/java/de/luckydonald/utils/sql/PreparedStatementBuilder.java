/*
 * Copyright (c) luckydonald 2016.
 * Content is available under [GNU General Public License v3.0](http://choosealicense.com/licenses/gpl-3.0/), except where otherwise stated.
 */

package de.luckydonald.utils.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementBuilder
{
    public static class PSB extends PreparedStatementBuilder {
        /**
         * Alias to PreparedStatementBuilder.
         * Else the lines are getting so long.
         * >>> import static de.luckydonald.utils.sql.PreparedStatementBuilder.PSB;
         **/
        public PSB(String sql) {
            super(sql);
        }
    }
    private String sql; // the sql to be executed
    // http://stackoverflow.com/a/7127189/3423324
    public PreparedStatementBuilder(final String sql) {
        this.sql = sql;
    }

    public PreparedStatement build(Connection conn)
            throws SQLException
    {
        // fetch the PreparedStatement
        return conn.prepareStatement(sql);
    }
}

