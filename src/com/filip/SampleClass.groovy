#!/usr/bin/env groovy
package com.filip

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
