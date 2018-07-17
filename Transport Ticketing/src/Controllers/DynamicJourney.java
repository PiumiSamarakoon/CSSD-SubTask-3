/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.JourneyList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author piumi
 */
public class DynamicJourney implements Serializable {
    
      private static final long serialVersionUID = 1L;
      
//    private static Account account;
    static int dynamicJourneyID;
    static String source;
    static String destination;
    static Date date;
    static String time;
    
     static int journeyCount = 0;

    
    

    public DynamicJourney(String source, String destination, Date date, String time) {
       // initialize variables
            this.source = source;
            this.destination = destination;
            this.date=date;
            this.time=time;
//            this.account=account;
            
            dynamicJourneyID=++journeyCount;
    }

    
      public static String getSource() {
		return source;
	}

    public void setSource(String source) {
		this.source = source;
	}
    
    public static String getDestination() {
		return destination;
	}

   
    public void setDestination(String destination) {
		this.destination = destination;
	}
        
    
    public static String getTime() {
		return time;
	}

    
    public void setTime(String time) {
		this.time = time;
	}
   
    public static Date getDate() {
		return date;
	}

    public void setDate(Date date) {
		DynamicJourney.date = date;
	}

  
    public void setJourneyCount(int JourneyCount) {
        DynamicJourney.journeyCount = JourneyCount;
    }
   
    public static int getJourneyCount() {
            return journeyCount;
    }
    
//     public String getAccountID() {
//      return account. accID;
//    }
//
//    public void setAccountID(Account account){
//            this.account = account;
//    }
    
           @Override
    public String toString() {
     
         return " Dynamic Journey ID: "+ dynamicJourneyID +" Source : "+source+" Destination : "+destination+" Date : "+date+"Time :"+
                 time;
     }
     
     private static class Serialization {
	
	public static void serializeObject(JourneyList<DynamicJourney> journeyList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("DynamicJourney.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(journeyList);
		oos.flush();
		oos.close();
	}
	
	public static JourneyList<DynamicJourney> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("DynamicJourney.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		JourneyList<DynamicJourney> journeyList = (JourneyList<DynamicJourney>)ois.readObject();
		ois.close();
		return journeyList;
	}

}          

     public static void main(String[] args) {
        
              
	JourneyList<DynamicJourney> journeyList = new JourneyList<DynamicJourney>();
		
		try {
			DynamicJourney.Serialization.serializeObject(journeyList);

			for (DynamicJourney journey : DynamicJourney.Serialization.deserializeObject()) {
				System.out.println(journey);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
		
 
    
}
