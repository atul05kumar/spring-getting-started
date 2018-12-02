package com.atul.spring;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String [] fortunes = {"You will get a prize today!", "You will know the scerets of Spring", "You will meet you best friend today"};
		int min = 0, max = 3;
		return fortunes[ThreadLocalRandom.current().nextInt(min, max)];
	}

}
