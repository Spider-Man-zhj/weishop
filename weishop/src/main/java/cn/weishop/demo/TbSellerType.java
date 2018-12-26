package cn.weishop.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jeddden
 * @since 2018-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbSellerType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "s_typeid", type = IdType.AUTO)
    private Integer sTypeid;

    /**
     * 商户类型
     */
    private String sType;

    /**
     * 百分比
     */
    private Float sPercent;

    /**
     * 0.禁用 1.启用
     */
    private Integer status;

    private String sRemark;


}
