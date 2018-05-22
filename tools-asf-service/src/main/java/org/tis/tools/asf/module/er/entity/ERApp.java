package org.tis.tools.asf.module.er.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.tis.tools.core.validation.AddValidateGroup;
import org.tis.tools.core.validation.UpdateValidateGroup;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * <pre>
 * 对某个应用系统的ER设计
 * 如：网点业务平台中对网点业务的ER设计，整个"网点业务"抽象为一个应用。
 *
 * 一个应用领域中可分为多个分类模块({@link ERCategory})
 * </pre>
 */
@Data
@TableName("er_app")
public class ERApp {

    public static final String COLUMN_ID = "id";

    public static final String COLUMN_NAME = "name";

    public static final String COLUMN_DESC = "desc";

    public static final String COLUMN_CREATETIME = "createtime";

    public static final String COLUMN_LASTUPDATE = "lastupdate";

    public static final String COLUMN_UPDATOR = "updator";

    public static final String COLUMN_STATUS= "data_status";

    @Null(groups = {AddValidateGroup.class}, message = "新增时ID由系统指定")
    @NotBlank(groups = {UpdateValidateGroup.class}, message = "修改时ID不能为空")
    @TableId
    private String id;

    @NotBlank(groups = {AddValidateGroup.class}, message = "名称不能为空")
    private String name;

    private String desc;

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

    @TableField(exist = false)
    private List<ERCategory> categoryList;

    @TableField(exist = false)
    private List<ERTable> tableList;

    @TableField(exist = false)
    private List<ERColumn> columnList;



}
