import java.util.*;
public class Game{
	public static void main(String[] arges){
		//ϵͳ���ɵ�˫ɫ��
		int[] sysRedBall = new int[6];
		int sysBlueBall = 0;
		//���ѡ���˫ɫ��
		int[] useRedBall = new int[6];
		int useBlueBaLL = 0;
		//˫ɫ�����ȷ����
		int redcount = 0;
		int bluecount = 0;
		
		Random r = new Random();
		int[] redBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		//����ϵͳ����
		int index = 0;
		for(int i=0;i<sysRedBall.length;i++){
			while(true){
				index = r.nextInt(33);
				if(redBall[index] != -1){
					sysRedBall[i] = redBall[index];
					redBall[index] = -1;
					break;
				}
			}
		}
		sysBlueBall = r.nextInt(16) + 1;
		//������ҵĺ���
		System.out.println("��ѡ�������� ��1-33��ѡ��");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<useRedBall.length;i++){
			useRedBall[i] = sc.nextInt();
		
		}
		System.out.println("��ѡ��������� ��1-16��ѡ��");
		useBlueBaLL = sc.nextInt();

		//��֤�Ƿ��н�
		for(int i=0;i<sysRedBall.length;i++){
			for(int j=0;j<useRedBall.length;j++){
				if(sysRedBall[i] == useRedBall[j]){
					redcount++;
					break;
				}
			}
		}
		if(sysBlueBall == useBlueBaLL){
			bluecount++;
		}
		//�ж��Ƿ��н�
		if(redcount == 6 && bluecount == 1){
			System.out.println("��ϲ������һ�Ƚ� ����1000��Ԫ");
		}else if(redcount == 6 && bluecount == 0){
			System.out.println("��ϲ�����˶��Ƚ� ����500��Ԫ");
		}else if(redcount == 5 && bluecount == 1){
			System.out.println("��ϲ���������Ƚ� ����3000Ԫ");
		}else if((redcount == 5 && bluecount == 0) || (redcount == 4 && bluecount == 1)){
			System.out.println("��ϲ�������ĵȽ� ����200Ԫ");
		}else if((redcount == 4 && bluecount == 0) || (redcount == 3 && bluecount == 1)){
			System.out.println("��ϲ��������Ƚ� ����10Ԫ");
		}else if((redcount == 2 && bluecount == 1) || (redcount == 1 && bluecount == 1)|| (redcount ==0 && bluecount == 1)){
			System.out.println("��ϲ���������Ƚ� ����5Ԫ");
		}else{
			System.out.println("лл���룬�´�����");
		}
		//������
		System.out.println("���ں������Ϊ��" + Arrays.toString(sysRedBall) + "�������Ϊ��" + sysBlueBall);
		System.out.println("��ѡ��ĺ������Ϊ��" + Arrays.toString(useRedBall) + "�������Ϊ��" + useBlueBaLL);
	}
}