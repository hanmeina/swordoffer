
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 * ���˱��ԣ�������Բ�Ľ������
 * @author Administrator
 *
 */
public class Main9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double PI = Math.acos(-1.0);
            double x1 = sc.nextDouble(); // Բ��x
            double y1 = sc.nextDouble(); // Բ��y
            double r1 = sc.nextDouble(); 

            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double r2 = sc.nextDouble();        
            double alpha,area;
            double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));//��Բ�ľ���

            if(d>=r1+r2||r1==0||r2==0){//���С����롢���ǵ���0 
                area=0;
            }
            else if(d+r1<=r2){//���� 
                area = PI*r1*r1;
            }
            else if(d+r2<=r1){//���� 
                area = PI*r2*r2;
            }
            else{
                alpha=Math.acos((d*d+r1*r1-r2*r2)/(2*d*r1));//���Ҷ���ȡ���ཻ�����Ա�Բ��Բ�Ľ�
                area=alpha*r1*r1;//��Բ�������
                alpha=Math.acos((d*d+r2*r2-r1*r1)/(2*d*r2));//���Ҷ���ȡ���ཻ��������һԲ��Բ�Ľ�
                area+=alpha*r2*r2;//��һԲ���������
                double s=(d+r1+r2)/2;//���׹�ʽ֮s
                area-=Math.sqrt(s*(s-d)*(s-r1)*(s-r2))*2;//�����������ȥ�������������Ϊ����
            }
            DecimalFormat df = new DecimalFormat( "0.000000"); 
            System.out.println(df.format(area));
        }
    }
}