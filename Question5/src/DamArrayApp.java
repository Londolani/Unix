import java.util.*;
import java.util.Scanner;
import java.io.*;

public class DamArrayApp
{
	static String[] data  = new String[211];
	

	public static void main(String[] args)
	{
		try
		{
			int i =0;
			FileInputStream fis=new FileInputStream("Dam_Levels_Individual_Nov2015-Mar2016.csv");       
			Scanner sc=new Scanner(fis); 
			while(sc.hasNextLine())  
			{  
				data[i++] = sc.nextLine(); 
			}  
			sc.close();  
		}  

	   	catch(Exception e){System.out.println("File not found");}
		if(args.length == 0)
	    {
			printAllDams(); 
	    } else if(args.length == 3)
     	{
    		printDam(args[0],args[1],args[2]);
     	}
	}


	public static void printDam(String damName,String fsc,String damLevel)
	{
	 	String user = damName+"_"+fsc+"_"+damLevel;
	 	for (int j=0;j<211;j++)
	 	{
	 		String line = data[j];
	 		int indexer = line.indexOf(" ");
	 		String subString = line.substring(0,indexer);
	 		
	 		if(subString.equals(user))
	 		{			
	 			System.out.println("damName:"+damName+" fsc: "+fsc+" damLevel:"+damLevel+ " AreasAffected:" +line.substring(indexer));
			}
	 	}
	}

	
	public static void printAllDams()
	{
	 	for(int z=0;z<211;z++)
		{
			System.out.println(data[z]);
		}	
	} 
}
