package cn.itcast.genrictiry;
/*���ͽӿ�
 * 1.�ӿ����Զ���ķ��͵ľ���������������ʵ��һ���ӿڵ� ʱ��ָ����
 * 2.���û��ָ����Ĭ��ΪObject����
 * 3.��Ҫ�ӳ�ָ�����ͣ�����
 * */
interface Dao<T>{
	public void add(T t);
}
//�����ڵȴ������ӿ�ʵ��������ʱ��,ָ�����͵ľ�����������
public class Demo3<T> implements Dao<T>{
	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3<String> d = new Demo3<String>();
		d.add("ty");
		}

	}

