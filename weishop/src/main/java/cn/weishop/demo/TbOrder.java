package cn.weishop.demo;

import java.math.BigDecimal;
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
public class TbOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 璁㈠崟id
     */
    private Long orderId;

    /**
     * 瀹炰粯閲戦銆傜簿纭埌2浣嶅皬鏁�;鍗曚綅:鍏冦�傚:200.07锛岃〃绀�:200鍏�7鍒�
     */
    private BigDecimal payment;

    /**
     * 鏀粯绫诲瀷锛�1銆佸湪绾挎敮浠橈紝2銆佽揣鍒颁粯娆�
     */
    private String paymentType;

    /**
     * 閭垂銆傜簿纭埌2浣嶅皬鏁�;鍗曚綅:鍏冦�傚:200.07锛岃〃绀�:200鍏�7鍒�
     */
    private String postFee;

    /**
     * 鐘舵�侊細1銆佹湭浠樻锛�2銆佸凡浠樻锛�3銆佹湭鍙戣揣锛�4銆佸凡鍙戣揣锛�5銆佷氦鏄撴垚鍔燂紝6銆佷氦鏄撳叧闂�,7銆佸緟璇勪环
     */
    private String status;

    /**
     * 璁㈠崟鍒涘缓鏃堕棿
     */
    private LocalDateTime createTime;

    /**
     * 璁㈠崟鏇存柊鏃堕棿
     */
    private LocalDateTime updateTime;

    /**
     * 浠樻鏃堕棿
     */
    private LocalDateTime paymentTime;

    /**
     * 鍙戣揣鏃堕棿
     */
    private LocalDateTime consignTime;

    /**
     * 浜ゆ槗瀹屾垚鏃堕棿
     */
    private LocalDateTime endTime;

    /**
     * 浜ゆ槗鍏抽棴鏃堕棿
     */
    private LocalDateTime closeTime;

    /**
     * 鐗╂祦鍚嶇О
     */
    private String shippingName;

    /**
     * 鐗╂祦鍗曞彿
     */
    private String shippingCode;

    /**
     * 鐢ㄦ埛id
     */
    private String userId;

    /**
     * 涔板鐣欒█
     */
    private String buyerMessage;

    /**
     * 涔板鏄电О
     */
    private String buyerNick;

    /**
     * 涔板鏄惁宸茬粡璇勪环
     */
    private String buyerRate;

    /**
     * 鏀惰揣浜哄湴鍖哄悕绉�(鐪侊紝甯傦紝鍘�)琛楅亾
     */
    private String receiverAreaName;

    /**
     * 鏀惰揣浜烘墜鏈�
     */
    private String receiverMobile;

    /**
     * 鏀惰揣浜洪偖缂�
     */
    private String receiverZipCode;

    /**
     * 鏀惰揣浜�
     */
    private String receiver;

    /**
     * 杩囨湡鏃堕棿锛屽畾鏈熸竻鐞�
     */
    private LocalDateTime expire;

    /**
     * 鍙戠エ绫诲瀷(鏅�氬彂绁紝鐢靛瓙鍙戠エ锛屽鍊肩◣鍙戠エ)
     */
    private String invoiceType;

    /**
     * 璁㈠崟鏉ユ簮锛�1:app绔紝2锛歱c绔紝3锛歁绔紝4锛氬井淇＄锛�5锛氭墜鏈簈q绔�
     */
    private String sourceType;

    /**
     * 鍟嗗ID
     */
    private String sellerId;


}
