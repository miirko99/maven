package org.example;

class Student {
    private String name;
    private int index;
    Student(){}
    public Student(String name, int index){
        this.name=name;
        this.index=index;
    }
    public void stampaj(){
        System.out.println("student "+name+" je upisan pod indeksom "+index);
    }
}
