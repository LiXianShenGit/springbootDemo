package io.renren.utils;

/**
 * 控制层返回封装,可自己扩展
 * @author jinyiding
 * @version $Id: ControllerResult.java, v 0.1 2015年7月19日 上午11:58:22 jinyiding Exp $
 */
public class ControllerResult extends BaseResult {

    /**  */
    private static final long serialVersionUID = -7656777736833501313L;

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public ControllerResult(final boolean isSuccess, final String message, final Object data) {
        super(isSuccess, message, data);
    }

    /**
     * @param isSuccess
     * @param message
     */
    public ControllerResult(final boolean isSuccess, final String message) {
        super(isSuccess, message);
    }

    /**
     * @param isSuccess
     * @param data
     */
    public ControllerResult(final boolean isSuccess, final Object data) {
        super(isSuccess, data);
    }

    /**
     * @param isSuccess
     */
    public ControllerResult(final boolean isSuccess) {
        super(isSuccess);
    }

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public ControllerResult(final boolean isSuccess, final String message, final Object data,
                            final String errorCode) {
        super(isSuccess, message, data);
        super.setErrorCode(errorCode);
    }

    /**
     * 默认成功返回, 调用:ControllerResult.success();
     * @return ControllerResult
     */
    public static ControllerResult success() {
        return new ControllerResult(BaseResult.SUCCESS);
    }

    /**
     * 默认成功并带message, 调用:ControllerResult.success("xxx");
     * @param message
     * @return ControllerResult
     */
    public static ControllerResult success(final String message) {
        return new ControllerResult(BaseResult.SUCCESS, message);
    }

    /**
     * 默认成功并带data
     * @param data
     * @return ControllerResult
     */
    public static ControllerResult success(final Object data) {
        return new ControllerResult(BaseResult.SUCCESS, data);
    }

    /**
     * 默认成功并带message,data, 调用:ControllerResult.success("xxx", Objectxxx);
     * @param message
     * @param data
     * @return ControllerResult
     */
    public static ControllerResult success(final String message, final Object data) {
        return new ControllerResult(BaseResult.SUCCESS, message, data);
    }

    /**
     * 默认错误返回
     * @return ControllerResult
     */
    public static ControllerResult error() {
        return new ControllerResult(BaseResult.FAILURE);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return ControllerResult
     */
    public static ControllerResult error(final String message) {
        return new ControllerResult(BaseResult.FAILURE, message);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return ControllerResult
     */
    public static ControllerResult error(final String message, final Object data) {
        return new ControllerResult(BaseResult.FAILURE, message, data);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return ControllerResult
     */
    public static ControllerResult error(final String message, final Object data,
                                         final String errorCode) {
        return new ControllerResult(BaseResult.FAILURE, message, data, errorCode);
    }

}
