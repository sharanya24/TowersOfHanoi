package com.pramati.main

class TowerOfhanoi {

  def moveDisks(nDisk: Int, src: String, temp: String, des: String): String = {

    if (nDisk == 1) {

      return "Move disk from " + src + " to " + des + "\n";
    } else {

      var res0: String = moveDisks(nDisk - 1, src, des, temp); //pull top n-1 disk from src to destin
      var str: String = ("Move Disk from " + src + " to " + des + "\n").toString;
      var res1: String = moveDisks(nDisk - 1, temp, src, des); //pull n-1 disk from interim to destin
      return (res0 + str + res1)toString;

    }

  }
  
}
