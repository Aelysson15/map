package antes;

import java.lang.reflect.Type;

public class Giant
{
	public enum Type
	{
		Fee,
		Phi,
		Pheaux;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Type forValue(int value)
		{
			return values()[value];
		}
	}
	public Giant()
	{
		m_id = s_next++;
	
	}
	public final Type get_type()
	{
		return m_type;
	}
	public final void fee()
	{
		System.out.print(m_id);
		System.out.print("-fee  ");
	}
	public final void phi()
	{
		System.out.print(m_id);
		System.out.print("-phi  ");
	}
	public final void pheaux()
	{
		System.out.print(m_id);
		System.out.print("-pheaux  ");
	}

	private int m_id;
	private static int s_next = 0;
}
