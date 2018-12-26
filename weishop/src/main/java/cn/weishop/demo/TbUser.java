package cn.weishop.demo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jeddden
 * @since 2018-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 操作时间
     */
    private LocalDateTime updated;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 使用状态（1启用 0未启用）
     */
    private String status;

    /**
     * 头像地址
     */
    private String headPic;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 账户余额
     */
    private BigDecimal accountMoney;

    /**
     * 手机是否验证 （0否  1是）
     */
    private String isMobileCheck;

    /**
     * 性别，1男，2女
     */
    private String sex;

    /**
     * 1.管理员 2.测试用户 3.普通用户
     */
    private Integer userLevel;

    /**
     * 积分
     */
    private Integer points;


}
