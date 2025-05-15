package chain_of_responsibility.models;

import chain_of_responsibility.contracts.HelpDeskChain;

public class Cto implements HelpDeskChain {
    private HelpDeskChain next;

    @Override
    public void setNextDesk(HelpDeskChain nextDesk) {
        if (this.next == null) {
            this.next = nextDesk;
        }
    }

    @Override
    public void acceptRequest(String request) {
        if (request.equalsIgnoreCase("Database Problem")) {
            System.out.println("All good from CTO.Database updated successfully.");
        } else if (this.next == null) {
            System.out.println("No one could handle the issue.");
        } else {
            this.next.acceptRequest(request);
        }
    }
}
