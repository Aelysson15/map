package antes;

import java.util.LinkedList;

public class Main {
	 LinkedList que = new LinkedList();
	  Giant[] input = antes.Type;


	  for (int i = 0; i < 6; i++)
	  {
		que.enque(input[i]);
	  }

	  for (int i = 0; i < 6; i++)
	  {
		bad_guy = que.deque();
		if (bad_guy.get_type() == Giant.Fee)
		{
		  bad_guy.fee();
		}
		else if (bad_guy.get_type() == Giant.Phi)
		{
		  bad_guy.phi();
		}
		else if (bad_guy.get_type() == Giant.Pheaux)
		{
		  bad_guy.pheaux();
		}
	  }
	  System.out.print('\n');
}
