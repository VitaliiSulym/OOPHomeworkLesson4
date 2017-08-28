

public class BusyGroupPlaceException extends Exception {

	@Override
	public String getMessage() {

		return "This place is already busy,sorry";
	}

}
