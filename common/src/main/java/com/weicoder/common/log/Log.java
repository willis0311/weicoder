package com.weicoder.common.log;

/**
 * 日志接口
 * @author WD  
 */
public interface Log {
	/**
	 * 使用trace打印日志
	 * @param msg 信息 可以是字符串xxx%sxxx
	 * @param params 字符串格式化参数
	 */
	void trace(String msg, Object... params);

	/**
	 * 使用trace打印日志
	 * @param t 异常
	 */
	void trace(Throwable t);

	/**
	 * 使用debug打印日志
	 * @param msg 信息 可以是字符串xxx%sxxx
	 * @param params 字符串格式化参数
	 */
	void debug(String msg, Object... params);

	/**
	 * 使用debug打印日志
	 * @param t 异常
	 */
	void debug(Throwable t);

	/**
	 * 使用info打印日志
	 * @param msg 信息 可以是字符串xxx%sxxx
	 * @param params 字符串格式化参数
	 */
	void info(String msg, Object... params);

	/**
	 * 使用info打印日志
	 * @param t 异常
	 */
	void info(Throwable t);

	/**
	 * 使用debug打印日志
	 * @param msg 信息 可以是字符串xxx%sxxx
	 * @param params 字符串格式化参数
	 */
	void warn(String msg, Object... params);

	/**
	 * 使用debug打印日志
	 * @param t 异常
	 */
	void warn(Throwable t);

	/**
	 * 使用error打印日志
	 * @param msg 信息 可以是字符串xxx%sxxx
	 * @param params 字符串格式化参数
	 */
	void error(String msg, Object... params);

	/**
	 * 使用debug打印日志
	 * @param t 异常
	 */
	void error(Throwable t);
}
