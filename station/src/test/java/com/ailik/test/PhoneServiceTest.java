package com.ailik.test;

import com.ailik.station.pojo.goods.Phone;
import com.ailik.station.service.servImpl.PhoneServiceImpl;
import com.ailik.station.service.servInterface.PhoneService;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 20:46
 */
class PhoneServiceTest {
    private PhoneService phoneService = new PhoneServiceImpl();

    @Test
    void getPhoneByBrandAsc() {
        List<Phone> oppo = phoneService.getPhoneByBrandAsc("OPPO");
        System.out.println(oppo);
    }

    @Test
    void getPhoneByBrandDesc() {
        List<Phone> oppo = phoneService.getPhoneByBrandDesc("OPPO");
        System.out.println(oppo);
    }

    @Test
    void getPhoneBySeriesAsc() {
        List<Phone> oppo = phoneService.getPhoneByBrandAsc("OPPO");
        System.out.println(oppo);
    }

    @Test
    void getPhoneBySeriesDesc() {
        List<Phone> iphone = phoneService.getPhoneBySeriesDesc("iphone");
        System.out.println(iphone);
    }

    @Test
    void getPhoneByModel() {
        Phone reno7 = phoneService.getPhoneByModel("Reno7");
        System.out.println(reno7);
    }

    @Test
    void getAllPhoneByPriceAsc() {
        List<Phone> allPhoneDesc = phoneService.getAllPhoneByPriceAsc();
        for (int i = 0; i < allPhoneDesc.size(); i++) {
            System.out.println(allPhoneDesc.get(i));
        }
    }

    @Test
    void getAllPhoneByPriceDesc() {
        List<Phone> allPhoneDesc = phoneService.getAllPhoneByPriceDesc();
        for (int i = 0; i < allPhoneDesc.size(); i++) {
            System.out.println(allPhoneDesc.get(i));
        }
    }

    @Test
    void getAllPhoneByHotAsc() {
        List<Phone> allPhoneDesc = phoneService.getAllPhoneByHotAsc();
        for (int i = 0; i < allPhoneDesc.size(); i++) {
            System.out.println(allPhoneDesc.get(i));
        }
    }

    @Test
    void getAllPhoneByHotDesc() {
        List<Phone> allPhoneDesc = phoneService.getAllPhoneByHotDesc();
        for (int i = 0; i < allPhoneDesc.size(); i++) {
            System.out.println(allPhoneDesc.get(i));
        }
    }
}