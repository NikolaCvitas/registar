package hr.nikola.registar.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	
    public User() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;

	@Column(name="status")
    private String status;
    
    @Column(name="role_id", insertable = false, updatable = false)
    private int roleId;
    
    @Column(name="company_id", insertable = false, updatable = false)
    private int companyId;
    
    @Column(name="type_id", insertable = false, updatable = false)
    private int typeId;
    
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Role role;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="company_id")
    private Company company;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="type_id")
    private UserType usertype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	
	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", status='" + status + '\'' +
				", roleId=" + roleId +
				", companyId=" + companyId +
				", typeId=" + typeId +
				", role=" + role +
				", company=" + company +
				", usertype=" + usertype +
				'}';
	}
}
