Feature: Le message s affiche t il bien
  On analyse si le message a bien été afficher sur l'écran

  Scenario Outline: Un utilisateur veut afficher un message a l ecran
    Given Son message est "<message>" 
    When Je lui demande d ecrire un message
    Then Il a frappe sur son clavier et a ecris un message vide "<messageAff>"
    
  Examples:
    | message           | messageAff 		|
    | Bonjour         	| Bonjour   		|
    |          			| Rien a afficher   |
    | anything else! 	| anything else!  	|