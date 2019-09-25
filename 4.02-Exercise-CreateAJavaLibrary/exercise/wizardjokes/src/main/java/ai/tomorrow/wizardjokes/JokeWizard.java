package ai.tomorrow.wizardjokes;

import ai.tomorrow.manualjokes.JokeSmith;

public class JokeWizard {
    public String tellAWizardJoke(){
        JokeSmith myJokeSmith = new JokeSmith();
        return "A Wizard says " + myJokeSmith.tellAHandCraftedJoke();
    }
}