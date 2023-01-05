class Construction {


        String name;
        int salary;
        int dateOfJoining;


    public void workers (String n, int s, int doj) {
        this.name = "unknown";
        salary = 0;
        dateOfJoining = 0;
}

    public void setInfo (String name, int salary, int dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString (){
        return "Employees[name : " + name + ", salary : " + salary + ", date of joining : " + dateOfJoining +"]";
    }


}


