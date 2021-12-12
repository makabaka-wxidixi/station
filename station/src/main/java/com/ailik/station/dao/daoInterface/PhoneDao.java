package com.ailik.station.dao.daoInterface;

import com.ailik.station.pojo.goods.Phone;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 17:19
 */
public interface PhoneDao {

    //得到所有的商品信息
    List<Phone> getAllPhone(Connection connection) throws SQLException;

    //查询指定品牌（series）的所有phone，并根据价格进行 升序 排列
    List<Phone> getPhoneListBySeriesAsc(Connection connection, String series) throws SQLException;

    //查询指定品牌（series）的所有phone，并根据价格进行 降序 排列
    List<Phone> getPhoneListBySeriesDesc(Connection connection, String series) throws SQLException;

    //查询指定型号（model）的phone
    Phone getPhoneByModel(Connection connection, String model) throws SQLException;

    //将指定厂商(brand)的手机进行 升序 查询
    List<Phone> getAllPhoneByBrandAsc(Connection connection, String brand) throws SQLException;

    //将指定厂商(brand)的手机进行 降序 查询
    List<Phone> getAllPhoneByBrandDesc(Connection connection, String brand) throws SQLException;

    //按照价格的升序来查询商品(order by)
    List<Phone> getAllPhoneByPriceASC(Connection connection) throws SQLException;

    //按照价格的降序来查询商品(order by)
    List<Phone> getAllPhoneByPriceDesc(Connection connection) throws SQLException;

    //按照热度排列商品顺序——升序
    List<Phone> getAllPhoneByHotAsc(Connection connection) throws SQLException;

    //按照热度排列商品顺序——降序
    List<Phone> getAllPhoneByHotDesc(Connection connection) throws SQLException;

    //补货（补充新手机）

}
