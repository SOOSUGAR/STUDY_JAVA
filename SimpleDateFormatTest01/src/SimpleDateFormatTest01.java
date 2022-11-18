import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat - ��¥ �����͸� �پ��� �������� ����� �� �ֵ��� �ϴ� Ŭ����
public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		// 2022�� ����� ������, 2022-03-09 14:05:09
		Date d = new Date(122, 2, 9, 14, 5, 9);
		
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println();
		
		// SimpleDateFormat Ŭ������ ����Ͽ� ��¥ ������
		// ��¥�� �ַ� - �Ǵ� / ��, �ð��� : ���� �����Ͽ� ���
		// yyyy : �⵵ 4�ڸ�(2022), yy : �⵵ 2�ڸ�(22), MM: �� 2�ڸ�(09), M : �� 1�ڸ�(9), dd : �� 2�ڸ� , d : �� 1�ڸ�
		// HH : 24�ð� 2�ڸ�, hh : 12�ð� 2�ڸ�, h : 12�ð� 1�ڸ�, mm : �� 2�ڸ�, m : �� 1�ڸ�, ss : �� 2�ڸ�, s : �� 1�ڸ� 
		// a : ���� ���� ǥ��, E : ���� ǥ��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy�� M�� d��");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH�� mm�� ss��");
		SimpleDateFormat sdf6 = new SimpleDateFormat("hh�� m�� s��");
		SimpleDateFormat sdf7 = new SimpleDateFormat("h:m:s");
		
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd(E) a hh:mm:ss");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		
		
		System.out.println(sdf5.format(d));
		System.out.println(sdf6.format(d));
		System.out.println(sdf7.format(d));
		
		System.out.println(sdf8.format(d));
		System.out.println(sdf9.format(d));
		
	}

}
