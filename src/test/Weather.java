package test;

 enum  Weather {

    RANIY,SUNNY;
    int count=0;
    Weather(){
        System.out.print("c");
        count++;

    }
}

 class TEST344{
     static Weather w;
    public static void main(String[] args) {

        if(args.length==0)
            System.out.println("test");
        System.out.println(w.RANIY.count+" "+ w.SUNNY.count+" ");

    }
}


