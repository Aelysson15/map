package antes;

public class Queue {

	public static Queue()
	{
		m_add = m_remove = 0;
	}
	public static final void enque(T c)
	{
		m_array[m_add] = c;
		m_add = (m_add + 1) % AnonymousEnum.SIZE;
	}
	public static final T deque()
	{
		int temp = m_remove;
		m_remove = (m_remove + 1) % AnonymousEnum.SIZE;
		return m_array[temp];
	}
	public static T[] m_array;
	public static int m_add;
	public static int m_remove;

}
