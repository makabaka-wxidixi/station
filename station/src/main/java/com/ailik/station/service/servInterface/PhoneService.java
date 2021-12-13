package com.ailik.station.service.servInterface;

import com.ailik.station.pojo.goods.Phone;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 20:10
 */
public interface PhoneService {
    //查询指定brand、价格为升序的手机
    List<Phone> getPhoneByBrandAsc(String brand);

    //查询指定brand、价格为降序的手机
    List<Phone> getPhoneByBrandDesc(String brand);

    //查询指定series、价格为升序的手机
    List<Phone> getPhoneBySeriesAsc(String series);

    //查询指定series、价格为降序的手机
    List<Phone> getPhoneBySeriesDesc(String series);

    //查询指定model的手机
    Phone getPhoneByModel(String model);

    //按价格升序进行查询
    List<Phone> getAllPhoneByPriceAsc();

    //按价格降序进行查询
    List<Phone> getAllPhoneByPriceDesc();

    //按照热度进行升序排序
    List<Phone> getAllPhoneByHotAsc();

    //按照热度进行降序排序
    List<Phone> getAllPhoneByHotDesc();

    //得到所有Phone
    List<Phone> getAllPhone();

    //添加新手机
    boolean addNewPhone(Phone phone);

    //根据型号删除已有的手机
    boolean deletePhoneByModel(String model);

    //根据品牌删除已有的手机
    boolean deletePhoneByBrand(String brand);

    //根据系列删除已有的手机
    boolean deletePhoneBySeries(String series);

    //根据id查询手机
    Phone getPhoneById(int id);

    //根据id修改手机数据
    boolean updatePhoneDataById(int id, Phone phone);

    //根据id删除手机
    boolean deletePhoneById(int id);
}
