package com.ailik.station.service.servInterface;

import com.ailik.station.pojo.goods.Phone;

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
}
