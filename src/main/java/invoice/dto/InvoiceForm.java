/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.dto;

import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author konstantinos
 */
public class InvoiceForm {

    // Customer Information
    @NotNull
    private String cmFullName;
    @NotNull
    private String cmAddress;
    @NotNull
    private String cmPhoneNumber;
    @NotNull
    private String cmEmail;

    // Supplier Information
    @NotNull
    private String supFullName;
    @NotNull
    private String supAddress;
    @NotNull
    private String supPhoneNumber;
    @NotNull
    private String supEmail;

    // Order Information
    @NotNull
    private String orProductName;
    @NotNull
    @Min(1)
    private Integer orQuantity;
    @NotNull
    private String orUnitCost;
    @NotNull
    private Date orShpippingDate;

    // Transportation Company Information
    @NotNull
    private String tcName;
    @NotNull
    private String tcAddress;
    @NotNull
    private String tcPhoneNumber;
    @NotNull
    private String tcEmail;

    public InvoiceForm() {

    }

    public String getCmFullName() {
        return cmFullName;
    }

    public void setCmFullName(String cmFullName) {
        this.cmFullName = cmFullName;
    }

    public String getCmAddress() {
        return cmAddress;
    }

    public void setCmAddress(String cmAddress) {
        this.cmAddress = cmAddress;
    }

    public String getCmPhoneNumber() {
        return cmPhoneNumber;
    }

    public void setCmPhoneNumber(String cmPhoneNumber) {
        this.cmPhoneNumber = cmPhoneNumber;
    }

    public String getCmEmail() {
        return cmEmail;
    }

    public void setCmEmail(String cmEmail) {
        this.cmEmail = cmEmail;
    }

    public void setSupFullName(String supFullName) {
        this.supFullName = supFullName;
    }

    public String getSupFullName() {
        return supFullName;
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    public String getSupPhoneNumber() {
        return supPhoneNumber;
    }

    public void setSupPhoneNumber(String supPhoneNumber) {
        this.supPhoneNumber = supPhoneNumber;
    }

    public String getSupEmail() {
        return supEmail;
    }

    public void setSupEmail(String supEmail) {
        this.supEmail = supEmail;
    }

    public String getOrProductName() {
        return orProductName;
    }

    public void setOrProductName(String orProductName) {
        this.orProductName = orProductName;
    }

    public Integer getOrQuantity() {
        return orQuantity;
    }

    public void setOrQuantity(Integer orQuantity) {
        this.orQuantity = orQuantity;
    }

    public String getOrUnitCost() {
        return orUnitCost;
    }

    public void setOrUnitCost(String orUnitCost) {
        this.orUnitCost = orUnitCost;
    }

    public Date getOrShpippingDate() {
        return orShpippingDate;
    }

    public void setOrShpippingDate(Date orShpippingDate) {
        this.orShpippingDate = orShpippingDate;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    public String getTcAddress() {
        return tcAddress;
    }

    public void setTcAddress(String tcAddress) {
        this.tcAddress = tcAddress;
    }

    public String getTcPhoneNumber() {
        return tcPhoneNumber;
    }

    public void setTcPhoneNumber(String tcPhoneNumber) {
        this.tcPhoneNumber = tcPhoneNumber;
    }

    public String getTcEmail() {
        return tcEmail;
    }

    public void setTcEmail(String tcEmail) {
        this.tcEmail = tcEmail;
    }

    @Override
    public String toString() {
        return "InvoiceForm{" + "cmFullName=" + cmFullName + ", cmAddress=" + cmAddress + ", cmPhoneNumber=" + cmPhoneNumber + ", cmEmail=" + cmEmail + ", supFirstName=" + supFullName + ", supAddress=" + supAddress + ", supPhoneNumber=" + supPhoneNumber + ", supEmail=" + supEmail + ", orProductName=" + orProductName + ", orQuantity=" + orQuantity + ", orUnitCost=" + orUnitCost + ", orShpippingDate=" + orShpippingDate + ", tcName=" + tcName + ", tcAddress=" + tcAddress + ", tcPhoneNumber=" + tcPhoneNumber + ", tcEmail=" + tcEmail + '}';
    }

}
