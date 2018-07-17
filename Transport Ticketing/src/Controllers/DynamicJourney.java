/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.JourneyList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;


public class DynamicJourney implements Serializable {

    private static final long serialVersionUID = 1L;

     //declare variables
    int DynamicId;
    public String source;
    public String destination;
    public String date;
    public String time;

    
    private static int journeycount = 0;
    
    //constructor
    public DynamicJourney(String source, String destination, String date, String time) {
        
        //initialize variables
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.time = time;
        DynamicId=++journeycount;
        
        
    }

    
    
    public DynamicJourney() {
        throw new UnsupportedOperationException(); }

    
    /**
     *
     * @return DynamicId
     */
    public int getDynamicId() {
        return DynamicId;
    }
    
    /**
     *
     * @param DynamicId
     */
    public void setDynamicId(int DynamicId){
            this.DynamicId = DynamicId ;
    }
    
    
    /**
     *
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     */
    public void settime(String time){
            this.time = time ;
    }
    
    
    /**
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

   /**
     *
     * @param destination
     */
    public void destination(String destination){
            this.destination = destination ;
    }
     
    /**
     *
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    
    
    /**
     *
     * @return source
     */
    public String getSource() {
        return source;
    }

    @Override
    public String toString() {

        return "dynamicid " + DynamicId + "\nsource " + source + "\ndestination " + destination + "\ndate " + date
                + "\ntime " + time;
    }

    
       private static class Serialization {
	
        //serialization code
	public static void serialize(JourneyList<DynamicJourney> JourneyList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("journey.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(JourneyList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static JourneyList<DynamicJourney> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("journey.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		JourneyList<DynamicJourney> JourneyList = (JourneyList<DynamicJourney>)ois.readObject();
		ois.close();
		return JourneyList;
	}
       }
       
public static void main(String[] args) {
        
            
           
             
	JourneyList<DynamicJourney> journeylist = JourneyList.getInstance();
		
		try {
			DynamicJourney.Serialization.serialize(journeylist);

			for (DynamicJourney cost : DynamicJourney.Serialization.deserializeObject()) {
				System.out.println(cost);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

}
}


     
