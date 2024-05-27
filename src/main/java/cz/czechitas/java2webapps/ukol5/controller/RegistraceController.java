package cz.czechitas.java2webapps.ukol5.controller;

import cz.czechitas.java2webapps.ukol5.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class RegistraceController {
  private final RegistrationService registrationService;

  @Autowired
  public RegistraceController(RegistrationService registrationService) {
    this.registrationService = registrationService;
  }

  @GetMapping("/")
  public ModelAndView formular() {
    ModelAndView modelAndView = new ModelAndView("formular");
    modelAndView.addObject("form", new RegistrationForm());
    return modelAndView;
  }

  @GetMapping("/summary")
  public ModelAndView summary(@RequestParam("index") int index) {
    RegistrationForm registration = registrationService.getRegistrationByIndex(index);
    ModelAndView modelAndView = new ModelAndView("summary");
    modelAndView.addObject("registration", registration);
    return modelAndView;
  }

  @PostMapping("/summary")
  public ModelAndView form(@Valid @ModelAttribute("form") RegistrationForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return new ModelAndView("formular");
    }
    registrationService.addRegistration(form);
    int index = registrationService.getAllRegistrations().size() - 1;
    return new ModelAndView("redirect:/summary?index=" + index);
  }

}
