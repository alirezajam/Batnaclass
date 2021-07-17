import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int i,m=0,flag=0;
        Scanner input = new Scanner ( System.in );
        System.out.println("عدد مورد نظر را وارد کنید: ");
        int n= input.nextInt ();//عدد گرفته شد از کاربر
        i = 2;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" عدد اول نیست");
        }else{
            while(i<=m){
                if(n%i==0){
                    System.out.println(n+"عدد اول نیست");
                    flag=1;
                    break;
                }
                i++;
            }
            if(flag==0)  { System.out.println(n+" عدد اول است"); }
        }//پایان else
    }
}
