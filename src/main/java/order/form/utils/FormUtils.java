package order.form.utils;

import order.form.dto.FormObj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import order.form.dto.Form;
import order.form.dto.Form.Customer;
import order.form.dto.Form.Order;
import order.form.dto.Form.Supplier;
import order.form.dto.Form.Transporter;
import order.form.dto.ObjectFactory;

/**
 *
 * @author konstantinos
 */
public class FormUtils {
    
    public static Form parseForm(FormObj formObj) {
        ObjectFactory objectFactory = new ObjectFactory();
                               
        // Set customer
        Customer customer = objectFactory.createFormCustomer();
        customer.setFullName(formObj.getCmFullName());
        customer.setAddress(formObj.getCmAddress());
        customer.setPhoneNumber(formObj.getCmPhoneNumber());
        customer.setEmail(formObj.getCmEmail());
        
        // Set order
        Order order = objectFactory.createFormOrder();
        try {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(formObj.getOrShpippingDate());
            XMLGregorianCalendar xmlgc;
            xmlgc = DatatypeFactory
                            .newInstance()
                            .newXMLGregorianCalendar(gc);
            order.setShippingDate(xmlgc);
        } catch (DatatypeConfigurationException e) {
            System.err.println("DatatypeConfigurationException: " + e.getMessage());
        }
        order.setProduct(formObj.getOrProductName());
        order.setQuantity(new BigInteger(String.valueOf(formObj.getOrQuantity())));
        order.setUnitCost(new BigDecimal(formObj.getOrUnitCost()));
        
        // Set supplier
        Supplier supplier = objectFactory.createFormSupplier();
        supplier.setFullName(formObj.getSupFullName());
        supplier.setAddress(formObj.getSupAddress());
        supplier.setPhoneNumber(formObj.getSupPhoneNumber());
        supplier.setEmail(formObj.getSupEmail());
        
        // Set transporter
        Transporter transporter = objectFactory.createFormTransporter();
        transporter.setName(formObj.getTcName());
        transporter.setAddress(formObj.getTcAddress());
        transporter.setPhoneNumber(formObj.getTcPhoneNumber());
        transporter.setEmail(formObj.getTcEmail());
        
        // Set form
        Form form = objectFactory.createForm();
        form.setCustomer(customer);
        form.setOrder(order);
        form.setSupplier(supplier);
        form.setTransporter(transporter);
        return form;
    }
    
}
