package controller;
// Tạo class đại diện cho đối tượng database
public class UserEntity {
	private int id;
	private String email;
	private String username;
	private FullName fullName;
	private RoleEntity role;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	public void setFullName(String fullName) {
		if(fullName!=null &&fullName.trim().isEmpty()){
			String[]parts=fullName.trim().split("\\s+");
			String first=parts[0];
			String last="";
			if(parts.length>1){
				last=parts[parts.length-1];
			}
			this.fullName=new FullName(first,last);
		}else{
			this.fullName=new FullName("","");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RoleEntity getRole() {
		return role;
	}
	public void setRole(RoleEntity role) {
		this.role = role;
	}
	public class FullName{
		private String first;
		private String last;
		public FullName() {}
		public FullName(String first, String last) {
			this.first = first;
			this.last = last;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getLast() {
			return last;
		}
		public void setLast(String last) {
			this.last = last;
		}
		
	}
}
