package watches;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column
@NotEmpty(message="enter the id")
private String name;
@Column
@Email(message="enter the name")
private String email;
@Column
@NotEmpty(message="enter the email")
private String addr;
@Column
@NotEmpty(message="enter the addr")
private long pno;
@Column

@NotEmpty(message="enter the pno")
private String pwsd;
@Column
@NotEmpty(message="enter the pwsd")
private boolean enabled;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public long getPno() {
	return pno;
}
public String getPwsd() {
	return pwsd;
}
public void setPwsd(String pwsd) {
	this.pwsd = pwsd;
}
public void setPno(long pno) {
	this.pno = pno;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}


}
