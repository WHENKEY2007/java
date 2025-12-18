class Variables1{
static int clv=20; //class variable
 int inst = 30;    //instance variable
    public static void main(String args[]){
     int local=10; //local variable
     Variables1 obj=new Variables1();
     System.out.println("Local :"+local);
     System.out.println("class :"+clv);
     System.out.println("Instance :"+obj.inst);

    }
}