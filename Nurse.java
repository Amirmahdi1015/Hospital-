public class Nurse {
    private int code;
    private int password;
    public Nurse(int code,int password){
        this.code=code;
        this.password=password;
    }

    public boolean contains(Nurse nurse) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return nurse.equals(nurse);   
    }
    public int getcode(){return this.code;}
    public int getpass(){return this.password;}
    public void changepass(int new_pass){
        this.password=new_pass;
        System.out.println("Your password was changed!!!");
        
    }
    


}   
