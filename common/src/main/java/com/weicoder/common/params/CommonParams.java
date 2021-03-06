package com.weicoder.common.params;

import com.weicoder.common.constants.ArrayConstants;
import com.weicoder.common.constants.DateConstants;
import com.weicoder.common.constants.EncodingConstants;
import com.weicoder.common.constants.EncryptConstants;
import com.weicoder.common.constants.StringConstants;
import com.weicoder.common.constants.UnitConstants;

/**
 * Common包参数读取类
 * @author WD
 */
public final class CommonParams {
	/** IO缓冲区大小 */
	public final static int			IO_BUFFERSIZE			= Params.getInt("io.buffer", 8192);
	/** IO模式 */
	public final static String		IO_MODE					= Params.getString("io.mode", "nio");
	/** 默认编码 */
	public final static String		ENCODING				= Params.getString("encoding", EncodingConstants.UTF_8);
	/** 日期格式 */
	public final static String		DATE_FORMAT				= Params.getString("date.format", DateConstants.FORMAT_Y_M_D_H_M_S);
	/** 转换字节数组算法 */
	public final static String		BYTES					= Params.getString(StringConstants.BYTES, "high");
	/** DES加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH_DES	= Params.getInt("encrypt.key.length.DES", 64) / UnitConstants.BYTE_BIT;
	/** AES加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH_AES	= Params.getInt("encrypt.key.length.AES", 128) / UnitConstants.BYTE_BIT;
	/** RC2加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH_RC2	= Params.getInt("encrypt.key.length.RC2", 128) / UnitConstants.BYTE_BIT;
	/** RC4加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH_RC4	= Params.getInt("encrypt.key.length.RC4", 128) / UnitConstants.BYTE_BIT;
	/** RC4加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH_RC5	= Params.getInt("encrypt.key.length.RC5", 128) / UnitConstants.BYTE_BIT;
	/** 非对称加密使用的密钥的长度(位) */
	public final static int			ENCRYPT_KEY_LENGTH		= Params.getInt("encrypt.key.length", 1024);
	/** 加密使用的密钥 字符串 */
	public final static String		ENCRYPT_KEY				= Params.getString("encrypt.key", "www.weicoder.com");
	/** 加密使用的算法 */
	public final static String		ENCRYPT_ALGO			= Params.getString("encrypt.algo", EncryptConstants.ALGO_AES);
	/** 加密使用摘要算法 */
	public final static String		ENCRYPT_DIGEST			= Params.getString("encrypt.digest", EncryptConstants.ALGO_SHA_1);
	/** tcp连接地址 */
	public final static String		TCP_HOST				= Params.getString("tcp.host");
	/** tcp服务器端口 */
	public final static int			TCP_PORT				= Params.getInt("tcp.port");
	/** udp连接地址 */
	public final static String		UDP_HOST				= Params.getString("udp.host");
	/** udp服务器端口 */
	public final static int			UDP_PORT				= Params.getInt("udp.port");
	/** log实现 */
	public final static String		LOG_CLASS				= Params.getString("log.class", "com.weicoder.core.log.Log4j2");
	/** json实现 */
	public final static String		JSON_CLASS				= Params.getString("json.class", "com.weicoder.core.json.JsonFast");
	/** 执行任务名称数组 */
	public final static String[]	INIT_CLASSES			= Params.getStringArray("init.class", ArrayConstants.STRING_EMPTY);
	/** 登录信息保存时间 */
	public final static int			LOGIN_TIME				= Params.getInt("login.time", DateConstants.WEEK);

	private CommonParams() {}
}
