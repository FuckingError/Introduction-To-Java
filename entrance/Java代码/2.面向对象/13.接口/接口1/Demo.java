interface Rub
{
	public void clean();
}

class Pencil 
{
	public void write()
	{
		System.out.println("É³É³Ð´×Ö...");
	}
}

class PencilWithErase extends Pencil implements Rub
{
	public void clean()
	{
		System.out.println("²Á£¡£¡£¡");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		PencilWithErase p = new PencilWithErase();
		p.write();
		p.clean();
	}
}