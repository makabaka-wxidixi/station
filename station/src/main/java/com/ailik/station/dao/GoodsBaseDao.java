package com.ailik.station.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 21:48
 */
public abstract class GoodsBaseDao<T> extends UserBaseDao<T> {
    private Class<T> clazz = null;

    //反射
    {
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        clazz = (Class<T>) actualTypeArguments[0];
    }

    /**
     * 按照限制对商品进行升序排序
     *
     * @param connection 连接
     * @param limit      限制条件
     * @return
     * @throws SQLException
     */
    public List<T> getAllGoodsByAsc(Connection connection, String limit) throws SQLException {
        String name = clazz.getSimpleName();
        String sql = "select * from  order by ?";
        return queryList(connection, sql, clazz, name, limit);
    }

    /**
     * 按照限制进行降序排序
     *
     * @param connection 连接
     * @param limit      限制条件
     * @return
     * @throws SQLException
     */
    public List<T> getAllGoodsByDesc(Connection connection, String limit) throws SQLException {
        String typeName = clazz.getSimpleName();
        String regStr = typeName.toLowerCase();
        String sql = "select * from ? order by ? desc";
        return queryList(connection, sql, clazz, regStr, limit);
    }
}
