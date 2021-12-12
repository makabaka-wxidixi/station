package com.ailik.station.service.servImpl;

import com.ailik.station.dao.daoInterface.PhoneDao;
import com.ailik.station.dao.implement.PhoneDaoImpl;
import com.ailik.station.pojo.goods.Phone;
import com.ailik.station.service.servInterface.PhoneService;
import com.ailik.station.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 20:17
 */
public class PhoneServiceImpl implements PhoneService {
    private PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public List<Phone> getPhoneByBrandAsc(String brand) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByBrandAsc(connection, brand);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getPhoneByBrandDesc(String brand) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByBrandDesc(connection, brand);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getPhoneBySeriesAsc(String series) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getPhoneListBySeriesAsc(connection, series);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getPhoneBySeriesDesc(String series) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getPhoneListBySeriesDesc(connection, series);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public Phone getPhoneByModel(String model) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getPhoneByModel(connection, model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getAllPhoneByPriceAsc() {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByPriceASC(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getAllPhoneByPriceDesc() {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByPriceDesc(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getAllPhoneByHotAsc() {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByHotAsc(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getAllPhoneByHotDesc() {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhoneByHotDesc(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }

    @Override
    public List<Phone> getAllPhone() {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return phoneDao.getAllPhone(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(connection);
        }
        return null;
    }
}
