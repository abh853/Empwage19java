public class Emp{

public static void main(String args[])
{

int IS_FULL_TIME = 1;
int EMP_RATE_PER_HOUR = 20;
int empHrs = 0;
int empwage = 0;
int parttime = 2;
double empcheck = Math.floor(Math.random() * 10) % 3;
if (empcheck == IS_FULL_TIME)
     empHrs =  8;
else if(empcheck == parttime)
     empHrs = 4;
else
     empHrs = 0;
empwage = empHrs * EMP_RATE_PER_HOUR;
System.out.println("Emp Wage: " + empwage);

}
}
