class Person{
    private String name;
    private int age;
    private boolean isMale;
 
    void setName(String name){
        this.name = name;
    }
 
    String getname(){
        return name;
    }
 
    void setAge(int age){
        this.age = age;
    }
 
    int getAge(){
        return age;
    }
 
    void setGender(boolean gender){
        this.isMale = gender;
    }
 
    String getGender(){
        if(isMale == true){
            return "laki-laki";
        } else{
            return "perempuan";
        }
    }
}

public class TP2_1_H071231010 {
    public static void main(String[] args){
        Person person = new Person();
   
        person.setName("Indy Sekar Ayu");
        person.setAge(19);
        person.setGender(false); 
         
        System.out.println("Nama: " + person.getname());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Jenis Kelamin: " + person.getGender());
    }
}
