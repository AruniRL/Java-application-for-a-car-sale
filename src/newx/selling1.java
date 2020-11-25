package newx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author shan
 */
public class selling1 {
    private String carnu;
    private String mod;
    private String conty;
    private Float pri;
    private String paymetha;
    private String buyname;
    private String buynic;
    private String buyconta;
    private String buyaddr;
    private String des;

    /**
     * @return the carnu
     */
    public String getCarnu() {
        return carnu;
    }

    /**
     * @param carnu the carnu to set
     */
    public void setCarnu(String carnu) {
        this.carnu = carnu;
    }

    /**
     * @return the mod
     */
    public String getMod() {
        return mod;
    }

    /**
     * @param mod the mod to set
     */
    public void setMod(String mod) {
        this.mod = mod;
    }

    /**
     * @return the conty
     */
    public String getConty() {
        return conty;
    }

    /**
     * @param conty the conty to set
     */
    public void setConty(String conty) {
        this.conty = conty;
    }

    /**
     * @return the pri
     */
    public Float getPri() {
        return pri;
    }

    /**
     * @param pri the pri to set
     */
    public void setPri(Float pri) {
        this.pri = pri;
    }

    /**
     * @return the paymetha
     */
    public String getPaymetha() {
        return paymetha;
    }

    /**
     * @param paymetha the paymetha to set
     */
    public void setPaymetha(String paymetha) {
        this.paymetha = paymetha;
    }

    /**
     * @return the buyname
     */
    public String getBuyname() {
        return buyname;
    }

    /**
     * @param buyname the buyname to set
     */
    public void setBuyname(String buyname) {
        this.buyname = buyname;
    }

    /**
     * @return the buynic
     */
    public String getBuynic() {
        return buynic;
    }

    /**
     * @param buynic the buynic to set
     */
    public void setBuynic(String buynic) {
        this.buynic = buynic;
    }

    /**
     * @return the buyconta
     */
    public String getBuyconta() {
        return buyconta;
    }

    /**
     * @param buyconta the buyconta to set
     */
    public void setBuyconta(String buyconta) {
        this.buyconta = buyconta;
    }

    /**
     * @return the buyaddr
     */
    public String getBuyaddr() {
        return buyaddr;
    }

    /**
     * @param buyaddr the buyaddr to set
     */
    public void setBuyaddr(String buyaddr) {
        this.buyaddr = buyaddr;
    }

    /**
     * @return the des
     */
    public String getDes() {
        return des;
    }

    /**
     * @param des the des to set
     */
    public void setDes(String des) {
        this.des = des;
    }
    private String SQLL ="INSERT INTO `selling`(`carnumber`, `model`, `conditiontype`, `price`, `paymentmethod`, `buyername`, `buyernic`, `buyercontact`, `buyeraddress`, `description`) VALUES "+"(?,?,?,?,?,?,?,?,?,?)";
    
    public void getdetailsss(){
        try{
            int rows=0;
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
            PreparedStatement pst = con.prepareCall(getSQLL());
            pst.setString(1, getCarnu());
            pst.setString(2, getMod());
            pst.setString(3, getConty() );
            pst.setFloat(4, getPri());
            pst.setString(5, getPaymetha());
            pst.setString(6, getBuyname());
            pst.setString(7, getBuynic());
            pst.setString(8, getBuyconta());
            pst.setString(9, getBuyaddr());
            pst.setString(10, getDes());
            rows=pst.executeUpdate();
            
            if(rows!=0)
                JOptionPane.showMessageDialog(null, "Done");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            
        
        }
    }

    /**
     * @return the SQLL
     */
    public String getSQLL() {
        return SQLL;
    }

    /**
     * @param SQLL the SQLL to set
     */
    public void setSQLL(String SQLL) {
        this.SQLL = SQLL;
    }
}
