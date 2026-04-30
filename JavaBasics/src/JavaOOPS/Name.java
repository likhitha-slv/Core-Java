package JavaOOPS;

public class Name {
private String name;
private String id;
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}


public Name(String name,String id )
{
	this.name=name;
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = "MS.Nithi" +name;
}


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = "JFS-B70" +id;
}



}
