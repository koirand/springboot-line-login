package com.example;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SampleController {

  @GetMapping("/")
  public Object index(@AuthenticationPrincipal OAuth2User oauth2User) {
      return oauth2User;
  }
}