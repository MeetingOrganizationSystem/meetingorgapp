package com.virtusa.entities;

public class Organizer {
	
		
		private String userName;
		private String password;
		
		
		public Organizer() {}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Organizer [userName=" + userName + ", password=" + password + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Organizer other = (Organizer) obj;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			return true;
		}

}
