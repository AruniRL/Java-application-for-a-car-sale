package newx;

import java.util.Date;
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
public class renting1 {
    private String vehical_num;
    private int no_of_days;
    private String mode;
    private float rental_amount;
    private String returndate;
    private float key_money;
    private String renter_name;
    private String renter_nic;
    private String renter_con;
    private String renter_add;

        ResultSet rs;
    /**
     * @return the vehical_num
     */
    public String getVehical_num() {
        return vehical_num;
    }

    /**
     * @param vehical_num the vehical_num to set
     */
    public void setVehical_num(String vehical_num) {
        this.vehical_num = vehical_num;
    }

    /**
     * @return the no_of_days
     */
    public int getNo_of_days() {
        return no_of_days;
    }

    /**
     * @param no_of_days the no_of_days to set
     */
    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
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

    /**
     * @return the rental_amount
     */
    public float getRental_amount() {
        return rental_amount;
    }

    /**
     * @param rental_amount the rental_amount to set
     */
    public void setRental_amount(float rental_amount) {
        this.rental_amount = rental_amount;
    }

    /**
     * @return the returndate
     */
    public String getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the key_money
     */
    public float getKey_money() {
        return key_money;
    }

    /**
     * @param key_money the key_money to set
     */
    public void setKey_money(float key_money) {
        this.key_money = key_money;
    }

    /**
     * @return the renter_name
     */
    public String getRenter_name() {
        return renter_name;
    }

    /**
     * @param renter_name the renter_name to set
     */
    public void setRenter_name(String renter_name) {
        this.renter_name = renter_name;
    }

    /**
     * @return the renter_nic
     */
    public String getRenter_nic() {
        return renter_nic;
    }

    /**
     * @param renter_nic the renter_nic to set
     */
    public void setRenter_nic(String renter_nic) {
        this.renter_nic = renter_nic;
    }

    /**
     * @return the renter_con
     */
    public String getRenter_con() {
        return renter_con;
    }

    /**
     * @param renter_con the renter_con to set
     */
    public void setRenter_con(String renter_con) {
        this.renter_con = renter_con;
    }

    /**
     * @return the renter_add
     */
    public String getRenter_add() {
        return renter_add;
    }

    /**
     * @param renter_add the renter_add to set
     */
    public void setRenter_add(String renter_add) {
        this.renter_add = renter_add;
    }
    
 
     private String SQLLL="INSERT INTO `renting`(`vehinum`, `noofdays`, `model`, `renamount`, `returndate`, `keymon`, `renname`, `rennic`, `rencon`, `renaddr`) VALUES"+" (?,?,?,?,?,?,?,?,?,?)";
     private String sql="Select * from buying where carnumber=?";
     public void getdetail(){
         
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
            PreparedStatement pst = con.prepareCall(SQLLL);
            pst.setString(1,getVehical_num() );
            pst.setInt(2, getNo_of_days());
            pst.setString(3, getMode());
            
            pst.setFloat(4, getRental_amount());
            pst.setString(5, getReturndate());
            pst.setFloat(6, getKey_money());
            pst.setString(7, getRenter_name());
            pst.setString(8, getRenter_nic());
            pst.setString(9, getRenter_con());
            pst.setString(10, getRenter_add());
            pst.executeUpdate();
            
            
                JOptionPane.showMessageDialog(null, "Done");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     
     }
     
    
      private String sqll ="select model,retalamount from buying where carnumber=?";
      
     public  void search1(String[] args) {
        
         try {
              Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
        
       
              
              
              
         } catch (Exception e) {
         }
        
    }
     
    
     
     
     

    /**
     * @return the SQLLL
     */
    public String getSQLLL() {
        return SQLLL;
    }

    /**
     * @param SQLLL the SQLLL to set
     */
    public void setSQLLL(String SQLLL) {
        this.SQLLL = SQLLL;
    }

    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * @return the sqll
     */
    public String getSqll() {
        return sqll;
    }

    /**
     * @param sqll the sqll to set
     */
    public void setSqll(String sqll) {
        this.sqll = sqll;
    }

}
