import java.util.Date;
import java.util.List;

public class Menu {
    private Date lastUpdated;

    private List<MenuItem> menuItems;

    public Menu(Date lastUpdated, List<MenuItem> menuItems){
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }
}
