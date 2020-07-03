package CollectionSheep;

import Sheep.*;

import java.io.*;
import java.util.*;

public class CollectionCheep {
	static Sheep sheep1 = new Sheep("a", "black");
	static Sheep sheep2 = new Sheep("b", "black");
	static Sheep sheep3 = new Sheep("c", "black");
	static Sheep sheep4 = new Sheep("d", "black");
	static Sheep sheep5 = new Sheep("i", "black");
	static File file = new File("C:\\Users\\stalnoy\\Desktop\\sheepCollection.txt");

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Sheep> arrayList = new ArrayList();
		listSheep(arrayList);
		Set set = setSheep(arrayList);
		Map map = mapSheep(arrayList);
//test1 arrayList
		if (arrayList.size() == 10){
			System.out.println("test1 - true");
		}
//test2 hashSet
		if(set.containsAll(arrayList) && set.size() == 5){
			System.out.println("test2 - true");
		}
//test3 hashMap
		if(map.get(sheep1).equals(3) &&
		map.get(sheep2).equals(1) &&
		map.get(sheep3).equals(1) &&
		map.get(sheep4).equals(1) &&
		map.get(sheep5).equals(4)){
			System.out.println("test3 - true");
		}
	}

	static void listSheep(List arrayList) throws IOException, ClassNotFoundException {
		StorageSheep.saving(sheep1, file);
		arrayList.add(sheep1);
		arrayList.add(StorageSheep.receiving(file));
		arrayList.add(StorageSheep.receiving(file));
		arrayList.add(sheep2);
		arrayList.add(sheep3);
		arrayList.add(sheep4);
		arrayList.add(sheep5);
		StorageSheep.saving(sheep5, file);
		arrayList.add(StorageSheep.receiving(file));
		arrayList.add(StorageSheep.receiving(file));
		arrayList.add(StorageSheep.receiving(file));

	}

	static Set setSheep(List arrayList) {
		Set<Sheep> hashSet = new HashSet(arrayList);
//		Iterator<Sheep> itr = hashSet.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next().toString());
//		}
		return hashSet;
	}

	static Map mapSheep(List list) {
		Map<Sheep, Integer> hashMap = new HashMap<Sheep, Integer>();
		hashMap.put(sheep1, Collections.frequency(list, sheep1));
		hashMap.put(sheep2, Collections.frequency(list, sheep2));
		hashMap.put(sheep3, Collections.frequency(list, sheep3));
		hashMap.put(sheep4, Collections.frequency(list, sheep4));
		hashMap.put(sheep5, Collections.frequency(list, sheep5));
		return hashMap;
	}
}
