package com.kenkoro.taurus.api.client.core.security.token

data class TokenConfig(
  val audience: String,
  val domain: String,
  val expiresIn: Long,
  val secret: String,
  val realm: String = "Default",
  val authName: String = "jwt.auth",
)
