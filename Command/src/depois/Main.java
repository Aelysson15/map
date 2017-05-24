package depois;

import java.util.*;

public class Main{
	Queue q = new Queue();
  Command[] input =
  {
	  new Command(new Giant(), Giant.fee),
	  new Command(new Giant(), Giant.phi),
	  new Command(new Giant(), Giant.pheaux),
	  new Command(new Giant(), Giant.fee),
	  new Command(new Giant(), Giant.phi),
	  new Command(new Giant(), Giant.pheaux)
  }

  for (int i = 0; i < 6; i++)
  {
	q.enque(input[i]);
  }

  for (int i = 0; i < 6; i++)
  {
	q.deque().execute();
  }
  System.out.print('\n');
}
