package iterator;

import pets.Pet;
import pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/4/25 15:36
 **/
public class Demo
{
    public static void main(String[] args){
        List<Pet> pets= Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
  /*      while(it.hasNext()){
            Pet p=it.next();
            System.out.println(p.id()+":"+p+"");
        }*/
        for(Pet p:pets){
            System.out.println(p.id()+":"+p+"");
        }


    }


}
