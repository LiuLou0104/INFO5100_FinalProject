package Business;

import Business.City.City;
import Business.Employee.Employee;
import Business.Employee.Employee.SexType;
import Business.Role.RegisteredTestingPeopleRole;
import Business.UserAccount.UserAccount;



/**
 *
 * @author rrheg
 */
public class ConfigureAPlatform {
    
    public static Platform configure(){
        
        Platform platform = Platform.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        platform.getCityDirectory().createCity("New York");
        platform.getCityDirectory().createCity("Los Angeles");
        platform.getCityDirectory().createCity("Boston");
        Employee e = platform.getEmployeeDirectory().createAndAddEmployee("Liu Lou", "23", SexType.Male, "liu.lou@northeastern.edu", platform.getCityDirectory().getCityList().get(0));
        UserAccount ua = platform.getUserAccountDirectory().createAndAddUserAccount("coulson", "Lou123@", e, new RegisteredTestingPeopleRole());
//        
//        platform.addRestaurant(new Restaurant("r1"));
//        Restaurant r1 = platform.findRestaurant("r1");
//        r1.addMenu(new Menu("1*cheese hamburger, 1*cola", 10.5));
//        r1.addMenu(new Menu("1*chicken hamburger, 1*cola", 11.5));
//        
//        platform.addRestaurant(new Restaurant("r2"));
//        Restaurant r2 = platform.findRestaurant("r2");
//        r2.addMenu(new Menu("1*chips, 1*chicken wings", 9.5));
//        r2.addMenu(new Menu("1*popcorn, 1*egg tart", 8.5));
//        
//        Employee e1 = new RestaurantManager("Restaurant Manager1", r1);
//        UserAccount ua1 = r1.getOrganizationDirectory().getRestaurantManagerOrg().getUserAccountDirectory().createAndAddUserAccount("rm1", "rm1", e1, new AdminRole());
//        
//        Employee e2 = new RestaurantManager("Restaurant Manager2", r2);
//        UserAccount ua2 = r2.getOrganizationDirectory().getRestaurantManagerOrg().getUserAccountDirectory().createAndAddUserAccount("rm2", "rm2", e2, new AdminRole());
//        
//        Employee e3 = new Customer("Customer1");
//        UserAccount ua3 = platform.addCustomer("c1", "c1", e3, new CustomerRole());
//        OrderRequest orderRequest1 = platform.createAddOrderRequest(ua3, r1, r1.getMenuList().get(0), 1);
//        
//        Employee e4 = new DeliveryMan("DeliveryMan1");
//        platform.addDeliveryMan("dm1", "dm1", e4, new DeliveryManRole());
//        
//        Employee e5 = new DeliveryMan("DeliveryMan2");
//        platform.addDeliveryMan("dm2", "dm2", e5, new DeliveryManRole());
        
        return platform;
    }
    
}
