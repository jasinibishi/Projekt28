class glavna{
	public static void main(String[]args) {
		Kuce reks= new Kuce(); // kreiraj objekt
		reks.osobina(); // povik na metodot osobina od podklasata Kuce
		LoveckoKuce lovec = new LoveckoKuce();// kreiraj objekt lovec
		lovec.osobina();// povik na metodot osobina od podklasata LoveckoKuce
	}
}