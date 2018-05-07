package demo;

import io.Contant;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Demo {

	public static void main(String[] args) throws ParseException, IOException {
		/*Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH) + 1;
        System.out.println(year + "-" + month);
        
        Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
		int day=aCalendar.getActualMaximum(Calendar.DATE);*/
		
		/*String str = "113.61055,34.832971;113.672066,34.804522;|113.60595,34.770844;113.67724,34.749492;|";
		String[] strs = str.split("\\|");
		System.out.println();*/
		
		/*List<Student> ss = new LinkedList<Student>();
		Student s1 = new Student();
		s1.setAge(11);
		ss.add(s1);
		
		Student s2 = new Student();
		s2.setAge(5);
		ss.add(s2);
		
		Student s3 = new Student();
		s3.setAge(22);
		ss.add(s3);
		
		Student s4 = new Student();
		s4.setAge(15);
		ss.add(s4);
		
		Collections.sort(ss, new TreeNodeComparator());
		
		for(Student st : ss){
			System.out.println(st.toString());
		}*/
		
		//System.out.println(new SimpleDateFormat("HH:mm").format(new Date()));
		
		/*int j = 0;
		
		for(int i=0;i<4;i++){
			j++;
		}
		
		System.out.println(j);
		
		System.out.println("2017-11-23 07:28:06".substring(0, 10));*/
		
		/*String[] str1 = "2017-11-03".split("-");
		//String str2 = "2017-11-23";
		System.out.println(Integer.parseInt(str1[2]));*/
		
		/*Instant first = Instant.now();
		
		//获取当前时间
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//通过提供输入参数来创建LocalTime。
		LocalTime specificTime = LocalTime.of(12, 20,25,40);
		System.out.println(specificTime);
		
		LocalDate localDate = LocalDate.now();
		System.out.println("今日日期："+localDate);
		System.out.println("昨天日期："+localDate.minusDays(1));
		System.out.println("明天日期："+localDate.plusDays(1));
		System.out.println("上个月的今天："+localDate.minusMonths(1));
		System.out.println("下个月的今天"+localDate.plusMonths(1));
		
		System.out.println("本月第1天的日期："+localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("本月最后1天的日期："+localDate.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("本年最后1天的日期："+localDate.with(TemporalAdjusters.lastDayOfYear()));
		
		System.out.println("今天是："+localDate.getYear() + "第" + localDate.get(ChronoField.ALIGNED_WEEK_OF_YEAR) + "周");
		
		System.out.println("格式化：" + localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));*/
		
		
		/*BigDecimal decimal = new BigDecimal("1.14");
                
        BigDecimal setScale1 = decimal.setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println(setScale1);
        BigDecimal setScale2 = decimal.setScale(1,BigDecimal.ROUND_DOWN);
        System.out.println(setScale2);
        BigDecimal setScale3 = decimal.setScale(1,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(setScale3);
        BigDecimal setScale4 = decimal.setScale(1,BigDecimal.ROUND_UP);
        System.out.println(setScale4);*/
		
		/*Date d = new Date();
		d.setTime(1522211604028L);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));*/
		
		/*#define GET_YEAR(_time_)          (((_time_)>>26) + 2000) 
		#define GET_MONTH(_time_)       (((_time_)>>22) & 15)
		#define GET_DAY(_time_)           (((_time_)>>17) & 31)
		#define GET_HOUR(_time_)         (((_time_)>>12) & 31)
		#define GET_MINUTE(_time_)      (((_time_)>>6) & 63)
		#define GET_SECOND(_time_)     (((_time_)>>0) & 63)*/
		
		//1522211604028
		/*System.out.println(((1222191085)>>26) + 2000);
		System.out.println(((1222191085)>>22) & 15);
		System.out.println(((1222191085)>>17) & 31);
		System.out.println(((1222191085)>>12) & 31);
		System.out.println(((1222191085)>>6) & 63);
		System.out.println(((1222191085)>>0) & 63);*/
		
		/*SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		long start = df.parse("09:00:00").getTime();
		long end = df.parse("12:00:00").getTime();
		long ss = df.parse("13:00:00").getTime();
		
		System.out.println(start <= ss && end >= ss);*/
		
		/*SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss");
		String str = "2018-03-12 18:31:45";
		str = str.substring(0, 10);
		System.out.println(str);*/
		//long faceMatchTime = df2.parse(str).getTime();
		
		
		/*Date now = new Date();
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
					if(secondLevelFi.indexOf(Contant.FACE_MATCH_DATA_FILE_MARK) > -1){
						
					}
				}
			}
		}*/
		
		/*File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println(courseFile);*/
		
		/*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		
		Date condTime = df.parse("2018-02");
		Calendar ca=Calendar.getInstance();
		ca.setTime(condTime);
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
		int a=ca.get(Calendar.DAY_OF_MONTH);
		System.out.println(a);
		
		Calendar ca1 = Calendar.getInstance();    
		ca1.set(Calendar.DAY_OF_MONTH, ca1.getActualMaximum(Calendar.DAY_OF_MONTH));  
		//String last = format.format(ca1.getTime());
		System.out.println(ca1.get(Calendar.DAY_OF_MONTH));*/
		
		/*String date = "2018-03-17 12:20:20";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = format.parse(date);
		
		String endTime = "2018-03-17 11:51:00";
		Date t = format.parse(endTime);
		
		long nd = 1000*24*60*60;//一天的毫秒数
		long nh = 1000*60*60;//一小时的毫秒数
		long nm = 1000*60;//一分钟的毫秒数
		
		long i = time.getTime() - t.getTime();
		
		long min = i%nd%nh/nm;
		
		System.out.println(min);*/
		
		/*String regex = "((http|ftp|https)://)(([a-zA-Z0- 9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0- 9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0- 9]{1,4})*(/[a-zA-Z0-9\\&%_\\./-~-]*)?";
		
		//String url = "http://192.168.0.222:8080/font/eat/faceMatch/createUser";
		
		String url = "http://www.baidu.com";
		System.out.println(url.matches(regex));*/
		
		/*String json = "{\"消费金额\":2,\"账户余额\":100,\"姓名\":\"窦申伟\",\"部门\":\"定制组\"}";
    	JSONObject jsonObj = JSON.parseObject(json);
    	System.out.println(jsonObj);*/
		
		String url = "ftp://192.168.19.63:8010/recordImg/2018-03-28/66.jpg";
		System.out.println(url.substring(url.indexOf("//")+2, url.indexOf(":80")));
		System.out.println(url.substring(url.indexOf(":80")+1,url.indexOf(":80")+5));
	}
}


































