package com.kenkoro.taurus.api.client.routes.order

import com.kenkoro.taurus.api.client.controllers.OrderController
import com.kenkoro.taurus.api.client.core.security.token.TokenConfig
import io.ktor.server.auth.*
import io.ktor.server.routing.*

fun Route.getOrder(
  controller: OrderController,
  config: TokenConfig
) {
  authenticate(config.authName) {
    get("/order/{orderId?}") {
      // TODO: Business logic
    }
  }
}