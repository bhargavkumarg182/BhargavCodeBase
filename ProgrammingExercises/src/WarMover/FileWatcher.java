/**
 * This code monitors file in a folder. If the file is updated, it moves to another folder.
 * Application: Move a war/jar file to the deployments folder automatically when it is updated.
 * 
 */

package WarMover;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
public class FileWatcher {

	public static void main(String[] args) throws InterruptedException {
		String dirPath="";
		String destPath="";
		System.out.println("Argument 1: location of out directory");
		System.out.println("Argument 2: location of deployment directory");
        if(args.length==0)   
            dirPath="YourSourcePath1";
        else
        	dirPath=args[0];
        
        if(args.length==0)   
   		    destPath="YourDestinationPath";
        else
        	destPath=args[1];
		
		File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
          System.out.println("no files in the directory");
	    }	
	    for(File file:files)
	    {
	    	if(file.getName().contains("test.war"))
	    	{
    			dirPath=dirPath+File.separator+"awc.war";

		    	long prev_lmod = new File(dirPath).lastModified();
                long lmod;
	    		while(true)
	    		{
	    			 lmod = new File(dirPath).lastModified();
	    			  if(lmod>prev_lmod)
	    			  {
	    				  moveWarFile(dirPath,destPath);
	    				  prev_lmod=lmod;
	    			  }
	    			Thread.sleep(5000);
	    		}	    		
	    	}
	    }
	    	    
	}

	private static void moveWarFile(String dirPath, String destPath) {

		try {
			FileUtils.copyFileToDirectory(new File(dirPath),new File(destPath));
			JOptionPane.showMessageDialog(null, " file is Updated. File"+ dirPath+" moved successfully");
			System.out.println(" file is Updated. File"+ dirPath+" moved successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} 	
	}
	 
}
