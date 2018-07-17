/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CardList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class Card implements Serializable {
    
    
   private static final long serialVersionUID = 1L;
    
    //declare variables
   String cardNumber;
   String pin;
   String cardHoldersName;
   String expiryDate;

    /**
     *
     * @param cardNumber
     * @param pin
     * @param cardHoldersName
     * @param expiryDate
     */
   //constructor
    public Card(String cardNumber,String pin,String cardHoldersName,String expiryDate) {
        
        //initialize variables
        this.cardNumber=cardNumber;
        this.pin=pin;
        this.cardHoldersName=cardHoldersName;
        this.expiryDate=expiryDate;
         
    }
   
    /**
     *
     * @return card number
     */
    public String getCardNumber() {
		return cardNumber;
	}

    /**
     *
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
        
    /**
     *
     * @return pin
     */
    public String getpin() {
		return pin;
	}

    /**
     *
     * @param pin
     */
    public void setpin(String pin) {
		this.pin = pin;
	}
        
    /**
     *
     * @return card holders name
     */
    public String getcardHoldersName() {
		return cardHoldersName;
	}

    /**
     *
     * @param cardHoldersName
     */
    public void setcardHoldersName(String cardHoldersName) {
		this.cardHoldersName = cardHoldersName;
	}
        
    /**
     *
     * @return expire date
     */
    public String getExpiryDate() {
		return expiryDate;
	}

    /**
     *
     * @param ExpiryDate
     */
    public void setExpiryDate(String ExpiryDate) {
		this.expiryDate = expiryDate;
	}
       
     @Override
    public String toString() {
     
         return "Card Number : "+ cardNumber +" PIN : "+pin+" Expiry Date : "+expiryDate+" Card Holder : "+cardHoldersName;
     }
     
     private static class Serialization {
	
        // serialization code
         
	public static void serializeObject(CardList<Card> cardList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Card.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cardList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static CardList<Card> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Card.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		CardList<Card> cardList = (CardList<Card>)ois.readObject();
		ois.close();
		return cardList;
	}

}          

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
            Card c1 = new Card("111111111","111","Piumi","1-8-2018") ;
//            Card c2 = new Card("222222222","222","Kate","6-5-2020") ;
//            Card c3 = new Card("333333333","333","Paul","2-9-2019") ;
      
	CardList<Card> cardList = new CardList<Card>();
		cardList.add(c1);
//		cardList.add(c2);
//		cardList.add(c3);
         

		try {
			Card.Serialization.serializeObject(cardList);

			for (Card cost : Card.Serialization.deserializeObject()) {
				System.out.println(cost);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
		
 
 
 
}
