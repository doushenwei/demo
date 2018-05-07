package io;

/**
 * Created by dousw on 2018年3月13日
 * 功能描述：考勤常量类
 */
public class Contant {

	/**
	 * 人脸比对获取的姓名
	 */
	public static final String FACE_MATCH_BY_NAME = "byName";
	
	/**
	 * 人脸比对获取的身份证号码
	 */
	public static final String FACE_MATCH_BY_CERTIFICATE_NUMBER = "byCertificateNumber";
	
	/**
	 * 人脸比对数据存储文件名标识
	 */
	public static final String FACE_MATCH_DATA_FILE_MARK = "AlarmInfo";
	
	/**
	 * 人脸比对图像文件名标识
	 */
	public static final String FACE_MATCH_IMG_FILE_MARK = "MatchSnapBigPic";

	public static String getFaceMatchByName() {
		return FACE_MATCH_BY_NAME;
	}

	public static String getFaceMatchByCertificateNumber() {
		return FACE_MATCH_BY_CERTIFICATE_NUMBER;
	}

	public static String getFaceMatchDataFileMark() {
		return FACE_MATCH_DATA_FILE_MARK;
	}

	public static String getFaceMatchImgFileMark() {
		return FACE_MATCH_IMG_FILE_MARK;
	}
}
