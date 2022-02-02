public class Mesimdhenesi{
	 private String emri ;//readonly
	 private int vitilindjes ;
	 private String angazhimi;
	
	public Mesimdhenesi(String e , int vL , String a){
		emri = e ;
		vitilindjes = vL ;
		angazhimi = a ;
	}
	public String getEmri(){
		return emri ;
	}
	public int getVitiLindjes(){
		return vitilindjes ;
	}
	public void setVitiLindjes(int vL){
		vitilindjes = vL;
	}
	public String getAngazhimi(){
		return angazhimi;
	}
	public void setAngazhimi(String a){
		angazhimi = a ;
	}
	
	@Override // tregon qe metoda po mbishkruhet nga metoda e clases Object
	// toString() metoda ben reprezentimin e objektit ne String
	public String toString(){
		return emri + " : " + vitilindjes + " mban " + angazhimi ;
	}
	
	@Override // tregon qe metoda e Class - es Object po mbishkruhet nga origjinalja 
	//Metoda equals sherben per krahasimin e objekteve mes vete 
	//IMPLEMENTIMI ME OPERATOR TERNAR
	public boolean equals(Object obj){
		return obj instanceof Mesimdhenesi ? emri.equals(((Mesimdhenesi)obj).getEmri()) && vitilindjes == (((Mesimdhenesi)obj).getVitiLindjes()): false ;
	}
}