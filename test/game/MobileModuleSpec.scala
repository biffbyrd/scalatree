package game

import scala.util.Success

import org.specs2.mutable.Specification

import akka.actor.ActorSystem
import akka.pattern.ask
import akka.testkit.TestActorRef
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.libs.json.Json.toJsFieldJsValueWrapper

class MobileModuleSpec
    extends MobileModule
    with RoomModule
    with PlayerModule
    with Specification {

}