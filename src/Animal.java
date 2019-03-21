public abstract class Animal {
	protected Panda pulled;
	protected Tile tile;
	
	public void Fall() {
		Destroy();
	}
	public void Destroy(){
		tile.RemoveAnimal(this);
		Game.getInstance().DeleteAnimal(this);
		if (pulled!=null) {
			Disband();
		}
	}
	public void Move(int side){
		
	}
	public boolean CollideWithPanda(Panda p){return false;}
	public boolean CollideWithOrangutan(Orangutan o){return false;}
	public void Disband(){
		pulled.Disband();
	}
	public Tile GetTile(){
		return tile;
		}
	public Panda GetPulled(){
		return pulled;
		}
	public void SetPulled(Panda p){
		pulled=p;
		}
}
