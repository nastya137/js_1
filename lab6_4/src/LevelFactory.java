class LevelFactory {
    public Level createLevel(String difficulty){
        if(difficulty.equals("easy")){
            return new EasyLevel();
        }
        else if (difficulty.equals("hard")){
            return new HardLevel();
        }
        return null;
    }
}
