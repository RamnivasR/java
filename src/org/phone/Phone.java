package org.phone;

public class Phone {
         private void phoneInfo() {
			System.out.println("mobilrphone");
         }
		private void phoneInfo(int model,String name) {
			System.out.println("model:"+model+"\nName:name");
		}
		 private void phoneInfo(float confi) {
			System.out.println("confi:"+confi);
		 }
		 private void phoneInfo(String game,String missing) {
			System.out.println("game:"+game+"\nmissing:"+missing);
		 }
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo();
	p.phoneInfo(1111,"samsung");
	p.phoneInfo();
	p.phoneInfo("ram", "few days");
}
}