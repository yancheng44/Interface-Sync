package com.scala.dom

/**
  * Created by CNSVCSHADM on 2017/5/25.
  */
class db_manage {

}


import slick.jdbc.OracleProfile.api._
import scala.concurrent.ExecutionContext.Implicits.global



object db_manage extends App{
  val db = Database.forConfig("back")
}