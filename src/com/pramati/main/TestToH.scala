package com.pramati.main

object TestToH {
  var nDisks: Int = _
  def main(a: Array[String]) {
    val obj = new TowerOfhanoi();
    if (validateInput) {
      var result = obj.moveDisks(nDisks.asInstanceOf[Int], "Rod A", "Rod B", "Rod C");
      println("Steps to move disks from Rod A to Rod C using Rod B\n" + result);
    }
  }
  def validateInput: Boolean = {
    print("Enter the number of disks to swap:\t");
    val sc = new java.util.Scanner(System.in)
    if (!sc.hasNextInt()) {
      println("Enter only numbers: \t");
      sc.next();
    }
    nDisks = sc.nextInt();
    if (nDisks < 0) { // check whether input value is not less than zero
      println("Invalid input. Cannot move disks");
      return false;
    } else {
      return true;
    }

  }
}