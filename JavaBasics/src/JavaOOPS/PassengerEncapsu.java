package JavaOOPS;

public class PassengerEncapsu {

private long contact;
private String name;
private String email;
final String passportNo = "IAPK60056";


void setContact(long contact)
{
	this.contact=contact;
}
long getContact()
{
	return contact;
	
}

void setName(String name)
{
	this.name=name;
}

String getName()
{
	return name;
}

void setEmail(String email)
{
	this.email=email;
}
String getEmail()
{
	return email;
}

}
