import java.util.*;
public class Game{
	public static void main(String[] arges){
		//系统生成的双色球
		int[] sysRedBall = new int[6];
		int sysBlueBall = 0;
		//玩家选择的双色球
		int[] useRedBall = new int[6];
		int useBlueBaLL = 0;
		//双色球的正确个数
		int redcount = 0;
		int bluecount = 0;
		
		Random r = new Random();
		int[] redBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		//生成系统号码
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
		//接受玩家的号码
		System.out.println("请选择红球号码 从1-33中选择");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<useRedBall.length;i++){
			useRedBall[i] = sc.nextInt();
		
		}
		System.out.println("请选择蓝球号码 从1-16中选择");
		useBlueBaLL = sc.nextInt();

		//验证是否中奖
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
		//判断是否中奖
		if(redcount == 6 && bluecount == 1){
			System.out.println("恭喜你中了一等奖 奖金1000万元");
		}else if(redcount == 6 && bluecount == 0){
			System.out.println("恭喜你中了二等奖 奖金500万元");
		}else if(redcount == 5 && bluecount == 1){
			System.out.println("恭喜你中了三等奖 奖金3000元");
		}else if((redcount == 5 && bluecount == 0) || (redcount == 4 && bluecount == 1)){
			System.out.println("恭喜你中了四等奖 奖金200元");
		}else if((redcount == 4 && bluecount == 0) || (redcount == 3 && bluecount == 1)){
			System.out.println("恭喜你中了五等奖 奖金10元");
		}else if((redcount == 2 && bluecount == 1) || (redcount == 1 && bluecount == 1)|| (redcount ==0 && bluecount == 1)){
			System.out.println("恭喜你中了六等奖 奖金5元");
		}else{
			System.out.println("谢谢参与，下次再来");
		}
		//输出结果
		System.out.println("本期红球号码为：" + Arrays.toString(sysRedBall) + "蓝球号码为：" + sysBlueBall);
		System.out.println("你选择的红球号码为：" + Arrays.toString(useRedBall) + "蓝球号码为：" + useBlueBaLL);
	}
}