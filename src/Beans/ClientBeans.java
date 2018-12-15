package Beans;

/**
 *
 * @author Pedro
 */
public class ClientBeans {
    private int Code;
    private String name;
    private String Street;
    private String Region;
    private String Phone;
    private String DateReg;
    
    public ClientBeans()
    {
    }

    public int getCode() {
        return Code;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return Street;
    }

    public String getRegion() {
        return Region;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDateReg() {
        return DateReg;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setDateReg(String DateReg) {
        this.DateReg = DateReg;
    }
    
    
}
