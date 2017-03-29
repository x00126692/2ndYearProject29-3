package controllers;

import play.mvc.*;

import views.html.*;

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
    	public Result index() 
	{
        	return ok(index.render());
   	}

	public Result fuellevels()
	{
		return ok(index.render());
	}

	public Result orderfuel()
	{
		return ok(orderfuel.render());
	}
	
	public Result setfuelprices()
	{
		return ok(setfuelprices.render());
	}

	public Result reports()
	{
		return ok(reports.render());
	}

	public Result linegraph()
	{
		return ok(linegraph.render());
	}

	public Result bargraph()
	{
		return ok(bargraph.render());
	}

	public Result piegraph()
	{
		return ok(piegraph.render());
	}

	public Result roster()
	{
		return ok(roster.render());
	}
	public Result rewardmembers()
	{
		return ok(rewardmembers.render());
	}

	

}








































