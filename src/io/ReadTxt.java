package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReadTxt {

	/**
     * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
     */
    public static Map<String,String> handelFaceMatchData(File filePath,String dataFile) throws Exception{
    	Map<String,String> dataMap = new HashMap<String,String>();
    	
    	InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath + "\\" +dataFile), "GBK");
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        while((s = br.readLine())!=null){
        	if(s.indexOf(Contant.getFaceMatchByName()) > -1){
        		dataMap.put(Contant.getFaceMatchByName(), (s.split("="))[1]);
        	}else if(s.indexOf(Contant.getFaceMatchByCertificateNumber()) > -1){
        		dataMap.put(Contant.getFaceMatchByCertificateNumber(), (s.split("="))[1]);
        	}
        }
        br.close();
        return dataMap;
    }
    
	public static void main(String[] args) {
		try{
			Date now = new Date();
			Date now_5 = new Date(now.getTime() - 300000); //10分钟前的时间
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");//可以方便地修改日期格式
			
			String rootfilePath = "C:\\Picture\\192.168.0.64[facematch]";
			File rootFile = new File(rootfilePath);
			String[] rootFiles = rootFile.list();
			for(String rootFi : rootFiles){
				String fileTime = (rootFi.split("_"))[1];
				long time = dateFormat.parse(fileTime).getTime();
				if(now.getTime() >= time && now_5.getTime() <= time){
					String secondLevelFilePath = rootfilePath + "\\" + rootFi;
					File secondLevelFile = new File(secondLevelFilePath);
					String[] secondLevelFiles = secondLevelFile.list();
					for(String secondLevelFi : secondLevelFiles){
						if(secondLevelFi.indexOf(Contant.getFaceMatchDataFileMark()) > -1){
							Map<String,String> dataMap = handelFaceMatchData(secondLevelFile, secondLevelFi);
							String byName = dataMap.get(Contant.getFaceMatchByName());
							String byCertificateNumber= dataMap.get(Contant.getFaceMatchByCertificateNumber());
							
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
