package CollectionSheep;

import Sheep.*;

import java.io.*;
import java.util.*;

public class CollectionCheep {
	static Sheep sheep1 = new Sheep("a", "black", new Wool("curly"));
	static Sheep sheep2 = new Sheep("b", "black", new Wool("curly"));
	static Sheep sheep3 = new Sheep("c", "black", new Wool("curly"));
	static Sheep sheep4 = new Sheep("d", "black", new Wool("curly"));
	static Sheep sheep5 = new Sheep("i", "black", new Wool("smooth"));


	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		List<Sheep> arrayList = new ArrayList();
		listSheep(arrayList);
		Set set = setSheep(arrayList);
		Map map = mapSheep(arrayList);
//test1 arrayList
		if (arrayList.size() == 10) {
			System.out.println("test1 - true");
		}
//test2 hashSet
		if (set.containsAll(arrayList) && set.size() == 5) {
			System.out.println("test2 - true");
		}
//test3 hashMap
		if (map.get(sheep1).equals(3) &&
				map.get(sheep2).equals(1) &&
				map.get(sheep3).equals(1) &&
				map.get(sheep4).equals(1) &&
				map.get(sheep5).equals(4)) {
			System.out.println("test3 - true");
		}
	}

	static void listSheep(List arrayList) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		arrayList.add(sheep1);
		arrayList.add(sheep1.clone());
		arrayList.add(sheep1.cloneDeep());
		arrayList.add(sheep2);
		arrayList.add(sheep3);
		arrayList.add(sheep4);
		arrayList.add(sheep5);
		arrayList.add(sheep5.clone());
		arrayList.add(sheep5.clone());
		arrayList.add(sheep5.cloneDeep());


	}

	static Set setSheep(List arrayList) {
		Set<Sheep> hashSet = new HashSet(arrayList);
		Iterator<Sheep> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		return hashSet;
	}

	static Map mapSheep(List list) {

		Sheep sheep;
		Map<Sheep, Integer> hashMap = new HashMap<Sheep, Integer>();
		for (int i = 0; i < list.size(); i++) {
			sheep = (Sheep) list.get(i);
			if (hashMap.containsKey(sheep)) {
				hashMap.replace(sheep, hashMap.get(sheep) + 1);
			}else {
				hashMap.put(sheep, 1);
			}
		}
		System.out.println(hashMap);
		return hashMap;
	}
}
