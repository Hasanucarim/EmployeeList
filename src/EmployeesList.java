import java.util.ArrayList;
import java.util.List;
class EmployeesList extends Construction {
public static void main(String[] args) {
        Construction emp = new Construction();

        List<Construction> employeesList  = new ArrayList<>();
        employeesList.add(new Construction());
        employeesList.add(new Construction());
        employeesList.add(new Construction());
        employeesList.add(new Construction());
        employeesList.add(new Construction());

        employeesList.get(0).setInfo("Jack",5000,2000);
        employeesList.get(1).setInfo("Micheal",6000,2001);
        employeesList.get(2).setInfo("Steve",7000,2002);
        employeesList.get(3).setInfo("Helen",8000,2003);
        employeesList.get(4).setInfo("Kristen",9000,2004);

        for (Construction e:employeesList){

                System.out.println(e);
        }
        }
}