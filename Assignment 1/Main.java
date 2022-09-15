public class Main {
        public static void main(String[] args){
                int n = Integer.parseInt(args[0]);
                int sum =0;
                int i;
                int cnt =0;

                for(i=1;i<=n;i++)
                {
                        for(int j=1;j<i;j++)
                        {
                                if(i%j==0)
                                {
                                        sum +=j;
                                }
                        }

                        if(sum == i)
                        {
                                cnt++;
                        }
                        sum =0;
                }
                System.out.println(cnt);


        }
}
