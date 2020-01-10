package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

	//-----------------------------------------------------------------------
	@Given("Son message est {string}")
	public void messageUser(String string) {
		string = "J'ai écris mon premier message.";
		if (string != ""){
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Il a écrit : "+string+" !!");
		}

	}
	@When("Je lui demande d'écrire un message")
	public void demandeEcriture() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Yet Friday");
	}

	@Then("Il a frappé sur son clavier et a écris un message vide {string}")
	public void messageAAfficher(String string) {
		string = "C'est Trop Bien !!";
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Message de l'utilisateur : "+string);
	}
	//-----------------------------------------------------------------------
}
