class company
{
    public void EmpDetails(String e_name, int e_id,double e_salary, int e_rollNo)
    {
        System.out.println(" "+e_name+" "+e_id+" "+e_salary+" "+e_rollNo);
    }
    public void depDetails(String d_name, int d_id,int No_of_emp, long d_phoneNo)
    {
        System.out.println(" "+d_name+" "+d_id+" "+No_of_emp+" "+d_phoneNo);
    }


}
public class meths4
{
    public static void main(String[] args){
        company obj1=new company();
        obj1.EmpDetails("kalpana", 234,20000,23);
        obj1.depDetails("kavya",45,67,1234567);
    }
}
