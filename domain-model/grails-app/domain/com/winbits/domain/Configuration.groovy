package com.winbits.domain

class Configuration {

  String code
  String value
  String description

  static constraints = {
    code unique: true
    description nullable: true
  }

  static mapping = {
    cache true
  }

}
