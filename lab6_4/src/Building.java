class Building implements IType {
    private String type;

    public Building(int i) {
        if (i==1) {
            this.type = "type 1";
        } else if (i==2) {
            this.type = "type 2";
        } else{
            this.type = "default type";
        }
    }

    public String knowType() {
        System.out.println(type);
        return type;
    }
}
