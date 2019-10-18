package com.virtusa.entities;

public class Rooms {

	private int floorNo;
	private String roomType;
	private int roomNo;
	private int roomCapacity;
	
	public Rooms() {}
	

	
	public int getRoomCapacity() {
		return roomCapacity;
	}



	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}



	public int getRoomNo() {
		return roomNo;
	}



	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}



	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Rooms [floorNo=" + floorNo + ", roomType=" + roomType + ", roomNo=" + roomNo + ", roomCapacity="
				+ roomCapacity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floorNo;
		result = prime * result + roomCapacity;
		result = prime * result + roomNo;
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
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
		Rooms other = (Rooms) obj;
		if (floorNo != other.floorNo)
			return false;
		if (roomCapacity != other.roomCapacity)
			return false;
		if (roomNo != other.roomNo)
			return false;
		if (roomType == null) {
			if (other.roomType != null)
				return false;
		} else if (!roomType.equals(other.roomType))
			return false;
		return true;
	}
	
	
	
	
}
