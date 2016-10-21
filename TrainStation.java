
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
	private TicketMachine maquina1;
	private TicketMachine maquina2;
	private int totalDinero;

	public TrainStation()
	{
		maquina1 = new TicketMachine(300);
		maquina2 = new TicketMachine(200);
		totalDinero = 0;
    }
  
        public void imprimirTotalDinero()
	{
		totalDinero = maquina1.conseguirTotal();
		totalDinero = totalDinero + maquina2.conseguirTotal();
                System.out.println(totalDinero);
	}
}
