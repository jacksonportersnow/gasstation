package Pump;

/**
 * 
 * @author tymcb
 *
 */
public class PumpThread extends Thread{

	//Variables
	private String type;
	private long amount;
	private boolean open;
	
	/**
	 * 
	 * @param obj
	 * @param name
	 */
	public PumpThread(PumpKiosk obj, String name) {
		super(obj, name);
		open = true;
	}
	
	/**
	 * 
	 * @param gasType
	 * @param gasAmount
	 * @throws Exception
	 */
	public void newCustomer(String gasType,long gasAmount) throws Exception {
		if(gasAmount > 0)
			throw new Exception("Cannot recieve negative amount of gas.");
		
		type = gasType;
		amount = gasAmount;
	}
	
	/**
	 * 
	 * @param gasType
	 */
	public void setGasType(String gasType) {
		type = gasType;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getGasType() {
		return type;
	}
	
	/**
	 * 
	 * @param gasAmount
	 * @throws Exception
	 */
	public void setAmount(long gasAmount) throws Exception{
		if(gasAmount > 0)
			throw new Exception("Cannot recieve negative amount of gas.");
		
		amount = gasAmount;
	}
	
	/**
	 * 
	 * @return
	 */
	public long getAmount() {
		return amount;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isOpen() {
		return open;
	}
	
	/**
	 * 
	 */
	public void setBusy() {
		open = false;
	}
	
	/**
	 * 
	 */
	public void setOpen() {
		open = true;
	}
	
	
}