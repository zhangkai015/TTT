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
 *  ER图中的表对象，如人员表，角色表等等
 *  对应位置：diagram/contents/table
 *  一个表对象中含有多个列组成 {@link ERTable}
 * @author zhaoch
 */
@Data
@TableName("er_table")
public class ERTable {

    public static final String COLUMN_ID = "id";

    public static final String COLUMN_CATEGORY_ID = "category_id";

    public static final String COLUMN_PHYSICAL_NAME = "physical_name";

    public static final String COLUMN_LOGICAL_NAME = "logical_name";

    public static final String COLUMN_CREATETIME = "createtime";

    public static final String COLUMN_LASTUPDATE = "lastupdate";

    public static final String COLUMN_UPDATOR = "updator";

    public static final String COLUMN_STATUS= "data_status";

    /**
     * 标识ID
     */
    @TableId
    private String id;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 物理名称，对应表名 如人员表的物理名称为 USER
     */
    private String physicalName;

    /**
     * 逻辑名称，对应表名的解释 如USER表逻辑名称为 人员
     */
    private String logicalName;

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
     * 表描述
     */
    @JSONField(name = "description")
    private String desc;

    /**
     * 表字段集合
     */
    @TableField(exist = false)
    private ERColumns columns;

    @TableField(exist = false)
    private List<ERColumn> columnList;


}
