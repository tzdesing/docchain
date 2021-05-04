package com.template.Schema;

import com.google.common.collect.ImmutableList;
import net.corda.core.identity.Party;
import net.corda.core.schemas.MappedSchema;
import net.corda.core.schemas.PersistentState;
import net.corda.core.serialization.CordaSerializable;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@CordaSerializable
public class RegisterSchema extends MappedSchema{

    public RegisterSchema() {
        super(RegisterSchemaV.class, 1, ImmutableList.of(PersistentRegister.class));
    }

    @Entity
    @Table(name = "registers")
    public static class PersistentRegister extends PersistentState {

        @Column(name = "linear_id") private final UUID linearId;
        @Column(name = "id") private final String id;
        @Column(name = "contract_number_movida") private final String contract_number_movida;
        @Column(name = "contract_number_partner") private final String contract_number_partner;
        @Column(name = "document_type") private final String document_type;
        @Column(name = "document_number") private final String document_number;
        @Column(name = "renter_name") private final String renter_name;
        @Column(name = "vehicle_group") private final String vehicle_group;
        @Column(name = "pickup_location") private final String pickup_location;
        @Column(name = "return_location") private final String return_location;

        @Column(name = "pickup_date") private final Date pickup_date;
        @Column(name = "return_date") private final Date return_date;

        @Column(name = "status") private final String status;

        @Column(name = "daily_value") private final double daily_value;
        @Column(name = "total_amount_contracted") private final double total_amount_contracted;
        @Column(name = "total_amount_paid") private final double total_amount_paid;
        @Column(name = "commission_contracted") private final double commission_contracted;
        @Column(name = "commission_paid") private final double commission_paid;

        @Column(name = "updated_date") private final Date updated_date;

        @ElementCollection
        private final List<String> insurance_list;
        @ElementCollection private final List<String> additional_list;
        @ElementCollection private final List<String> attachment_list;

        @Column(name = "fromUser") private final Party fromUser;
        @Column(name = "toUser") private final Party toUser;

        public PersistentRegister(UUID linearId, String id, String contract_number_movida,
                                  String contract_number_partner, String document_type,
                                  String document_number, String renter_name, String vehicle_group,
                                  String pickup_location, String return_location, Date pickup_date,
                                  Date return_date, String status, double daily_value,
                                  double total_amount_contracted, double total_amount_paid,
                                  double commission_contracted, double commission_paid, Date updated_date,
                                  List<String> insurance_list, List<String> additional_list,
                                  List<String> attachment_list,Party fromUser, Party toUser) {

            this.linearId = linearId;
            this.id = id;
            this.contract_number_movida = contract_number_movida;
            this.contract_number_partner = contract_number_partner;
            this.document_type = document_type;
            this.document_number = document_number;
            this.renter_name = renter_name;
            this.vehicle_group = vehicle_group;
            this.pickup_location = pickup_location;
            this.return_location = return_location;
            this.pickup_date = pickup_date;
            this.return_date = return_date;
            this.status = status;
            this.daily_value = daily_value;
            this.total_amount_contracted = total_amount_contracted;
            this.total_amount_paid = total_amount_paid;
            this.commission_contracted = commission_contracted;
            this.commission_paid = commission_paid;
            this.updated_date = updated_date;
            this.insurance_list = insurance_list;
            this.additional_list = additional_list;
            this.attachment_list = attachment_list;
            this.fromUser = fromUser;
            this.toUser = toUser;
        }

        public PersistentRegister() {
            this.linearId = null;
            this.id = null;
            this.contract_number_movida = null;
            this.contract_number_partner = null;
            this.document_type = null;
            this.document_number = null;
            this.renter_name = null;
            this.vehicle_group = null;
            this.pickup_location = null;
            this.return_location = null;
            this.pickup_date = null;
            this.return_date = null;
            this.status = null;
            this.daily_value = 0.0;
            this.total_amount_contracted = 0.0;
            this.total_amount_paid = 0.0;
            this.commission_contracted = 0.0;
            this.commission_paid = 0.0;
            this.updated_date = null;
            this.insurance_list = null;
            this.additional_list = null;
            this.attachment_list = null;
            this.fromUser = null;
            this.toUser = null;
        }

        public UUID getLinearId() {
            return linearId;
        }

        public String getId() {
            return id;
        }

        public String getContract_number_movida() {
            return contract_number_movida;
        }

        public String getContract_number_partner() {
            return contract_number_partner;
        }

        public String getDocument_type() {
            return document_type;
        }

        public String getDocument_number() {
            return document_number;
        }

        public String getRenter_name() {
            return renter_name;
        }

        public String getVehicle_group() {
            return vehicle_group;
        }

        public String getPickup_location() {
            return pickup_location;
        }

        public String getReturn_location() {
            return return_location;
        }

        public Date getPickup_date() {
            return pickup_date;
        }

        public Date getReturn_date() {
            return return_date;
        }

        public String getStatus() {
            return status;
        }

        public double getDaily_value() {
            return daily_value;
        }

        public double getTotal_amount_contracted() {
            return total_amount_contracted;
        }

        public double getTotal_amount_paid() {
            return total_amount_paid;
        }

        public double getCommission_contracted() {
            return commission_contracted;
        }

        public double getCommission_paid() {
            return commission_paid;
        }

        public Date getUpdated_date() {
            return updated_date;
        }

        public List<String> getInsurance_list() {
            return insurance_list;
        }

        public List<String> getAdditional_list() {
            return additional_list;
        }

        public List<String> getAttachment_list() {
            return attachment_list;
        }

        public Party getFromUser() {
            return fromUser;
        }

        public Party getToUser() {
            return toUser;
        }
    }

}
