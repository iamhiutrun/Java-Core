
public enum XepLoai {
	Gioi("Giỏi"),
	Kha("Khá"),
	TrungBinh("Trung Bình"),
	Yeu("Yếu");
	
	private String tiengviet;

	private XepLoai(String tiengviet) {
		this.tiengviet = tiengviet;
	}
	public String Description() {
		return this.tiengviet;
	}

}
