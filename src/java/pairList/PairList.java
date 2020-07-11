package pairList;

import pair.Pair;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class PairList {
	static ArrayList<Pair<String, Integer>> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add(Pair.creatorOfPairs("aaaaa", 1));
		list.add(Pair.creatorOfPairs("aaaaa", 1));
		list.add(Pair.creatorOfPairs("b", 2));
		list.add(Pair.creatorOfPairs("csfzvfdr", 3));
		list.add(Pair.creatorOfPairs("csfkgl_hjfdr", 3));
		list.add(Pair.creatorOfPairs("csfzvfdr", 3));
		list.add(Pair.creatorOfPairs("d", 4));
		list.add(Pair.creatorOfPairs("d", 4));
		list.add(Pair.creatorOfPairs("i", 5));

		//test 1
		if (sum(list) == 26) {
			System.out.println("test 1 - true");
		}
		//test2
		if (quantityLess4(list) == 4) {
			System.out.println("test 2 -true");
		}
		//test3
		List<Pair<String, Integer>> testList = new ArrayList<>();
		testList.add(Pair.creatorOfPairs("aaaaa", 1));
		testList.add(Pair.creatorOfPairs("csfzvfdr", 3));
		testList.add(Pair.creatorOfPairs("d", 4));
		List<Pair<String, Integer>> pairList = collectionDubbing(list);
		if (pairList.containsAll(testList) && pairList.size() == testList.size()) {
			System.out.println("test 3 - true");
		}
	}

	public static int sum(List<Pair<String, Integer>> list) {
//		Stream<pair<String, Integer>> s = list.stream();
//		int sum = s.flatMapToInt()map(p->p.getVal1()).
//		int sum = list.stream().mapToInt(p -> p.getVal2()).sum();
//		int sum = list.stream().mapToInt(pair::getVal2).sum();
		int sum = list.stream().mapToInt(new ToIntFunction<Pair<String, Integer>>() {
			@Override
			public int applyAsInt(Pair<String, Integer> value) {
				return value.getVal2();
			}
		}).sum();
		return sum;
	}

	public static long quantityLess4(List<Pair<String, Integer>> list) {
//		long quantity =  list.stream().filter(s->s.getVal1().length()<4).count();
		long quantity = list.stream().filter(new Predicate<Pair<String, Integer>>() {
			@Override
			public boolean test(Pair<String, Integer> stringIntegerPair) {
				return stringIntegerPair.getVal1().length() < 4;
			}
		}).count();

		return quantity;
	}

	public static List<Pair<String, Integer>> collectionDubbing(List<Pair<String, Integer>> list) {
//		List collection = list.stream().
//				filter(e-> Collections.frequency(list,e)>1).
//				distinct().
//				collect(Collectors.toList());

		Map<Pair<String, Integer>, Integer> collection = list.stream().
				collect(Collectors.toMap(
						i -> i,
						i -> 1,
						(a, b) -> a + b));

//		return collection.entrySet().stream().
//				filter(num-> num.getValue() > 1).
//				map(pair-> pair.getKey()).
//				collect(Collectors.toList());

//		return collection.entrySet().stream().
//				filter(num-> num.getValue() > 1).
//				map(Map.Entry::getKey).
//				collect(Collectors.toList());

		return collection.entrySet().stream().
				filter(new Predicate<Map.Entry<Pair<String, Integer>, Integer>>() {
					@Override
					public boolean test(Map.Entry<Pair<String, Integer>, Integer> pairIntegerEntry) {
						return pairIntegerEntry.getValue() > 1;
					}
				}).
				map(new Function<Map.Entry<Pair<String, Integer>, Integer>, Pair<String, Integer>>() {

					@Override
					public Pair<String, Integer> apply(Map.Entry<Pair<String, Integer>, Integer> pairIntegerEntry) {
						return pairIntegerEntry.getKey();
					}
				}).
				collect(Collectors.toList());
	}


}
