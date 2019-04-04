package uk.gov.hmcts.reform.docgen.scenarios
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.docgen.util.TestUtil

object getFormDefination {
  val testUtil = new TestUtil();

  println("IDAM Token-->:" + testUtil.getIdamAuth())
  println("S2S Token-->:" + testUtil.getS2sAuth())
  println("Template ID" + testUtil.getTemplateID)

  val getUserHttp= http("Form Defination Request")
    .get(s"/api/form-definitions/${testUtil.getTemplateID()}")
    .header("Authorization", testUtil.getIdamAuth())
    .header("ServiceAuthorization", testUtil.getS2sAuth())
    .header("Content-Type", "application/json")
    .check(status is 200)

  val getRequest = scenario("Load Template Defination")
    .exec(getUserHttp)

}
