package com.takusemba.grpc.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.takusemba.grpc.android.protos.CoffeeGrpc
import com.takusemba.grpc.android.protos.CoffeeOuterClass
import io.grpc.ManagedChannelBuilder
import rx.Single
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.say_hi).setOnClickListener {

      val channel = ManagedChannelBuilder.forAddress("10.0.2.2", 8080)
          .usePlaintext(true)
          .build()

      val stub = CoffeeGrpc.newBlockingStub(channel)

      val request = CoffeeOuterClass.CoffeeRequest.newBuilder()
          .setName("hot coffee")
          .build()

      Single
          .create<CoffeeOuterClass.CoffeeResponse> {
            it.onSuccess(stub.order(request))
          }.subscribeOn(Schedulers.io())
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(
              {
                findViewById<TextView>(R.id.message).text = (
                    it.message + "\n\n"
                        + findViewById<TextView>(R.id.message).text
                    )
              },
              { /**  error handling */ }
          )
    }
  }
}
