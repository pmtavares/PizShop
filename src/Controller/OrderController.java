package Controller;

import DAO.OrderDAO;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class OrderController {
    
    OrderDAO orderDAO;
    
    public OrderController() {
        orderDAO = new OrderDAO();
    }
    
    public void searchItems(String search, List<String> list){
        orderDAO.searchItems(search, list);
    }
}
