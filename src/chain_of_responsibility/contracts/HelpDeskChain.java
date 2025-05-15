package chain_of_responsibility.contracts;

public interface HelpDeskChain {

    void setNextDesk(HelpDeskChain nextDesk);

    void acceptRequest(String request);
}
