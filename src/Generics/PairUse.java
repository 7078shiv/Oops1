package Generics;

import OOPSIII.Vehicle;

public class PairUse {
    public static void main(String[] args) {
      /*  Pair<Integer,String> p = new Pair<Integer,String>(10, "salu");
        Pair pr=new Pair();
        pr.setFirst("shiv");
        System.out.println(p.getfirst() + " " + p.getSecond());
        //PairString ps=new PairString("aa","bb");
        // PairDouble pd=new PairDouble(2.5,3.6);
        Pair<String,String> ps = new Pair<>("aa", "ss");
        Pair<Double,Double> pd = new Pair<>(1.2, 2.5);
        ps.setFirst("shivang");
        ps.setSecond("Shrivastava");
        System.out.println(ps.getfirst() + " " + ps.getSecond());
        // dont use pemitive data type;
        //   Pair<Vehicle> pv=new Pair<>(new Vehicle(), new Vehicle());
        int i=10;// this is generally a object;
        Integer j=10;// refernece to the object;
        System.out.println(j+" "+i);*/
        Pair<String,Integer> pinner=new Pair<>("ab",100);
        Pair<Pair<String,Integer>,String> p=new Pair<>();
        p.setSecond("shivang");
        p.setFirst(pinner);
        //System.out.println(p.getfirst()+" "+p.getSecond());
       // System.out.println(p.getfirst());
        //System.out.println(p.getfirst().getfirst());
       // System.out.println(p.getfirst().getSecond());
        System.out.println(p.getfirst().getfirst()+" "+p.getfirst().getSecond()+" "+p.getSecond());
    }
}