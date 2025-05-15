package chain_of_responsibility;

import chain_of_responsibility.contracts.HelpDeskChain;
import chain_of_responsibility.models.Cto;
import chain_of_responsibility.models.JuniorSupport;
import chain_of_responsibility.models.MiddleSupport;
import chain_of_responsibility.models.SeniorSupport;

public class Application {
    public static void main(String[] args) {
        HelpDeskChain junior = new JuniorSupport();
        HelpDeskChain mid = new MiddleSupport();
        HelpDeskChain seniorSupport = new SeniorSupport();
        HelpDeskChain cto = new Cto();

        junior.setNextDesk(mid);
        mid.setNextDesk(seniorSupport);
        seniorSupport.setNextDesk(cto);

        String request = "Server Down";

        junior.acceptRequest(request);
    }
}
