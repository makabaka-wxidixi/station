package com.ailik.station.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 20:25
 */
public abstract class UserBaseDao<T> {
    private QueryRunner queryRunner = new QueryRunner();
    private Class<T> clazz = null;

    {
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        clazz = (Class<T>) actualTypeArguments[0];
    }

    /**
     * 返回javaBean集合
     *
     * @param connection 连接
     * @param sql        查询语句
     * @param args       可变形参
     * @return 返回Bean对象集合
     */
    public List<T> queryList(Connection connection, String sql, Object... args) throws SQLException {
        List<T> query = queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
        return query;
    }

    /**
     * 查询一条数据
     *
     * @param connection 外部连接
     * @param sql        select语句
     * @param args       可变形参
     * @return null：没有找到
     * @throws SQLException
     */
    public T query(Connection connection, String sql, Object... args) throws SQLException {
        T query = queryRunner.query(connection, sql, new BeanHandler<T>(clazz), args);
        return query;
    }


    /**
     * 修改一条数据（insert/delete/update
     *
     * @param connection 外部的连接
     * @param sql        支持insert/update/delete
     * @param args       可变形参，用于填充占位符
     * @return true：执行成功
     * @throws SQLException
     */
    public boolean update(Connection connection, String sql, Object... args) throws SQLException {
        int update = queryRunner.update(connection, sql, args);
        if (update == 1) {
            return true;
        } else {
            return false;
        }
    }
}
