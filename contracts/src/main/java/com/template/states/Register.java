package com.template.states;

import com.google.common.collect.ImmutableList;
import com.template.Schema.RegisterSchema;
import com.template.contracts.RegisterContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.LinearState;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import net.corda.core.schemas.MappedSchema;
import net.corda.core.schemas.PersistentState;
import net.corda.core.schemas.QueryableState;
import net.corda.core.serialization.CordaSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.List;


@BelongsToContract(RegisterContract.class)

@CordaSerializable
public class Register implements LinearState, QueryableState {

    private UniqueIdentifier registerId = null;
    private String id;
    private String contract_number_movida;
    private String contract_number_partner;

    private String document_type;
    private String document_number;
    private String renter_name;
    private String vehicle_group;//TODO Enum 'B','BS','AX','C','D','F','FX','G','H','HX','HY'
    private String pickup_location;//retirada
    private String return_location;//devolucao
    private Date pickup_date;
    private Date return_date;
    private String status;//'AGUARDANDO RETIRADA','RETIRADA EFETUADA','ENTREGA_EFETUADA'

    private double daily_value;
    private double total_amount_contracted;
    private double total_amount_paid;

    private double commission_contracted;
    private double commission_paid;

    private Date updated_date;

    private List<String> insurance_list;
    private List<String> additional_list;
    private List<String> attachment_list;

    private Party fromUser;
    private Party toUser;

    public Register() {

    }

    public Register(UniqueIdentifier registerId, String id, String contract_number_movida,
                    String contract_number_partner, String document_type,
                    String document_number, String renter_name, String vehicle_group,
                    String pickup_location, String return_location, Date pickup_date,
                    Date return_date, String status, double daily_value,
                    double total_amount_contracted, double total_amount_paid,
                    double commission_contracted, double commission_paid,
                    Date updated_date,
                    List<String> insurance_list, List<String> additional_list,
                    List<String> attachment_list, Party fromUser, Party toUser) {
        this.registerId = registerId;
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


    public UniqueIdentifier getRegisterId() {
        return registerId;
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

    public Date getUpdated_date() { return updated_date;}

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

    public void setContract_number_movida(String contract_number_movida) {
        this.contract_number_movida = contract_number_movida;
    }

    public void setContract_number_partner(String contract_number_partner) {
        this.contract_number_partner = contract_number_partner;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public void setRenter_name(String renter_name) {
        this.renter_name = renter_name;
    }

    public void setVehicle_group(String vehicle_group) {
        this.vehicle_group = vehicle_group;
    }

    public void setPickup_location(String pickup_location) {
        this.pickup_location = pickup_location;
    }

    public void setReturn_location(String return_location) {
        this.return_location = return_location;
    }

    public void setPickup_date(Date pickup_date) {
        this.pickup_date = pickup_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDaily_value(double daily_value) {
        this.daily_value = daily_value;
    }

    public void setTotal_amount_contracted(double total_amount_contracted) {
        this.total_amount_contracted = total_amount_contracted;
    }

    public void setTotal_amount_paid(double total_amount_paid) {
        this.total_amount_paid = total_amount_paid;
    }

    public void setCommission_contracted(double commission_contracted) {
        this.commission_contracted = commission_contracted;
    }

    public void setCommission_paid(double commission_paid) {
        this.commission_paid = commission_paid;
    }

    public void setUpdated_date(Date updated_date){ this.updated_date = updated_date;}

    public void setInsurance_list(List<String> insurance_list) {
        this.insurance_list = insurance_list;
    }

    public void setAdditional_list(List<String> additional_list) {
        this.additional_list = additional_list;
    }

    public void setAttachment_list(List<String> attachment_list) {
        this.attachment_list = attachment_list;
    }

    public void setFromUser(Party fromUser) {
        this.fromUser = fromUser;
    }

    public void setToUser(Party toUser) {
        this.toUser = toUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Override
    public UniqueIdentifier getLinearId() { return registerId; }

    @Override
    public String toString() {
        return "Register{" +
                "registerId=" + registerId +
                ", id='" + id + '\'' +
                ", contract_number_movida='" + contract_number_movida + '\'' +
                ", contract_number_partner='" + contract_number_partner + '\'' +
                ", document_type='" + document_type + '\'' +
                ", document_number='" + document_number + '\'' +
                ", renter_name='" + renter_name + '\'' +
                ", vehicle_group='" + vehicle_group + '\'' +
                ", pickup_location='" + pickup_location + '\'' +
                ", return_location='" + return_location + '\'' +
                ", pickup_date=" + pickup_date +
                ", return_date=" + return_date +
                ", status='" + status + '\'' +
                ", daily_value=" + daily_value +
                ", total_amount_contracted=" + total_amount_contracted +
                ", total_amount_paid=" + total_amount_paid +
                ", commission_contracted=" + commission_contracted +
                ", commission_paid=" + commission_paid +
                ", updated_date=" + updated_date +
                ", insurance_list=" + insurance_list +
                ", additional_list=" + additional_list +
                ", attachment_list=" + attachment_list +
                ", fromUser=" + fromUser +
                ", toUser=" + toUser +
                '}';
    }

    //this.linearId = null;
//            this.id = null;
//            this.contract_number_movida = null;
//            this.contract_number_partner = null;
//            this.document_type = null;
//            this.document_number = null;
//            this.renter_name = null;
//            this.vehicle_group = null;
//            this.pickup_location = null;
//            this.return_location = null;
//            this.pickup_date = null;
//            this.return_date = null;
//            this.status = null;
//            this.daily_value = 0.0;
//            this.total_amount_contracted = 0.0;
//            this.total_amount_paid = 0.0;
//            this.commission_contracted = 0.0;
//            this.commission_paid = 0.0;
//            this.insurance_list = null;
//            this.additional_list = null;
//            this.attachment_list = null;
//            this.fromUser = null;
//            this.toUser = null;
    @NotNull
    @Override
    public PersistentState generateMappedObject(MappedSchema schema) {
        if (schema instanceof RegisterSchema) {
            return new RegisterSchema.PersistentRegister(
                    this.registerId.getId(),
                    null,//id
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    null,
                    null,//
                    null,//
                    null,//
                    this.fromUser,
                    this.toUser
            );
        } else {
            throw new IllegalArgumentException("Unrecognised schema $schema");
        }
    }

    @Override
    public Iterable<MappedSchema> supportedSchemas() {
        return ImmutableList.of(new RegisterSchema());
    }

    @Override
    public List<AbstractParty> getParticipants() {
        return ImmutableList.of(fromUser, toUser);
    }

}