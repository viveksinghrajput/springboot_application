package com.serializable;

import java.io.Serializable;

public class Dog implements Serializable {

	private static final Long serialVersionUID = 1L;

	int x = 10;
	int y = 20;

	transient int i = 30;
	int j = 40;

	transient static int a = 50;
	transient int b = 60;

	transient int c = 70;
	transient final int d = 80;

	transient final int e = 90;
	transient final int f = 100;
}
