package org.action;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class aa extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//随机字符集,不包括0、O、1、I等辨认的字符
	public static final char[] CHARS={'0','1','2','3','4','5','6','7','8','9',
//		'A','B','C','D','E','F','G','H','J',
//	'K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'
	}; //随机数
	public static Random random=new Random(); //获取6位随机数

	public static String getRandomString(){
	      StringBuffer buffer=new StringBuffer();//字符串缓存
	for(int i=0;i<4;i++){ //循环4次
	   buffer.append(CHARS[random.nextInt(CHARS.length)]);//每次取一个随机字符
	  }
	return buffer.toString();
	  }
	public static Color getRandomColor(){//获取随机的颜色
		return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		} 

	public static Color getReverseColor(Color c){//返回某颜色的反色
		 return new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
		 }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		阻止生成的页面内容被缓存，保证每次重新生成随机验证码
		response.setHeader("Pragma","No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Express", 0);
		

		//设置输出类型，必须的
		response.setContentType("image/jpeg");
		String  randomString=getRandomString();//随机字符串
		//放到session中
		request.getSession(true).setAttribute("randomString", randomString);
		int width=80;//图片宽度
		int height=28;//图片高度
		Color color=getRandomColor();//随机颜色，用于背景色
		Color reverse=getReverseColor(color);//反色，用户前景色
		//创建一个彩色图片
		BufferedImage bi=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		Graphics2D g=bi.createGraphics(); //获取绘图对象
		    g.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,25));//创建一个彩色图片
		    g.setColor(color);//设置颜色
		    g.fillRect(0,0,width,height);//绘制背景
		    g.setColor(reverse);//设置颜色
		    g.drawString(randomString,18 , 20);//绘制随机字符
		    for(int i=0,n=random.nextInt(100);i<n;i++){
//	画最多100个噪音点
		      g.drawRect(random.nextInt(width), random.nextInt(height),1,1);
		      }
//		    通过HttpServletResponse获取的ServletOutputStream对象可以在客户端写进二进制数据（图片）
		    ServletOutputStream out=response.getOutputStream();//转成ＪＰＥＧ格式
		    JPEGImageEncoder  encoder=JPEGCodec.createJPEGEncoder(out);//编码器
		    encoder.encode(bi);//对图片进行编码
		    out.flush();//输出到客户端
	}

}
