package logical;

import java.util.ArrayList;

public class sortImplementation {
	
	public static int generateRandom (int limit){
		return (int) (Math.random() * limit);
	};
	
	public static ArrayList<Integer> sortList(ArrayList<Integer> listOriginal){
		ArrayList<Integer> listSorted = new ArrayList<Integer>(listOriginal);
		for (int i = 0;i<listSorted.size();i++){
			for (int j = i+1;j<listSorted.size();j++){
				if (listSorted.get(i)>listSorted.get(j)){
					int temp = listSorted.get(i);
					listSorted.set(i, listSorted.get(j));
					listSorted.set(j, temp);
				}
			}
		}
		return listSorted;
		
		
	}

}
