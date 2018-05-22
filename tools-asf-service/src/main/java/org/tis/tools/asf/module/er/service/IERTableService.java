package org.tis.tools.asf.module.er.service;

import com.baomidou.mybatisplus.service.IService;
import org.tis.tools.asf.module.er.entity.ERTable;

public interface IERTableService extends IService<ERTable> {
    /**
     *      通过表ID查询全部列名及相关信息,查询操作，增加，删除，修改操作右键实现，
     *      是否该功能放在了ERApp中实现
     */
    ERTable queryERTableDetailById(String erTableId);

    /**
     *      增加表
     */
    void addERTable(ERTable ertable);

    /**
     *      通过ID修改表
     */
    void updateERTableById(String erTableId);

    /**
     *      通过ID删除表
     */
    void deleteERTableById(String erTableId);
}
