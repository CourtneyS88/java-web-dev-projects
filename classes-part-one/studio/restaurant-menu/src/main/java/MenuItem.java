public class MenuItem {
    private Double price;

    private String description;

    private Category category;

    private Boolean isNewItem;

    public MenuItem(Double price, String description, Category category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = false;
    }


}
