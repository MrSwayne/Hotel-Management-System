package hbs.managers;

import hbs.models.GuestModel;
import hbs.models.PaymentModel;
import hbs.views.PaymentView;

/*
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;*/

public class PaymentManager {
	
	private static final String API_KEY = "sk_test_I4018YUPlMB3aA4fRCnSDUag";
	
	public PaymentManager() {
	}
	
	public void processPayment(String firstName, String secondName, String cNumber) {		
		//Stripe.apiKey = API_KEY;
		
		//GuestModel guest = new GuestModel();
		//guest.setFirstName(firstName);
		
		////guest.setSecondName(secondName);
		//guest.getCredentials
	}
}

