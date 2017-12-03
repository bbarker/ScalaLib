package org.terasology

import org.terasology.entitySystem.systems.{BaseComponentSystem, RegisterSystem}
import org.terasology.logic.console.commandSystem.annotations.Command

@RegisterSystem
class ScalaCommands extends BaseComponentSystem {

  private val helloList: List[String] = List(
    "Hello there,",
    "this is using Scala collections =)"
  )

  @Command(shortDescription = "Scala test command", runOnServer = false)
  def helloScala() = helloList.mkString(" ")
}
