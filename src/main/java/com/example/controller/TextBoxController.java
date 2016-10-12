package com.example.controller;


import com.example.model.InText;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextBoxController  {

    public TextBoxController(){
      /*  setCommandClass(InText.class);
        setCommandName("customerForm");*/
    }

//    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,
                                    HttpServletResponse response, Object command, BindException errors)
            throws Exception {

        InText customer = (InText) command;
        return new ModelAndView("CustomerSuccess","customer",customer);

    }
}
