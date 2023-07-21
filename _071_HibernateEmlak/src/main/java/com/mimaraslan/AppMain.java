package com.mimaraslan;


import com.mimaraslan.dao.AgentDAO;
import com.mimaraslan.dao.BuyerDAO;
import com.mimaraslan.dao.PropertyDAO;
import com.mimaraslan.dao.SellerDAO;
import com.mimaraslan.model.Agent;
import com.mimaraslan.model.Buyer;
import com.mimaraslan.model.Property;
import com.mimaraslan.model.Seller;

import java.math.BigDecimal;

public class AppMain {
    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();
        SellerDAO sellerDAO = new SellerDAO();

        Agent agent = new Agent();
        agent.setAgentName("Lolo Emlak");
        agent.setPhone("123456789");
        agent.setEmail("lolo2123132@gmail.com");
        agent.setOfficeAddress("Kadıköy");
        agentDAO.saveOrUpdateAgent(agent);

        Agent agent2 = new Agent();
        agent2.setAgentName("Abc Emlak");
        agent2.setPhone("343243242");
        agent2.setEmail("abc34554@gmail.com");
        agent2.setOfficeAddress("Beşiktaş");
        agentDAO.saveOrUpdateAgent(agent2);


        Buyer buyer = new Buyer();
        buyer.setFirstName("Salih Polat");
        buyer.setLastName("Dönmez");
        buyer.setPhone("89444565153");
        buyer.setEmail("spd654646@gmail.com");
        buyerDAO.saveOrUpdateBuyer(buyer);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Yiğitcan");
        buyer2.setLastName("Abay");
        buyer2.setPhone("78787878");
        buyer2.setEmail("yabay62621@gmail.com");
        buyerDAO.saveOrUpdateBuyer(buyer2);



        Seller seller = new Seller();
        seller.setFirstName("Orhun");
        seller.setLastName("Bayındır ");
        seller.setPhone("5555555");
        seller.setEmail("orh777222@gmail.com");
        sellerDAO.saveOrUpdateSeller(seller);

        Seller seller2 = new Seller();
        seller2.setFirstName("Osman Onur");
        seller2.setLastName("Baş ");
        seller2.setPhone("44444");
        seller2.setEmail("onur555533@gmail.com");
        sellerDAO.saveOrUpdateSeller(seller2);


        Property property = new Property();
        property.setTitle("Dublex");
        property.setArea(300.55F);
        property.setBedrooms(6);
        property.setBathrooms(2);
        property.setPrice(BigDecimal.valueOf(1_000_000.25));
        property.setDescription("Doktordan temiz kullanılmış.");
        property.getBuyers().add(buyer);

        Property property2 = new Property();
        property2.setTitle("");
        property2.setArea(300.55F);
        property2.setBedrooms(6);
        property2.setBathrooms(2);
        property2.setPrice(BigDecimal.valueOf(1_000_000.25));
        property2.setDescription("Doktordan temiz kullanılmış.");
        property2.getBuyers().add(buyer2);


    }
}