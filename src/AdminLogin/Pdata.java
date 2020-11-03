package AdminLogin;

/**
 *
 * @author HP
 */
public class Pdata {
     private String id;
     private String name;
     private String type;
     private String expdate;
     private String qty;
     private String prc;
     private String cmp;

    public Pdata(String id, String name, String type, String expdate, String qty, String prc, String cmp) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.expdate = expdate;
        this.qty = qty;
        this.prc = prc;
        this.cmp = cmp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrc() {
        return prc;
    }

    public void setPrc(String prc) {
        this.prc = prc;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
     
     
}
