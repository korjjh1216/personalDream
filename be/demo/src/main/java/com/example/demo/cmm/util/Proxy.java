 package com.example.demo.cmm.util;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;

import com.example.demo.uss.domain.User;

@Component
public class Proxy {
	public static Consumer<String> print = System.out::print;
	public  Function<Object, String> intToString = String::valueOf;
	public  Function<String, Integer> strToInt = Integer::parseInt; 
	
	public Function<Double,Double> doubleabs = Math :: abs;
	public Function<Float,Float> floatabs = Math :: abs;
	public Function<Integer, Integer> intabs = Math :: abs;
	public Function<Long, Long> longabs = Math :: abs;
	
	public Function<Double, Double> doubleceil = Math :: ceil;
	public Function<Double, Double> doublefloor = Math :: floor;
	
	public static BiFunction<Double,Double, Double> doublemax = Math :: max;
	public static BiFunction<Double,Double, Double> doublemin = Math :: min;
	
	public static Supplier<Double> Rand = Math :: random;
	public static BiFunction<Integer,Integer,Integer> rangeRandom = (t,u) -> ((int)(Math.random()*(u-t))+t);
			
	public Function<Double, Double> rint = Math :: rint;
	public Function<Double, Long> round = Math :: round;
	
	public Supplier<User> newUser = User :: new;
}
