 class Animals
 {
	 String name;
	 String color;
	 public Animals(String name,String color)
	 {
          this.name = name;
		  this.color = color;
	 }
 }

 class Dog extends Animals
 {
	 public Dog(String name,String color)
	 {
		 super(name,color);
	 }

	 public void bite()
	 {
		 System.out.println(name+"Ò§ºÂË¬£¡£¡£¡");
	 }
 }

 class Mouse extends Animals
 {
	 public Mouse(String name,String color)
	 {
		 super(name,color);
	  }
  
      public void dig()
	 {
		  System.out.println(name+"´ò¶´!!!");
	 }
}
 
 class Demo
 {
	 public static void main(String[] args)
	 {
		 Dog dog = new Dog("ºÂË¬","ºÚÉ«");
		 dog.bite();
		 System.out.println("ºÂË¬ÊÇ¹·Âð£¿"+(dog instanceof Dog));
         Animals person = new Animals("ÖÜ½ÜÂ×","»ÆÉ«");
		 System.out.println("ºÂË¬ÊÇÈËÂð£¿"+(dog instanceof Mouse));
	 }
 }