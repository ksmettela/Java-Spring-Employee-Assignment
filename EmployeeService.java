package com.project.Assignment;

import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class EmployeeService {
    private List<Employees> employees=new ArrayList<>(Arrays.asList(
            new Employees("101","Kumar","23/09/97","50000","Guntur","False"),
            new Employees("102","Dinesh","15/08/97","40000","Tirupathi","False"),
            new Employees("103","Akhil","06/04/97","60000","Kanigiri","True"),
            new Employees("104","Basha","03/12/95","70000","Vijayawada","True"),
            new Employees("105","Swaroop","15/07/97","80000","Gudur","False")
    ));
    public List<Employees> getAllEmpolyees(){
        return employees;
    }
    public Employees getEmployees(String id){
       return employees.stream().filter(t->t.getEmpId().equals(id)).findFirst().get();
    }
    public void addEmployees(Employees employees1){
        employees.add(employees1);
    }
    public void updateEmployees(String id,Employees employees1){
        for(int i=0;i<employees.size();i++){
            Employees t=employees.get(i);
            if(t.getEmpId().equals(id)){
                employees.set(i,employees1);
                return;
            }
        }
    }
    public void deleteEmployees(String id){
        employees.removeIf(t->t.getEmpId().equals(id));
    }
}
