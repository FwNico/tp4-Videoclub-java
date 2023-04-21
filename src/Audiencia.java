public enum Audiencia {
    G("G"),PG("PG"), PG13("PG-13"), R("R"), NC17("NC-17"),UNRATED("UNRATED");
    private String name;

    private Audiencia(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
