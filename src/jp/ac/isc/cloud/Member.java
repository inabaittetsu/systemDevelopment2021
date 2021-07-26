package jp.ac.isc.cloud;

public class Member {
	private String id;
	private String name;
	private String picture;


	//コンストラクタ
	public Member(String id,String name,String picture) {
		this.id = id;
		this.name = name;
		this.picture = picture;
	}

	//idを返す
	public String getId() {
		return id;
	}

	//idをセットする
	public void setId(String id) {
		this.id = id;
	}


	//名前を返す
	public String getName() {
		return name;
	}

	//名前をセットする
	public void setName(String name) {
		this.name = name;
	}


	//写真を返す
	public String getPicture() {
		return picture;
	}

	//写真をセットする
	public void setPicture(String picture) {
		this.picture = picture;
	}

}
