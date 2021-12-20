public class Bucket{
	private String data;
	private int counter;
	private int value;

	public Bucket(String data, int counter, int value){
		this.data = data;
		this.counter = counter;
		this.value = value;
	}

	public String getData(){
		return data;
	}
	public int getCounter(){
		return counter;
	}
	public int getValue(){
		return value;
	}
	public void setData(String data){
		this.data = data;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
	public void setValue(int value){
		this.value = value;
	}

	@Override
	public String toString(){
		return "Bucket [data = "+data+",counter = "+counter+",value = "+value+"]";
	}
}
