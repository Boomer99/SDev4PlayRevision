package controllers;

import play.mvc.*;

import views.html.*; //Import all views

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
// import play.api.inject.Injector;
import models.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */



    public Result index(){
        return ok(index.render());
    }


    /*Method to return the onSale page once GET request for this page is received*/
    /*As added during CRUD Lab 1 - step 7, we are telling this controller method to return
    the list of products from the ItemOnSale page using the findAll() method declared in the model*/
    /*As added at step 9 in same lab, we're returning a list of categories too*/
    public Result onsale(){
        List <ItemOnSale> itemList = ItemOnSale.findAll();
        List<Category> categoryList = Category.findAll();

        if (cat == 0){
            itemList = ItemOnSale.findAll();
        } else {
            itemList = Category.find.ref(cat).getItems();
        }

        return ok(onsale.render(itemList, categoryList));
    }

    /*Method to return the About page*/
    public Result about(){
        return ok(about.render());
    }


}
