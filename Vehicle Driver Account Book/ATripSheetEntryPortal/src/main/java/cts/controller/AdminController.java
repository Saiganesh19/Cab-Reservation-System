package cts.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import cts.models.Booking;
import cts.models.DAOUser;
import cts.models.Driver;
import cts.models.Vehicle;
import cts.proxy.AuthenticationServiceProxy;
import cts.service.BookingService;
import cts.service.DriverService;
import cts.service.LoginService;
import cts.service.VehicleService;
import feign.FeignException;

@Controller
@SessionAttributes(names = { "Token" })
public class AdminController {

	@Autowired
	private VehicleService vehicleservice;

	@Autowired
	private DriverService driverservice;

	@Autowired
	private BookingService bookingservice;
	
	@Autowired
	private LoginService service;

	@Autowired
	private AuthenticationServiceProxy authproxy;
	
	

	@GetMapping("/adminhome")
	public String adminhome(HttpSession session,Model m) {
		
		String token = (String) session.getAttribute("token");
//	    t =token.getChars
//		System.out.println(t);
		
		if (token == null) {
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println(token + " is toekn");
			System.out.println("Return Admin Home");
			return "adminhome";
		}
	}

	@GetMapping("/vehicle")
	public String vehicle(HttpSession session, Model m) {
		String username = (String) session.getAttribute("username");
		String token = (String) session.getAttribute("token");
		System.out.println(username);
		if (token == null) {
			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println(token + " is toekn");
			System.out.println(username);
			System.out.println("Return Vehicle");
			return "vehicle";
		}
	}

	@PostMapping("/addvehicle")
	public String addVehicle(@ModelAttribute Vehicle vehicle, Model model, HttpSession session) {
		try {
			String Token = (String) session.getAttribute("Token");
			System.out.println(Token + " is toekn");

			vehicleservice.addVehicle(vehicle);
			List<Vehicle> v1 = vehicleservice.getListOfVehicles();
			model.addAttribute("vehicle", v1);
			System.out.println( "Return VehicleList");
			return "vehicleList";
		} catch (FeignException e) {

			model.addAttribute("message", "This Vehicle is Already Registered");
			System.out.println( "This Vehicle is Already Registered");
			return "errorav";
		}

	}

	@GetMapping("/vehiclelist")
	public String vehiclelist(Model model, HttpSession session, Model m) {

		String token = (String) session.getAttribute("token");
		System.out.println(token);
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {

			List<Vehicle> v1 = vehicleservice.getListOfVehicles();
			model.addAttribute("vehicle", v1);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Return Vehicle List");
			return "vehicleList";
		}
	}

	@GetMapping("/updatevehicle")
	public String updatevehicle(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println("Return Vehicle");
			return "updatevehicle";
		}
	}

	@PostMapping("/updatevehicle")
	public String updateVehicle(@ModelAttribute Vehicle vehicle, Model model) throws BindException {
		try {
			vehicleservice.updateVehicle(vehicle);

			model.addAttribute("msg", "Vehicle Details Updated Successfully");
			System.out.println("Return Update Vehicle");
			return "updatevehicle";
		} catch (FeignException e) {

			model.addAttribute("message", "This Vehicle is Not Found");
			System.out.println("This Vehicle is Not Found");
			return "errorav";
		}

	}

	@GetMapping("/deletevehicle")
	public String deletevehicle(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println("Return DeleteVehicle");
			return "deletevehicle";
		}
	}

	@PostMapping("/deletevehicle")
	public String deletevehicle(@RequestParam("registrationNo") String registrationNo, Model model)
			throws BindException {
		try {

			vehicleservice.deleteVehicle(registrationNo);
			model.addAttribute("msg", "Vehicle details got deleted");
			System.out.println("Return DeleteVehicle");
			return "deletevehicle";
		} catch (FeignException e) {

			model.addAttribute("message", "This Vehicle is Not Found");
			System.out.println("This Vehicle is Not Found");
			return "errorav";
		}

	}

	@GetMapping("/driver")
	public String driver(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println("Return Driver");
			return "driver";
		}
	}

	@PostMapping("/addDriver")
	public String addDriver(@ModelAttribute Driver driver, Model model) {
		try {
			driverservice.addDriver(driver);
			List<Driver> d1 = driverservice.getListOfDrivers();
			model.addAttribute("driver", d1);
			return "driverList";
		} catch (FeignException e) {

			model.addAttribute("message", "This License Number is Already Present");
			return "errorav";
		}

	}

	@GetMapping("/driverlist")
	public String driverlist(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {

			List<Driver> d1 = driverservice.getListOfDrivers();
			m.addAttribute("driver", d1);
			System.out.println("Return DriverList");
			return "driverList";
		}
	}

	@GetMapping("/deleteDriver")
	public String deleteDriver(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println("Return DeleteDriver");
			return "deleteDriver";
		}
		
	}

	@PostMapping("/deleteDriver")
	public String deleteDriver(@RequestParam("licenseNumber") String licenseNumber, Model model) throws BindException {
		try {
			driverservice.deleteDriver(licenseNumber);
			model.addAttribute("msg", "Driver details got deleted");
			System.out.println("Return DeleteDriver");
			return "deleteDriver";
		} catch (FeignException e) {

			model.addAttribute("message", "This License Number is Not Found");
			System.out.println("This License Number is Not Found");
			return "errorav";
		}

	}

	@GetMapping("/booking")
	public String booking(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {
			System.out.println("Return Booking");
			return "booking";
		}
		
	}

	@PostMapping("/addBooking")
	public String addBooking(@ModelAttribute Booking booking, Model model) {
		try {
			bookingservice.addBooking(booking);

			List<Booking> b1 = bookingservice.getAllBookings();
			model.addAttribute("booking", b1);
			System.out.println("Return BookingList");
			return "bookingList";
		} catch (FeignException e) {

			model.addAttribute("message", "This Booking Id is Already Present");
			System.out.println("This Booking Id is Already Present");
			return "errorav";
		}

	}

	@GetMapping("/bookinglist")
	public String bookinglist(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {

			List<Booking> b1 = bookingservice.getAllBookings();
			m.addAttribute("booking", b1);
			System.out.println("Return BookingList");
			return "bookingList";
		}
	}

	@GetMapping("/updatebooking")
	public String updatebooking(HttpSession session,Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {

			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		} else {

			List<Booking> b1 = bookingservice.getAllBookings();
			m.addAttribute("booking", b1);
			System.out.println("Return Update Booking");
			return "updatebooking";
		}
	}

	@PostMapping("/updatebooking")
	public String updatebooking(@ModelAttribute Booking booking, Model model) throws BindException {
		try {
			bookingservice.updatebooking(booking);
			model.addAttribute("msg", "Booking details updated successfully");
			System.out.println("Return Update Booking");
			return "updatebooking";
		} catch (FeignException e) {

			model.addAttribute("message", "This Booking Id is Not Found");
			System.out.println("This Booking Id is Not Found");
			return "errorav";
		}
	}
	
	

	@PostMapping("/vbydate")
	public String vbydate(@RequestParam("startdatetime") String startdatetime, Model model, HttpSession session) {
		    session.setAttribute("start", startdatetime);
		try {
			List<Vehicle> v = vehicleservice.vbydate(startdatetime);
			model.addAttribute("vehicle", v);
			System.out.println("Return Vehicles By Date");
			return "redirect:/vbydate";
		} catch (FeignException e) {

			model.addAttribute("message", "NO Vehicle is Present on the Date " + startdatetime);
			System.out.println("NO Vehicle is Present on the Date " + startdatetime);
			return "errorav";
		}
	}
	
	@GetMapping("/vbydate")
	public String vvbydate(HttpSession session,Model model) {
		String token = (String) session.getAttribute("token");
		if (token == null) {
			model.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		}else {	
		String start = (String) session.getAttribute("start");
		List<Vehicle> v = vehicleservice.vbydate(start);
		model.addAttribute("vehicle", v);
		System.out.println("");
		return "vbydate";
		}
	}

	@PostMapping("/dbytype")
	public String dbytype(@RequestParam("vehicleType") String vehicleType, Model model, HttpSession session) {
		session.setAttribute("type", vehicleType);
		try {
			List<Driver> d = driverservice.dbytype(vehicleType);
			model.addAttribute("driver", d);
			System.out.println("Return Driver by Type");
			return "redirect:/dbytype";
		} catch (FeignException e) {

			model.addAttribute("message", "NO Driver is Found for the Vehicle Type " + vehicleType);
			System.out.println( "NO Driver is Found for the Vehicle Type " + vehicleType);
			return "errorav";
		}
	}
	
	@GetMapping("/dbytype")
	public String ddbytype(HttpSession session,Model model) {
		String token = (String) session.getAttribute("token");
		if (token == null) {
			model.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");
			return "l&s";
		}else {
			String type = (String) session.getAttribute("type");
			List<Driver> d = driverservice.dbytype(type);
			model.addAttribute("driver", d);
			System.out.println("Return Driver by Type");
			return "dbytype";
			
		}
		
	}

//	@GetMapping("/myaccount")
//	public String myaccount(Model model) {
//		List<User> u = loginservice.getAdmindetails();
//		model.addAttribute("user", u);
//		return "myaccount";
//	}
	@GetMapping("/so")
	public String signout(HttpSession session) {

		// String username = (String) session.getAttribute("username");

		// authproxy.username(username);
		// Object authToken= session.getAttribute("token");
		session.removeAttribute("token");
		session.removeAttribute("mobile");
		session.removeAttribute("email");
		session.removeAttribute("username");
		session.removeAttribute("start");
		session.removeAttribute("type");
		System.out.println("Return Sign Out");
		return "l&s";
	}
	
	@GetMapping("/my")
    public String my(HttpSession session,Model m) {
        String token = (String) session.getAttribute("token");
        if (token == null) {



           System.out.println(token);
            m.addAttribute("sry", "Opps!! Login with your Credentials..");
            System.out.println("Invalid Credentials");
            return "l&s";
        } else {
            String username= (String) session.getAttribute("username");
            DAOUser user=service.getUser(username);
            String email=user.getEmail();
            String mobile=user.getMobile();
            m.addAttribute("username", username);
            m.addAttribute("email", email);
            m.addAttribute("mobile", mobile);
            System.out.println("Return My Account");
            return "my";
        }
    }

}
