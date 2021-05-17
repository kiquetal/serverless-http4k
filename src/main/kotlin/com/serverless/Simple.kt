package com.serverless


import org.http4k.core.*
import org.http4k.core.Status.Companion.OK
import org.http4k.serverless.ApiGatewayRestAwsHttpAdapter
import org.http4k.serverless.ApiGatewayRestLambdaFunction
import org.http4k.serverless.ApiGatewayV2LambdaFunction
import org.http4k.serverless.AppLoader

object SimpleHttp4kAppLoader : AppLoader {
    override fun invoke(env: Map<String, String>): HttpHandler = {


        Response(OK).body("MY RESPONSE FROM http4k!")


    }
}

class Simple : ApiGatewayRestLambdaFunction(SimpleHttp4kAppLoader)



