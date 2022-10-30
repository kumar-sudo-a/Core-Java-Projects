package com.oops;

public class IneritancePolymorphismAndOverriding {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.sound();
		
		Dog d = new Dog();
		d.sound(); //calling inherited overridden method
		
		Cat c = new Cat();
		c.sound(); //calling overridden method
	}
}

class Animal {
	public void sound() {
		System.out.println("All animals make different sounds");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dog says bow bow");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat says meow meow");
	}
}
