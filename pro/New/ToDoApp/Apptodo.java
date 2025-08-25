


class Task{
    int id;
    String title;
    boolean iscompleted=false;

// using constructor

    Task(int id,String title,boolean iscompleted){
   
        this.id=id;
        this.title=title;
        this.iscompleted=iscompleted;    
    }
 
  //   using getter/setter
  // getters
    public void setID(int id){
        this.id=id;
    }

       public void setTitle(String title){
        this.title=title;
    }
    
       public void setiscompleted(boolean iscompleted){
        this.iscompleted=iscompleted;
    }

//setters
 
 public int getId(){
    return this.id;
 }

 public String getTitle(){
    return this.title;
}

 public boolean getiscompleted(){
    return this.iscompleted;
 }





}
