package tree.emphierarchy;

import java.util.List;

public class EmployeeNode {
    int empId;
    String empName;
    int reportingManager;
    List<EmployeeNode> subOrdinates;

    public EmployeeNode(int id,String name,int reportingManager)
    {
        try{

            this.empId=id;
            this.empName=name;
            this.reportingManager=reportingManager;
        }catch (Exception e)
        {
            System.err.println("Exception while Creating Employee");
        }
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(int reportingManager) {
        this.reportingManager = reportingManager;
    }

    public List<EmployeeNode> getSubOrdinates() {
        return subOrdinates;
    }

    public void setSubOrdinates(List<EmployeeNode> subOrdinates) {
        this.subOrdinates = subOrdinates;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj==null)
            return false;
        if(obj.getClass()!= EmployeeNode.class)
            return false;
        EmployeeNode emp=(EmployeeNode) obj;
        return (emp.empId==this.empId && emp.reportingManager==this.reportingManager && (emp.empName==this.empName || this.empName.equals(emp.empName)));
    }

    @Override
    public int hashCode() {
        int hashCode = (this.empId==0?0:this.empId)+(this.empName==null?0:this.empName.hashCode())+(this.reportingManager==0?0:this.reportingManager);
        return hashCode;
    }
}
