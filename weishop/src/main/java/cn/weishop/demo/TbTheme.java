package cn.weishop.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class TbTheme implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "themeid", type = IdType.AUTO)
    private Integer themeid;

    /**
     * 主题名
     */
    private String themename;

    /**
     * 样式图
     */
    private String picture;

    /**
     * 是否启用
     */
    private String status;

    /**
     * 启动时间
     */
    private LocalDate createTime;

    /**
     * 截止时间
     */
    private LocalDate closeTime;

    /**
     * 操作人
     */
    private String person;

    /**
     * 操作时间
     */
    private LocalDate update;


}
