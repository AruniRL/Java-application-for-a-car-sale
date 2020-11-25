package newx;


import java.awt.HeadlessException;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shan
 */
public class buying1 {
    private String carnum;
    private String mode;
    private String contyp;
    private float price;
    private String imgg;
    private float rentalam;
    private String paymentmeth;
    private String ownname;
    private String ownnic;
    private String ownconta;
    private String owneraddre;
    private String descri;
    private ResultSet rs;
     public String getCarnum() {
        return carnum;
    }

    /**
     * @param carnum the carnum to set
     */
    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

   
 private String SQL = "INSERT INTO `buying`(`carnumber`, `model`, `conditiontype`, `price`, `img`, `rentalamount`, `paymentmethod`, `ownername`, `ownernic`, `ownercontact`, `owneraddress`, `description`) VALUES "+"(?,?,?,?,?,?,?,?,?,?,?,?)";
    public void getdetails(){
        int rows=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
            PreparedStatement pst = con.prepareCall(getSQL());
            pst.setString(1, getCarnum());
            pst.setString(2, getMode());
            pst.setString(3, getContyp());
            pst.setFloat(4, getPrice());
            pst.setString(5, getImgg());
            pst.setFloat(6, getRentalam());
            pst.setString(7, getPaymentmeth());
            pst.setString(8, getOwnname());
            pst.setString(9, getOwnnic());
            pst.setString(10, getOwnconta());
            pst.setString(11, getOwneraddre());
            pst.setString(12, getDescri());
            rows=pst.executeUpdate();
            
            if(rows!=0)
                JOptionPane.showMessageDialog(null, "Done");
           
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * @return the contyp
     */
    public String getContyp() {
        return contyp;
    }

    /**
     * @param contyp the contyp to set
     */
    public void setContyp(String contyp) {
        this.contyp = contyp;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the imgg
     */
    public String getImgg() {
        return imgg;
    }

    /**
     * @param imgg the imgg to set
     */
    public void setImgg(String imgg) {
        this.imgg = imgg;
    }

    /**
     * @return the rentalam
     */
    public float getRentalam() {
        return rentalam;
    }

    /**
     * @param rentalam the rentalam to set
     */
    public void setRentalam(float rentalam) {
        this.rentalam = rentalam;
    }

    /**
     * @return the paymentmeth
     */
    public String getPaymentmeth() {
        return paymentmeth;
    }

    /**
     * @param paymentmeth the paymentmeth to set
     */
    public void setPaymentmeth(String paymentmeth) {
        this.paymentmeth = paymentmeth;
    }

    /**
     * @return the ownname
     */
    public String getOwnname() {
        return ownname;
    }

    /**
     * @param ownname the ownname to set
     */
    public void setOwnname(String ownname) {
        this.ownname = ownname;
    }

    /**
     * @return the ownnic
     */
    public String getOwnnic() {
        return ownnic;
    }

    /**
     * @param ownnic the ownnic to set
     */
    public void setOwnnic(String ownnic) {
        this.ownnic = ownnic;
    }

    /**
     * @return the ownconta
     */
    public String getOwnconta() {
        return ownconta;
    }

    /**
     * @param ownconta the ownconta to set
     */
    public void setOwnconta(String ownconta) {
        this.ownconta = ownconta;
    }

    /**
     * @return the owneraddre
     */
    public String getOwneraddre() {
        return owneraddre;
    }

    /**
     * @param owneraddre the owneraddre to set
     */
    public void setOwneraddre(String owneraddre) {
        this.owneraddre = owneraddre;
    }

    /**
     * @return the descri
     */
    public String getDescri() {
        return descri;
    }

    /**
     * @param descri the descri to set
     */
    public void setDescri(String descri) {
        this.descri = descri;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @return the SQL
     */
    public String getSQL() {
        return SQL;
    }

    /**
     * @param SQL the SQL to set
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }
}

  
    

