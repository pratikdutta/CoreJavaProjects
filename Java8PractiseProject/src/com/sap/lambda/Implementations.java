package com.sap.lambda;

public class Implementations {

	public static void main(String... strings) {

		/**
		 * SimplePlayable using Lambda Expressions
		 */
		new Concert().start(() -> System.out.println("In SimplePlayableClass"));

		/**
		 * SimplePlayable using Anonymous Inner Class
		 */
		new Concert().start(new SimplePlayable() {
			@Override
			public void play() {
				System.out.println("In SimplePlayableClass Using Anonymous Inner Class");
			}
		});

		/**
		 * ReturningPlayable using Lambda Expressions
		 */
		new Concert().start(() -> {
			return false;
		});

		/**
		 * SimplePlayable using Anonymous Inner Class
		 */
		new Concert().start(new ReturningPlayable() {

			@Override
			public boolean play() {
				return false;
			}
		});

		/**
		 * CustomPlayable using LambdaExpression
		 */
		new Concert().start(((number) -> {System.out.println("In CustomPlayable Class");}), 20);
	}
}
