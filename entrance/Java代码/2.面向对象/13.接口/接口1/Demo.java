interface Rub
{
	public void clean();
}

class Pencil 
{
	public void write()
	{
		System.out.println("ɳɳд��...");
	}
}

class PencilWithErase extends Pencil implements Rub
{
	public void clean()
	{
		System.out.println("��������");
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