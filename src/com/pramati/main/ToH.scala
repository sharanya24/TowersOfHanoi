package com.pramati.main

class TowerOfhanoi {

  def moveDisks(nDisk: Int, src: String, temp: String, des: String): Unit = {

    if (nDisk == 1) {
      println("Move disk from " + src + " to " + des);
    } else {

       moveDisks(nDisk - 1, src, des, temp); //pull top n-1 disk from src to destin
      println("Move disk from " + src + " to " + des);
       moveDisks(nDisk - 1, temp, src, des); //pull n-1 disk from interim to destin
      

    }

  }
  
}
