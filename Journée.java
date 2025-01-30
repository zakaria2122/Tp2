class Journée {
    Style style_matin;
    Style style_après_midi;
    Style style_soirée;
    
    public Journée(Style matin, Style après_midi, Style soirée) {
	this.style_matin = matin;
	this.style_après_midi = après_midi;
	this.style_soirée = soirée;
    }

    public Style get_matin() {
	return this.style_matin;
    }
    
    public Style get_après_midi() {
	return this.style_après_midi;
    }
    
    public Style get_soirée() {
	return this.style_soirée;
    }
}
