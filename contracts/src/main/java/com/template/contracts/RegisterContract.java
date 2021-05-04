package com.template.contracts;

import com.template.states.Register;
import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.CommandWithParties;
import net.corda.core.contracts.Contract;
import net.corda.core.identity.AbstractParty;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Collectors;

import static net.corda.core.contracts.ContractsDSL.requireSingleCommand;
import static net.corda.core.contracts.ContractsDSL.requireThat;

public class RegisterContract implements Contract {

    public static String ID = "RegisterContract";
    public void verify(@NotNull LedgerTransaction tx) throws IllegalArgumentException {

        final CommandWithParties<Commands.Register> command = requireSingleCommand(tx.getCommands(), Commands.Register.class);
        requireThat(require -> {
            // Generic constraints around the IOU transaction.
//            require.using("No inputs should be consumed when issuing an IOU.",
//                    tx.getInputs().isEmpty());
            require.using("Only one output state should be created.",
                    tx.getOutputs().size() == 1);
            final Register out = tx.outputsOfType(Register.class).get(0);
           // require.using("The lender and the borrower cannot be the same entity.",
             //       out.getToUser() != out.getFromUser());
            require.using("All of the participants must be signers.",
                    command.getSigners().containsAll(out.getParticipants().stream().map(AbstractParty::getOwningKey).collect(Collectors.toList())));

            // IOU-specific constraints.
            require.using("O valor do total contratado deve ser maior que 10.",
                    out.getTotal_amount_contracted() > 10);
            return null;
        });

    }

    public interface Commands extends CommandData {
        class Register implements Commands {}
    //    class Transfer implements Commands {}
    }

//    public static class Register implements CommandData {
//
//    }
//    public static class Transfer implements CommandData {
//
//    }


}