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
		 System.out.println(name+"ҧ��ˬ������");
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
		  System.out.println(name+"��!!!");
	 }
}
 
 class Demo
 {
	 public static void main(String[] args)
	 {
		 Dog dog = new Dog("��ˬ","��ɫ");
		 dog.bite();
		 System.out.println("��ˬ�ǹ���"+(dog instanceof Dog));
         Animals person = new Animals("�ܽ���","��ɫ");
		 System.out.println("��ˬ������"+(dog instanceof Mouse));
	 }
 }