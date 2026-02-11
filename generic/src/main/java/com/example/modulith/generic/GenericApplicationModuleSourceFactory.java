package com.example.modulith.generic;

import java.util.List;
import org.springframework.modulith.core.ApplicationModuleSourceFactory;

public class GenericApplicationModuleSourceFactory implements ApplicationModuleSourceFactory {

  @Override
  public List<String> getRootPackages() {
    return List.of("com.example.modulith.generic");
  }

}
