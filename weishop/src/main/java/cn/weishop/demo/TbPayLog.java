package cn.weishop.demo;

import java.time.LocalDateTime;
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
public class TbPayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 支付订单号
     */
    private String outTradeNo;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 支付完成时间
     */
    private LocalDateTime payTime;

    /**
     * 支付金额（分）
     */
    private Long totalFee;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 交易号码
     */
    private String transactionId;

    /**
     * 交易状态
     */
    private String tradeState;

    /**
     * 订单编号列表
     */
    private String orderList;

    /**
     * 支付类型
     */
    private String payType;


}
