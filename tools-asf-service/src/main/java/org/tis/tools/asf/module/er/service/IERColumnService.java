package org.tis.tools.asf.module.er.service;

import com.baomidou.mybatisplus.service.IService;
import org.tis.tools.asf.module.er.entity.ERColumn;

public interface IERColumnService extends IService<ERColumn> {
    /**
     *      通过表ID实现列字段的修改，每次都是一次全量刷新
     */
    void updateERColumnByOther(String sql);

    /**
     *      通过取得表参数，构建生成表SQL
     */
    String updateERColumnCreatSql (ERColumn ercolumn);
}
