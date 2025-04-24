class types_of_variables{
    String name;
    static int age = 18;
    void setdata(String name){
        this.name=name;
    }
    void getdata(){
        int sem = 4;
        System.out.println("student name = "+this.name+" age = "+types_of_variables.age+" semester = "+sem);
    }
    public static void main(String args[]){
        types_of_variables obj=new types_of_variables();
        types_of_variables obj2=new types_of_variables();
        obj.setdata("Honvith");
        obj2.setdata("Yogananda");
        obj.getdata();
        obj2.getdata();

    }
}