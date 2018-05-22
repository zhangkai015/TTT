package org.tis.tools.asf.module.er.service;

import com.baomidou.mybatisplus.service.IService;
import org.tis.tools.asf.module.er.entity.ERCategory;

public interface IERCategoryService extends IService<ERCategory> {

    /**
     * 通过分类模块ID查询，查询分类模块信息的操作，增加，删除，修改操作，
     */
    ERCategory queryERCategoryDetailById(String erCategoryId);

    /**
     * 增加分类模块
     */
    void addERCategory(ERCategory eercategory);

    /**
     * 通过ID删除分类模块
     */
    void deleteERCategoryById(String erCategoryId);

    /**
     * 通过ID修改分类模块
     */
    void updateERCategoryById(String erCategoryId);
}