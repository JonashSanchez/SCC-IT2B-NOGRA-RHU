/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Hazel Nogra
 */
public class Session {
    private static Session instance;
    private int uid;
    private String fname;
    private String lname;
    private String uemail;
    private String ucontact;
    private String utype;
    private String uusername;
    private String ustatus;
    private int pid;
     private int aid;
      private int mid;
    private Session(){
        //Private cons.prevents instance
    }
    
    public static synchronized Session getInstance() {
     if(instance==null){
         instance = new Session();
     }
     return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }
    
    public int getMid() {
        return mid;
    }
    
    public int getPid() {
        return pid;
    }
    
    public int getAid() {
        return aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }
    
    

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    
    
    
   
}
