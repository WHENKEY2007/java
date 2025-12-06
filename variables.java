class Demo{
    static int x=10;
    int y=20;
    void show(){
        int z=30;
        System.out.println("Static:"+x);
        System.out.println("Instance:"+y);
        System.out.println("Local:"+z);
    }
}

class Variables{
    public static void main(String args[]){
        Demo obj1=new Demo();
        obj1.show();
        Demo obj2=new Demo();
        obj2.y=40;
        obj2.show();
    }
}