package innerclass;


public class HelloWorldAnonymousClass {

	interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
	
	ImplementingInterface impl = new ImplementingInterface(){

		InnerImpl impl123 = new InnerImpl() {
			
			@Override
			public void jackJagoda() {
				// TODO Auto-generated method stub
				
			}
		};
		@Override
		public void print(String str) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void getSomething(int s) {
			// TODO Auto-generated method stub
			
		}
		
	};
}
