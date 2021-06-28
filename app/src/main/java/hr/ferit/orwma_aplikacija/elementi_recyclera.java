package hr.ferit.orwma_aplikacija;

public class elementi_recyclera {
    int image;
    String ime_drzave;

    public elementi_recyclera(int image, String ime_drzave) {
        this.image = image;
        this.ime_drzave = ime_drzave;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getIme_drzave() {
        return ime_drzave;
    }

    public void setIme_drzave(String ime_drzave) {
        this.ime_drzave = ime_drzave;
    }
}
