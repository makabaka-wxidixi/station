package com.ailik.station.dao.implement;

import com.ailik.station.dao.UserBaseDao;
import com.ailik.station.dao.daoInterface.PhoneDao;
import com.ailik.station.pojo.goods.Phone;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 17:32
 */
public class PhoneDaoImpl extends UserBaseDao<Phone> implements PhoneDao {

    @Override
    public List<Phone> getAllPhone(Connection connection) throws SQLException {
        String sql = "select * from phone";
        return queryList(connection, sql);
    }

    @Override
    public List<Phone> getPhoneListBySeriesAsc(Connection connection, String series) throws SQLException {
        String sql = "select * from (select * from phone where `series` = ?) as `temp` order by price";
        return queryList(connection, sql, series);
    }

    @Override
    public List<Phone> getPhoneListBySeriesDesc(Connection connection, String series) throws SQLException {
        String sql = "select * from (select * from phone where `series` = ?) as `temp` order by price desc";
        return queryList(connection, sql, series);
    }

    @Override
    public Phone getPhoneByModel(Connection connection, String model) throws SQLException {
        String sql = "select * from phone where `model` = ?";
        return query(connection, sql, model);
    }

    @Override
    public List<Phone> getAllPhoneByBrandAsc(Connection connection, String brand) throws SQLException {
        String sql = "select * from (select * from phone where `brand` = ?) as `temp` order by price";
        return queryList(connection, sql, brand);
    }

    @Override
    public List<Phone> getAllPhoneByBrandDesc(Connection connection, String brand) throws SQLException {
        String sql = "select * from (select * from phone where `brand` = ?) as `temp` order by price desc";
        return queryList(connection, sql, brand);
    }

    @Override
    public List<Phone> getAllPhoneByPriceASC(Connection connection) throws SQLException {
        String sql = "select * from phone order by price";
        return queryList(connection, sql);
    }

    @Override
    public List<Phone> getAllPhoneByPriceDesc(Connection connection) throws SQLException {
        String sql = "select * from phone order by price desc";
        return queryList(connection, sql);
    }

    @Override
    public List<Phone> getAllPhoneByHotAsc(Connection connection) throws SQLException {
        String sql = "select * from phone order by hot";
        return queryList(connection, sql);
    }

    @Override
    public List<Phone> getAllPhoneByHotDesc(Connection connection) throws SQLException {
        String sql = "select * from phone order by hot desc";
        return queryList(connection, sql);
    }
}
