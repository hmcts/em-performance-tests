package simulations.uk.gov.hmcts.reform.docgen.util

object Environment {
  val httpConfig = scala.util.Properties.envOrElse("httpConfig", "http")

  val users = scala.util.Properties.envOrElse("numberOfUser", "10")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "500")
  val idamCookieName="SESSION_ID"

  //  val commonHeader = Map(
  //		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
  //		"Accept-Encoding" -> "gzip, deflate, br",
  //		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
  //		"Connection" -> "keep-alive",
  //		"Upgrade-Insecure-Requests" -> "1",
  //		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

  val DOCMOSIS = "https://docmosis-development.platform.hmcts.net/"
  val SPROD_URL = "https://jui-webapp-aat.service.core-compute-aat.internal"
  val IDAM_WEB_URL = "https://idam.preprod.ccidam.reform.hmcts.net"

  val minThinkTime = 12
  val maxThinkTime = 15
  val waitForNextIteration = 80
  val constantthinkTime = 4
}
