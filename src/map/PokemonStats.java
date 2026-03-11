package map;

public class PokemonStats {
	private StarterPokemon sp;
	public double Hp, Def, Att;
	public static int level =5;
	public int moveSet =0;
	public String pmove1, pmove2, pmove3, pmove4;
	
	public PokemonStats(StarterPokemon sp) {
		this.sp = sp;
		checkPokemon();
	}
	public void checkPokemon() {
		if(sp.charmander ==true) {
			System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Hp = 20 +(1.2*level);
			Def = 20 +(1.2*level);
			Att = 25 +(1.5*level);
			pmove1 = "Ember";
			pmove2 = "Scratch";
			pmove3 = "Smoke Screen";
			pmove4 = "Scary Face";
			System.out.println(Hp +" "+ Def +" "+ Att +" "+ pmove1 + pmove2 + pmove3 + pmove4+" "+ level);

		}else if(sp.squirtle == true) {
			Hp = 20 +(1.2*level);
			Def = 25 +(1.5*level);
			Att = 20 +(1.2*level);
			pmove1 = "Water Gun";
			pmove2 = "Tackle";
			pmove3 = "Rain Dance";
			pmove4 = "Iron Defense";
		}else if(sp.bulbasaur == true){
			Hp = 25 +(1.5*level);
			Def = 20 +(1.2*level);
			Att = 20 +(1.2*level);
			pmove1 = "Vine Whip";
			pmove2 = "Tackle";
			pmove3 = "Growl";
			pmove4 = "Leech Seed";
		}
	}
}
