package v100;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JollyJumpers_UVa10038{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(br.ready())
		{
			StringTokenizer st = new StringTokenizer(br.readLine());

			if(isJolly(st))
				sb.append("Jolly\n");
			else
				sb.append("Not jolly\n");
		}
		System.out.print(sb);
	
		
	}
	
	public static boolean isJolly(StringTokenizer st)
	{
		int n= Integer.parseInt(st.nextToken());
		boolean[] flag = new boolean[n-1];
		int pre = Integer.parseInt(st.nextToken());
		for(int i = 0; i < n-1; i++)
		{
			int cur = Integer.parseInt(st.nextToken());
			int diff = Math.abs(cur-pre);
			if(diff<1||diff>n-1||flag[diff-1])
				return false;
			flag[diff-1] = true;
			pre = cur;
		}
		return true;
	}
}