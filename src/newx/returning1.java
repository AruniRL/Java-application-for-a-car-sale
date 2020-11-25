package newx;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class returning1 {
    private String vehinum;
    private String cusna;
    private int retde;
    private float fine;
    private float payme;
    private float fulpay;

    /**
     * @return the vehinum
     */
    public String getVehinum() {
        return vehinum;
    }

    /**
     * @param vehinum the vehinum to set
     */
    public void setVehinum(String vehinum) {
        this.vehinum = vehinum;
    }

    /**
     * @return the cusna
     */
    public String getCusna() {
        return cusna;
    }

    /**
     * @param cusna the cusna to set
     */
    public void setCusna(String cusna) {
        this.cusna = cusna;
    }

    /**
     * @return the retde
     */
    public int getRetde() {
        return retde;
    }

    /**
     * @param retde the retde to set
     */
    public void setRetde(int retde) {
        this.retde = retde;
    }

    /**
     * @return the fine
     */
    public float getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(float fine) {
        this.fine = fine;
    }

    /**
     * @return the payme
     */
    public float getPayme() {
        return payme;
    }

    /**
     * @param payme the payme to set
     */
    public void setPayme(float payme) {
        this.payme = payme;
    }

    /**
     * @return the fulpay
     */
    public float getFulpay() {
        return fulpay;
    }

    /**
     * @param fulpay the fulpay to set
     */
    public void setFulpay(float fulpay) {
        this.fulpay = fulpay;
    }
    
    private String sql="INSERT INTO `returning`(`vehicalnum`, `customername`, `returndelay`, `fine`, `payment`, `fullpayment`) VALUES (?,?,?,?,?,?)";
    private  String query = "DELETE FROM `renting` WHERE vehinum = ?";
    public void getdetails(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
            PreparedStatement pst = con.prepareCall(sql);
            pst.setString(1, getVehinum());
            pst.setString(2, getCusna());
            pst.setInt(3, getRetde());
            pst.setFloat(4, getFine());
            pst.setFloat(5, getPayme());
            pst.setFloat(6, getFulpay());
            pst.executeUpdate();
            
            
                JOptionPane.showMessageDialog(null, "Done");
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
       
    
    }
     public void delete(String id)
        {
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/carselling","root","");
            PreparedStatement pst = con.prepareCall(query);
            pst.setString(1, id);
            pst.execute();
            
            
               
        }
             catch(SQLException| ClassNotFoundException e)
                {
                        JOptionPane.showMessageDialog(null, e);
                }
            
        
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
    
}
