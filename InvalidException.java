package HITdayPrograms;


	public class InvalidCardException extends ExceptionDemo3{
		String msg;
		public InvalidCardException(String msg) {
			this.msg=msg;
		}
		
		@Override
		public String toString() {
			return "Exception is..:"+msg;
		}
	}

