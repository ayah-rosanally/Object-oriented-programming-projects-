
public class Creation {
	//Class pour créer ajouter un pizza au arraylist
	String type;
	int num;
	int gar;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getGar() {
		return gar;
	}
	public void setGar(int gar) {
		this.gar = gar;
	}
	
	public Creation(String type, int num, int gar){
		this.type = type;
		this.num = num;
		this.gar = gar;
	}
	
}
