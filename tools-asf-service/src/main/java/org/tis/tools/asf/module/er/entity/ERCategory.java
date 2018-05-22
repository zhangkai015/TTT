package org.tis.tools.asf.module.er.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.tis.tools.core.validation.AddValidateGroup;

import java.util.List;

/**
 * ER图的分类模块(业务领域)，如常见的 组织管理、权限管理等等
 * 对应位置 diagram/settings/category_settings/categories/category
 * 一个分类模块由多个表对象构成 {@link ERTable}
 * @author zhaoch
 */
@Data
@TableName("er_category")
public class ERCategory {

    public static final String COLUMN_ID = "id";

    public static final String COLUMN_APP_ID = "app_id";

    public static final String COLUMN_NAME = "name";

    public static final String COLUMN_CREATETIME = "createtime";

    public static final String COLUMN_LASTUPDATE = "lastupdate";

    public static final String COLUMN_UPDATOR = "updator";

    public static final String COLUMN_STATUS= "data_status";

    /**
     * ID 标识
     */
    @TableId
    private String id;

    /**
     * 应用ID
     */
    @NotBlank(groups = {AddValidateGroup.class}, message = "应用ID不能为空")
    private String appId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 最近更新时间
     */
    @NotBlank(groups = {AddValidateGroup.class}, message = "最后修改时间不能为空")
    private String lastupdate;

    /**
     * 最近更新人员
     */
    @NotBlank(groups = {AddValidateGroup.class}, message = "最后修改人员不能为空")
    private String updator;

    /**
     * 数据状态
     */
    @NotBlank(groups = {AddValidateGroup.class}, message = "数据状态不能为空")
    private String data_status;

    /**
     * 分类下的表集合
     */
    @JSONField(name = "node_element")
    @TableField(exist = false)
    private List<String> tableIds;


    @TableField(exist = false)
    private List<ERTable> tableList;

}
