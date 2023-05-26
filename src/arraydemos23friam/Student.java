
package arraydemos23friam;


public class Student {
    private String sId;
    private String sName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String address;

    public Student(String sId, String sName) {
        //Comment added at 9:27
        
        //comment for modification!
        this.sId = sId;
        this.sName = sName;
        
    }   
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
}
