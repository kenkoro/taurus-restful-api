package com.kenkoro.taurus.api.client.core.plugins

import com.kenkoro.taurus.api.client.controllers.UserController
import com.kenkoro.taurus.api.client.routes.login.login
import com.kenkoro.taurus.api.client.core.security.hashing.HashingService
import com.kenkoro.taurus.api.client.core.security.hashing.SHA256HashingService
import com.kenkoro.taurus.api.client.core.security.token.JwtTokenConfigService
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureAuthRouting(userController: UserController) {
  val hashingService: HashingService = SHA256HashingService()
  val config = JwtTokenConfigService.config()

  routing {
    login(userController, hashingService, config)
  }
}