package code._13;

public class DatabaseException extends Exception{
/*
 * String.format();
 */
	private static final long serialVersionUID = 1L;
	public DatabaseException(int transactionID, int queryID, 
			String message){
		super(String.format("(t%d q%d) %s", transactionID, queryID, 
				message));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new DatabaseException( 5,  2, 
					"Write Fail!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
