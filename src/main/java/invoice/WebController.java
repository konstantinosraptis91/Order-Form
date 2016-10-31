/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import invoice.dto.Form;
import invoice.dto.FormObj;
import invoice.utils.Constants;
import invoice.utils.FormUtils;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author konstantinos
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(FormObj invoiceForm) {
        return "form";
    }

    @PostMapping("/")
    public String checkInvoiceInfo(@Valid FormObj formObj, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.err.println("Form has errors");
            return "form";
        } else {
            try {
                // DOM MODEL SOLUTION
                // XMLDocBuilder.create(invoice.utils.Constants.STORAGE_PATH, invoiceForm);
                
                // JAXB SOLUTION
                File f = new File(invoice.utils.Constants.STORAGE_PATH);
                JAXBContext jaxbContext = JAXBContext.newInstance(Form.class);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(FormUtils.parseForm(formObj), f);
                
//            } catch (FileNotFoundException e) {
//                Logger.getLogger(WebController.class.getName()).log(Level.SEVERE, null, e);
            } catch (JAXBException e) {
		Logger.getLogger(WebController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return "redirect:/results";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        Constants.DATE_FORMAT.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(Constants.DATE_FORMAT, true));
    }

}
