package tree.emphierarchy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeReportingHierarchy {
    private static Map<Integer,EmployeeNode> employeeNodeMap;
    private static EmployeeNode rootEmployee;

    public static void main(String[] args) throws Exception{
        employeeNodeMap = new HashMap<>();
        readDataAndCreateMap();
        buildHierarchyTree(rootEmployee);
       // printHierarchyTree(rootEmployee,0);
        getEmployeeAndSubOrdinateById(5);
        getEmployeeAndSubOrdinateByName("Mohit");
    }

    private static void readDataAndCreateMap()throws Exception{
        File file=new File("/Users/z001yb4/Documents/git-Dharamdas/DS/src/tree/emphierarchy/data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        EmployeeNode employee;
        while ((line=br.readLine())!=null)
        {
            String str[]=line.split(",");
            employee=new EmployeeNode(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]));
            employeeNodeMap.put(employee.getEmpId(),employee);
            if(employee.getReportingManager()==0)
                rootEmployee=employee;

        }
        br.close();
    }

    private static List<EmployeeNode> getSubOrdinateById(int id){
        List<EmployeeNode> subOrdinates = new ArrayList<EmployeeNode>();
        for(EmployeeNode empNode:employeeNodeMap.values())
        {
            if(empNode.getReportingManager()==id)
                subOrdinates.add(empNode);
        }
        return subOrdinates;
    }
    private static void buildHierarchyTree(EmployeeNode localRoot){
        EmployeeNode employee=localRoot;
        List<EmployeeNode> subOrdinates=getSubOrdinateById(employee.getEmpId());
        employee.setSubOrdinates(subOrdinates);
        if(subOrdinates.size()==0)
            return;
        for(EmployeeNode empnode:subOrdinates)
        {
            buildHierarchyTree(empnode);
        }

    }

    private static void getEmployeeAndSubOrdinateById(int empId){
       EmployeeNode emp= findEmployee(rootEmployee,empId);
        printData(emp);
    }
    private static void getEmployeeAndSubOrdinateByName(String empName){
        EmployeeNode emp= findEmployee(rootEmployee,empName);
        printData(emp);
    }
    private static EmployeeNode findEmployee(EmployeeNode root, int employeeId){
        if(employeeId==0)
            return null;
        if(root.getEmpId()==employeeId)
            return root;

        for(EmployeeNode e:root.getSubOrdinates())
        {
            return findEmployee(e,employeeId);
        }
        return null;

    }
    private static EmployeeNode findEmployee(EmployeeNode root, String employeeName){
        if(employeeName==null)
            return null;
        if(root.getEmpName().equals(employeeName))
            return root;

        for(EmployeeNode e:root.getSubOrdinates())
        {
            return findEmployee(e,employeeName);
        }
        return null;

    }

    private static void printHierarchyTree(EmployeeNode rootEmpNode,int level){


        //System.out.println(rootEmpNode.getEmpName());
        printData(rootEmpNode);
        List<EmployeeNode> subOrdinates=rootEmpNode.getSubOrdinates();
        System.out.println();
        for(EmployeeNode e:subOrdinates)
        {
            printHierarchyTree(e,level+1);
        }

    }

    private static void printData(EmployeeNode employee){
        if(employee.getSubOrdinates().size()>0) {
            System.out.println("Manager: " + employee.getEmpName());
            System.out.println("-------------");
            for (EmployeeNode e : employee.getSubOrdinates()) {
                System.out.println(e.getEmpName());
            }
        }
        else{
            System.out.println("Team Member: "+employee.getEmpName());
        }


    }

}
