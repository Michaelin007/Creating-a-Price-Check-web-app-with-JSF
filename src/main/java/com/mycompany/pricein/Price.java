/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pricein;

import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;



/**
 *
 * @author michael
 */
@Named
@ManagedBean
@RequestScoped

public class Price implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    String check="";
    String picture="";
    String jumia;
    String clients;

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
   

    public String getCheck() {
        return check;
    }

    public void setCheck(String checkk) {
        check = checkk;
    }

    public String getJumia() {
        return jumia;
    }

    public void setJumia(String jumiaa) {
        jumia = jumiaa;
    }
    
    public String queresult(){
        String qq=check;
       
        if(qq.contains("bread")||qq.contains("Bread")){
            String hup=" A loaf of <b>bread</b> check back for more <br/> shade was right though ";
            //jumia= StringEscapeUtils.escapeHtml4(hup);
            jumia=hup;
            Path pup= Paths.get("resources/images/PriceCheck3.png");
            picture=pup.toString();
            clients="check back";
            
            return ("resultt?"+queresult());
        }
        else if(qq.contains("drink")|| qq.contains("pepsi")){
             Path pup= Paths.get("resources/images/PriceCheck3.png");
            picture=pup.toString();
            String drink="<h4> Drinks </h4> <hr> <br/> <style>table,th,td {border-collapse:collapse; border:1px solid black;}</style> <table style=\" margin: 2px auto; \"><thread><tr><th> Product </th><th> Price(#)</th></tr></thread><tbody><tr><td> Coca-Cola </td><td> 500</td></tr></tbody><tfoot><tr><td>footer</td><td>footer</td></tr></tfoot></table>"
                    + " Pepsi Cola (35 cl): <b>#100</b> <br/> Pepsi Cola (60 cl): <b>#200</b> <br/> Cocaa Cola (35 cl): <b>#100</b> <br/> Coca Cola (35 cl): <b>#100</b> <br/> webite link: <a href= \"www.google.com\"> google </a>";
            jumia=drink;
            clients="<style>table{width:100%; border-collapse:collapse;}th,td {text-align:center;border-spacing:5px; padding: 8px; border:1px solid black;}</style> "
                     +"<h4> Contact Details </h4> <hr>"
                    + "<br/>"
                    + "<table style=\" margin: 2px auto; \"><thread><tr><th> Enterprise Name </th><th> Address</th><th> Contact </th></tr></thread><tbody><tr><td> Coca-Cola </td><td> 500</td> <td> ibadan </td></tr></tbody>"
            
                   + "<tfoot><tr><td>footer</td><td>footer</td></tr></tfoot></table>";
            
             return ("resultt");
           
        }
        else if(qq.contains("Indomie")|| qq.contains("noodles")|| qq.contains("mimee")){  //<style>table,th,td {border-collapse:collapse; border:1px solid black;}</style> <table style=\" margin: 2px auto; \"
             Path pup= Paths.get("resources/images/PriceCheck3.png");
            picture=pup.toString();
            String noodles="<h4> Noodles </h4> <hr> <br/> <table> <thread><tr><th> Product </th><th> Price(#)</th></tr></thread>"
                    + "<tbody><tr><td> Indomie Super pack (1 Cartoon) </td><td> 3400</td></tr><tr> <td> Indomie Normal pack (1 Cartoon) </td><td> 2200</td></tr></tbody>"
                    + "<tfoot><tr><td>footer</td><td>footer</td></tr></tfoot></table>"
                    +" <br/> webite link: <a href= \"www.google.com\"> google </a>";
            jumia=noodles;
            clients="<style>table{width:100%; border-collapse:collapse;}th,td {text-align:center;border-spacing:5px; padding: 8px; border:1px solid black;}</style> "
                     +"<h4> Contact Details </h4> <hr>"
                    + "<br/>"
                    + "<table style=\" margin: 2px auto; \"><thread><tr><th> Enterprise Name </th><th> Address</th><th> Contact </th></tr></thread><tbody><tr><td> Coca-Cola </td><td> 500</td> <td> ibadan </td></tr></tbody>"
                    + "<tfoot><tr><td>footer</td><td>footer</td></tr></tfoot></table>";
             return ("resultt");
           
        }
        else{
            jumia="not available <br/><br/><br/><br/>will be added to database soon";
            picture="not available";
            clients="not available";
             return ("resultt");
        }
        
    }
    
}
