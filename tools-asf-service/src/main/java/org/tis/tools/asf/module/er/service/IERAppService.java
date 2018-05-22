package org.tis.tools.asf.module.er.service;

import com.baomidou.mybatisplus.service.IService;
import org.springframework.stereotype.Service;
import org.tis.tools.asf.module.er.entity.ERApp;


public interface IERAppService extends IService<ERApp> {

    ERApp queryERAppDetailById(String erAppId);

    void parseERM(String appName, String xmlStr);

    /**
     *     分页查询全部ERApp
     *
     */
    ERApp queryAllERApp();

    /**
     *     通过erAppId删除
     */
    void deleteERAppById(String erAppId);

    /**
     *      新增ERApp
     */
    void addERApp(ERApp erApp);

    /**
     *     查询近七天修改传String,进行formate
     */
    ERApp queryERAppByDate(String date);

    /**
     *     查询最后修改人为自己的，
     */
    ERApp queryERAppByUpdator(String updator);

    /**
     *     自定义查询条件，
     */

    ERApp queryERAppByOther(String sql);
}
