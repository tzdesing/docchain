package com.pytuna.contracts;

import net.corda.core.identity.CordaX500Name;
import net.corda.testing.core.TestIdentity;
import net.corda.testing.node.MockServices;
import org.junit.Test;

import java.util.Arrays;

import static net.corda.testing.node.NodeTestUtils.ledger;


public class ContractTests {
    private final MockServices ledgerServices = new MockServices(Arrays.asList("com.template"));
    TestIdentity alice = new TestIdentity(new CordaX500Name("Alice",  "TestLand",  "US"));
    TestIdentity bob = new TestIdentity(new CordaX500Name("Alice",  "TestLand",  "US"));

    @Test
    public void issuerAndRecipientCannotHaveSameEmail() {
//        TemplateState state = new TemplateState("Hello-World",alice.getParty(),bob.getParty());
//        ledger(ledgerServices, l -> {
//            l.transaction(tx -> {
//                tx.input(RegisterContract.ID, state);
//                tx.output(RegisterContract.ID, state);
//                tx.command(alice.getPublicKey(), new RegisterContract.Commands.Send());
//                return tx.fails(); //fails because of having inputs
//            });
//            l.transaction(tx -> {
//                tx.output(RegisterContract.ID, state);
//                tx.command(alice.getPublicKey(), new RegisterContract.Commands.Send());
//                return tx.verifies();
//            });
//            return null;
//        });
    }
}