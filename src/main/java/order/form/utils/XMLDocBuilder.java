package order.form.utils;

//import invoice.dto.FormObj;
//import java.io.File;
//import java.io.FileNotFoundException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.OutputKeys;
//import javax.xml.transform.TransformerException;
//import org.w3c.dom.DOMException;
//
//public class XMLDocBuilder {
//
//    // create xml doc
//    public static void create(String fileName, FormObj invoice) throws FileNotFoundException {
//        Document doc;
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        File f = null;
//        try {
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            doc = builder.newDocument();
//            /////////////////////////////////////////////////////////////////////
//            //CONFIGURE XML FILE
//
//            // root element - INVOICE
//            Element rootElement = doc.createElement("FORM");
//            doc.appendChild(rootElement);
//
//            //******************************************************************
//            // CUSTOMER element and its sub-elements
//            Element customerElement = doc.createElement("CUSTOMER");
//            Element customerFullNameElement = doc.createElement("FULL_NAME");
//            Element customerAddressElement = doc.createElement("ADDRESS");
//            Element customerPhoneNumberElemenet = doc.createElement("PHONE_NUMBER");
//            Element customerEmailElement = doc.createElement("E_MAIL");
//            // Set elements text
//            customerFullNameElement.setTextContent(invoice.getCmFullName());
//            customerAddressElement.setTextContent(invoice.getCmAddress());
//            customerPhoneNumberElemenet.setTextContent(invoice.getCmPhoneNumber());
//            customerEmailElement.setTextContent(invoice.getCmEmail());
//            // Append to CUSTOMER element
//            customerElement.appendChild(customerFullNameElement);
//            customerElement.appendChild(customerAddressElement);
//            customerElement.appendChild(customerPhoneNumberElemenet);
//            customerElement.appendChild(customerEmailElement);
//            //******************************************************************
//            // ORDER element and its sub-elements
//            Element orderElement = doc.createElement("ORDER");
//            Element orderProductElement = doc.createElement("PRODUCT");
//            Element orderQuantityElement = doc.createElement("QUANTITY");
//            Element orderUnicCostElement = doc.createElement("UNIT_COST");
//            Element orderShippingDateElement = doc.createElement("SHIPPING_DATE");
//            // Set elements text
//            orderProductElement.setTextContent(invoice.getOrProductName());
//            orderQuantityElement.setTextContent(invoice.getOrQuantity().toString());
//            orderUnicCostElement.setTextContent(String.valueOf(invoice.getOrUnitCost()));
//            orderShippingDateElement.setTextContent(invoice.getOrShpippingDate().toString());
//            // Append to ORDER element
//            orderElement.appendChild(orderProductElement);
//            orderElement.appendChild(orderQuantityElement);
//            orderElement.appendChild(orderUnicCostElement);
//            orderElement.appendChild(orderShippingDateElement);
//            //*******************************************************************
//            // SUPPLIER element and its sub-elements
//            Element supplierElement = doc.createElement("SUPPLIER");
//            Element supplierFullNameElement = doc.createElement("FULL_NAME");
//            Element supplierAddressElement = doc.createElement("ADDRESS");
//            Element supplierPhoneNumberElemenet = doc.createElement("PHONE_NUMBER");
//            Element supplierEmailElement = doc.createElement("E_MAIL");
//            // Set elements text
//            supplierFullNameElement.setTextContent(invoice.getSupFullName());
//            supplierAddressElement.setTextContent(invoice.getSupAddress());
//            supplierPhoneNumberElemenet.setTextContent(invoice.getSupPhoneNumber());
//            supplierEmailElement.setTextContent(invoice.getSupEmail());
//            // Append to SUPPLIER element
//            supplierElement.appendChild(supplierFullNameElement);
//            supplierElement.appendChild(supplierAddressElement);
//            supplierElement.appendChild(supplierPhoneNumberElemenet);
//            supplierElement.appendChild(supplierEmailElement);
//            //*********************************************************************
//            // TRANSPORTER element and its sub-elements
//            Element transporterElement = doc.createElement("TRANSPORTER");
//            Element transporterNameElement = doc.createElement("NAME");
//            Element transporterAddressElement = doc.createElement("ADDRESS");
//            Element transporterPhoneNumberElemenet = doc.createElement("PHONE_NUMBER");
//            Element transporterEmailElement = doc.createElement("E_MAIL");
//            // Set elements text
//            transporterNameElement.setTextContent(invoice.getTcName());
//            transporterAddressElement.setTextContent(invoice.getTcAddress());
//            transporterPhoneNumberElemenet.setTextContent(invoice.getTcPhoneNumber());
//            transporterEmailElement.setTextContent(invoice.getTcEmail());
//            // Append to TRANSPORTER element
//            transporterElement.appendChild(transporterNameElement);
//            transporterElement.appendChild(transporterAddressElement);
//            transporterElement.appendChild(transporterPhoneNumberElemenet);
//            transporterElement.appendChild(transporterEmailElement);
//            //*********************************************************************
//            // Append to root element
//            rootElement.appendChild(customerElement);
//            rootElement.appendChild(orderElement);
//            rootElement.appendChild(supplierElement);
//            rootElement.appendChild(transporterElement);
//            /////////////////////////////////////////////////////////////////////
//            // WRITE TO FILE SYSTEM
//            // Write the content into xml file
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
//            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//            DOMSource source = new DOMSource(doc);
//            f = new File(fileName);
//            StreamResult result = new StreamResult(f);
//            // StreamResult result = new StreamResult(System.out);
//            transformer.transform(source, result);
//            System.out.println("xml file created successfully!!!");
//        } catch (ParserConfigurationException e) {
//            System.err.println("Error - ParserConfigurationException" + e.getMessage());
//        } catch (DOMException e) {
//            System.err.println("Error - DOMException" + e.getMessage());
//        } catch (TransformerException e) {
//            System.err.println("Error - TransformerException" + e.getMessage());
//        }
//    }
//
//}
