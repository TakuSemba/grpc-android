package com.takusemba.grpc.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.takusemba.grpc.android.protos.HelloGrpc
import com.takusemba.grpc.android.protos.Helloworld
import io.grpc.ManagedChannelBuilder


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.say_hi).setOnClickListener {
      Log.d("mydebug", "hi clicked")

      val channel = ManagedChannelBuilder.forAddress("10.0.2.2", 50051)
          .usePlaintext(true)
          .build()

      val stub = HelloGrpc.newBlockingStub(channel)

      val request = Helloworld.HelloRequest.newBuilder()
          .setName("takusemba")
          .build()

      val result = stub.sayHello(request).message

      Log.d("mydebug", "response: " + result)
    }
  }
}
