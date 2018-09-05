package map.sortmap;

import map.comparable.ComparableEmployee;

public class Employee {

    String name;
    String id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }


    @Override
    public boolean equals(Object obj) {

        if(obj==null)
            return false;
        if(obj.getClass()!=Employee.class)
            return false;

        Employee emp = (Employee)obj;

        return (this.id==emp.id ||this.id.equals(emp.id)) && (this.name==emp.name || this.name.equals(emp.name));
    }

    @Override
    public int hashCode(){
        int hashCode = (this.id==null?0:this.id.hashCode())+(this.name==null?0:this.name.hashCode());
        return hashCode;
    }


}
