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
	//����ַ���,������0��O��1��I�ȱ��ϵ��ַ���
	public static final char[] CHARS={'0','1','2','3','4','5','6','7','8','9',
//		'A','B','C','D','E','F','G','H','J',
//	'K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'
	}; //�����
	public static Random random=new Random(); //��ȡ6λ�����

	public static String getRandomString(){
	      StringBuffer buffer=new StringBuffer();//�ַ�������
	for(int i=0;i<4;i++){ //ѭ��4��
	   buffer.append(CHARS[random.nextInt(CHARS.length)]);//ÿ��ȡһ������ַ�
	  }
	return buffer.toString();
	  }
	public static Color getRandomColor(){//��ȡ�������ɫ
		return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		} 

	public static Color getReverseColor(Color c){//����ĳ��ɫ�ķ�ɫ��
		 return new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
		 }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		��ֹ���ɵ�ҳ�����ݱ����棬��֤ÿ���������������֤��
		response.setHeader("Pragma","No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Express", 0);
		

		//����������ͣ������
		response.setContentType("image/jpeg");
		String  randomString=getRandomString();//����ַ���
		//�ŵ�session��
		request.getSession(true).setAttribute("randomString", randomString);
		int width=80;//ͼƬ���
		int height=28;//ͼƬ�߶�
		Color color=getRandomColor();//�����ɫ�����ڱ���ɫ
		Color reverse=getReverseColor(color);//��ɫ���û�ǰ��ɫ
		//����һ����ɫͼƬ
		BufferedImage bi=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		Graphics2D g=bi.createGraphics(); //��ȡ��ͼ����
		    g.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,25));//����һ����ɫͼƬ
		    g.setColor(color);//������ɫ
		    g.fillRect(0,0,width,height);//���Ʊ���
		    g.setColor(reverse);//������ɫ
		    g.drawString(randomString,18 , 20);//��������ַ�
		    for(int i=0,n=random.nextInt(100);i<n;i++){
//	�����100��������
		      g.drawRect(random.nextInt(width), random.nextInt(height),1,1);
		      }
//		    ͨ��HttpServletResponse��ȡ��ServletOutputStream��������ڿͻ���д�����������ݣ�ͼƬ��
		    ServletOutputStream out=response.getOutputStream();//ת�ɣʣУţǸ�ʽ
		    JPEGImageEncoder  encoder=JPEGCodec.createJPEGEncoder(out);//������
		    encoder.encode(bi);//��ͼƬ���б���
		    out.flush();//������ͻ���
	}

}
