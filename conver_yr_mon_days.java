import java.util.*;

class conver_yr_mon_days
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter days");
int days=sc.nextInt();

int year=days/365;
days=days%365;

int months=days/30;
days=days%30;

System.out.println("year:"+year+"+"months:"+months+""+"days:"+days);
}
}