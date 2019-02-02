package practice;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Last5Files_Minimum {
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(
			final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};
		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public static void main(String[] args) throws IOException {
		File folder = new File("C:\\Users\\mmurali9\\Downloads\\Desktop_Murali\\mani\\New_Requirement\\New_Requirement_Input\\Input\\NSE_Input");
		
		//File folder = new File("C:/Users/mmurali9/Desktop/mani/New_Requirement/Negetive_Sample_Input");
	
		File[] listOfFiles = folder.listFiles();
		Map<String, Map<String, Float>> mapOfCompanyNames = new LinkedHashMap<String, Map<String, Float>>();
		String name=null;
		//System.out.println(listOfFiles.length);
		/*int sum=listOfFiles.length;
		sum=sum+39;
		for (int i = 40; i <= sum; i++)*/
		
		for (int i = 1; i <= listOfFiles.length; i++) {
			//if (file.isFile() && file.getName().endsWith(".txt")) {
			//System.out.println("i value:"+i);
			
			String path="C:\\Users\\mmurali9\\Downloads\\Desktop_Murali\\mani\\New_Requirement\\New_Requirement_Input\\Input\\NSE_Input\\"+"Input"+Integer.toString(i)+".txt";
			
			//String path="C:/Users/mmurali9/Desktop/mani/New_Requirement/Negetive_Sample_Input/"+"Input"+Integer.toString(i)+".txt";
			
			File file = new File(path);
					
				FileReader fileReader = new FileReader(file);

				BufferedReader bufferedReader = new BufferedReader(fileReader);

				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					 //System.out.println(line);
					String[] splitLine = line.split("~");
					if (mapOfCompanyNames.containsKey(splitLine[0]))
						{mapOfCompanyNames.get(splitLine[0]).put(file.getName(),
								Float.parseFloat(splitLine[1]));
						
						
						
						}
					else {
						mapOfCompanyNames.put(splitLine[0],
								new LinkedHashMap<String, Float>());
						mapOfCompanyNames.get(splitLine[0]).put(file.getName(),
								Float.parseFloat(splitLine[1]));
					}

				}
              
						
			if(i==listOfFiles.length-4)
			{
		    name=file.getName();
			}
         
		}
		 
		for (Entry<String, Map<String, Float>> entry : mapOfCompanyNames.entrySet()) {
			String compName = entry.getKey();
			Map<String, Float> unSortedMap = new LinkedHashMap<String, Float>();
			Map<String, Float> SortedMap = new LinkedHashMap<String, Float>();

			unSortedMap = entry.getValue();

			SortedMap = sortByValues(unSortedMap);
			Entry<String, Float> entry2 = SortedMap.entrySet().iterator()
					.next();
			String fileName = entry2.getKey();
			Float price = entry2.getValue();
           
			/*if (fileName.equals(name))
				System.out.println("Maximum~" + compName + "~" + "Price"
						+ "~" + price + "~" + "File name~" + fileName);*/

			Entry<String, Float> min = null;
			for (Entry<String, Float> entry3 : SortedMap.entrySet()) {
				if (min == null || min.getValue() > entry3.getValue()) {
					min = entry3;
				}
			}
        fileName=min.getKey();
        /*System.out.println("***************************");
        System.out.println(listOfFiles.length);
        System.out.println("*************************");*/
			if (fileName.equals(name) && min.getValue() > 10)
				//System.out.println("Minimum~" + compName + "~" + "Price: "
						//+ min.getValue() + "File Name: " + min.getKey());
			System.out.println(compName);

		}

	}
}

