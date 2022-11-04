package Item;

public class CD extends Midia {

	private int faixa;
	private String artista;
	private String album;
	
	public CD () {
		
	}
	
	
	public CD(int faixa, String artista, String album) {
		setArtista(artista);
		setAlbum(album);
		setFaixa(faixa);
	}


	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		if(faixa>0)
			this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if(artista.length()>0)
			this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		if (album.length()>0)
			this.album = album;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD Faixas=");
		builder.append(faixa);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
	
}
