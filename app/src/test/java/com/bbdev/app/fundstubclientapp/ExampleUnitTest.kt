package com.bbdev.app.fundstubclientapp

import android.util.JsonReader
import android.util.Log
import com.bbdev.app.fundstubclientapp.util.AppConstants.api_key
import com.beust.klaxon.*
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.anyArray
import com.nhaarman.mockito_kotlin.stub
import com.squareup.okhttp.Callback
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.ticketmaster.api.discovery.DiscoveryApi
import com.ticketmaster.api.discovery.operation.ByIdOperation
import com.ticketmaster.api.discovery.operation.SearchEventsOperation
import com.ticketmaster.api.discovery.response.PagedResponse
import com.ticketmaster.api.discovery.response.Response
import com.ticketmaster.discovery.model.Event
import com.ticketmaster.discovery.model.Events
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_beta_login.view.*
import org.jetbrains.anko.doAsync
import org.json.JSONArray
import org.json.JSONStringer
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.junit.MockitoJUnitRunner
import java.io.IOException
import java.io.InputStream
import java.io.StringReader
import java.lang.reflect.Array.get
import java.util.regex.Pattern
import java.util.stream.Stream
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class TestPresenter {


    @Test
    fun apiDiscovery() {
        val url = "https://webhooks.mongodb-stitch.com/api/client/v2.0/app/todo-qnreu/service/getEvents/incoming_webhook/eventsWebhook"

        val request = Request.Builder().url(url).build()

        val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(response: com.squareup.okhttp.Response?) {

                val res = response?.body()
                print( response?.message())
            }
            override fun onFailure(request: Request?, e: IOException?) {
                println(e?.message)
            }
        })


    }
}