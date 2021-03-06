package com.github.seaframework.monitor.druid;

import com.alibaba.druid.filter.AutoLoad;
import com.alibaba.druid.filter.FilterAdapter;
import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.proxy.jdbc.DataSourceProxy;
import com.alibaba.druid.proxy.jdbc.PreparedStatementProxy;
import com.alibaba.druid.proxy.jdbc.ResultSetProxy;
import com.alibaba.druid.proxy.jdbc.StatementProxy;

import java.sql.SQLException;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2020/2/29
 * @since 1.0
 */
@AutoLoad
public class DruidMonitorFilter extends FilterAdapter {

    private String dbType;

    private String url;


    @Override
    public void init(DataSourceProxy dataSource) {
        dbType = dataSource.getDbType();
        url = dataSource.getUrl();
    }

    @Override
    public boolean statement_execute(FilterChain chain, StatementProxy statement, String sql) throws SQLException {
        boolean result;
        try {
            result = super.statement_execute(chain, statement, sql);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public boolean statement_execute(FilterChain chain, StatementProxy statement, String sql, int autoGeneratedKeys)
            throws SQLException {
        boolean result;
        try {
            result = super.statement_execute(chain, statement, sql, autoGeneratedKeys);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public boolean statement_execute(FilterChain chain, StatementProxy statement, String sql, int[] columnIndexes)
            throws SQLException {
        boolean result;
        try {
            result = super.statement_execute(chain, statement, sql, columnIndexes);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public boolean statement_execute(FilterChain chain, StatementProxy statement, String sql, String[] columnNames)
            throws SQLException {
        boolean result;
        try {
            result = super.statement_execute(chain, statement, sql, columnNames);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public int[] statement_executeBatch(FilterChain chain, StatementProxy statement) throws SQLException {
        int[] result;
        try {
            result = super.statement_executeBatch(chain, statement);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public ResultSetProxy statement_executeQuery(FilterChain chain, StatementProxy statement, String sql)
            throws SQLException {
        ResultSetProxy result;
        try {
            result = super.statement_executeQuery(chain, statement, sql);
        } catch (SQLException e) {
            throw e;
        } finally {
        }

        return result;
    }

    @Override
    public int statement_executeUpdate(FilterChain chain, StatementProxy statement, String sql) throws SQLException {
        int result;
        try {
            result = super.statement_executeUpdate(chain, statement, sql);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public int statement_executeUpdate(FilterChain chain, StatementProxy statement, String sql, int autoGeneratedKeys)
            throws SQLException {
        int result;
        try {
            result = super.statement_executeUpdate(chain, statement, sql, autoGeneratedKeys);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public int statement_executeUpdate(FilterChain chain, StatementProxy statement, String sql, int[] columnIndexes)
            throws SQLException {
        int result;
        try {
            result = super.statement_executeUpdate(chain, statement, sql, columnIndexes);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public int statement_executeUpdate(FilterChain chain, StatementProxy statement, String sql, String[] columnNames)
            throws SQLException {
        int result;
        try {
            result = super.statement_executeUpdate(chain, statement, sql, columnNames);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public boolean preparedStatement_execute(FilterChain chain, PreparedStatementProxy statement) throws SQLException {
        boolean result;
        try {
            result = super.preparedStatement_execute(chain, statement);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public ResultSetProxy preparedStatement_executeQuery(FilterChain chain, PreparedStatementProxy statement)
            throws SQLException {
        ResultSetProxy result;
        try {
            result = super.preparedStatement_executeQuery(chain, statement);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

    @Override
    public int preparedStatement_executeUpdate(FilterChain chain, PreparedStatementProxy statement)
            throws SQLException {
        int result;
        try {
            result = super.preparedStatement_executeUpdate(chain, statement);
        } catch (SQLException e) {
            throw e;
        } finally {
        }
        return result;
    }

}