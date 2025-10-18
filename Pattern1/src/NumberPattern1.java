
class NumberPattern1
{
public static void main(String [] args)
{

int[] a1={10,23,11,24,5};

int[] a2={23,1,5,10,11};
int flag=0;
for(int i=0;i<a1.length;i++)
{
for(int j=0;j<i;j++)
{
if(a1[i]==a2[j])
{
System.out.println("index no"+j);
}
else 
{
System.out.println("NA");
}
}
}
}
}
