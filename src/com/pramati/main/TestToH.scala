package com.pramati.main

object TestToH {
  var nDisks: Int = _
  def main(a: Array[String]) {
    val obj = new TowerOfhanoi();
    if (validateInput) {
      obj.moveDisks(nDisks.asInstanceOf[Int], "Rod A", "Rod B", "Rod C");
    }
  }
  def validateInput: Boolean = {
    print("Enter the number of disks to move:\t");
    val sc = new java.util.Scanner(System.in)
    if (!sc.hasNextInt()) {
      println("Enter only numbers greater than 0: \t");
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
