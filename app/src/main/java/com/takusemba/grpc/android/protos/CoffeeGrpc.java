package com.takusemba.grpc.android.protos;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: coffee.proto")
public final class CoffeeGrpc {

  private CoffeeGrpc() {}

  public static final String SERVICE_NAME = "Coffee.Coffee";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest,
      com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse> METHOD_ORDER =
      io.grpc.MethodDescriptor.<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest, com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Coffee.Coffee", "Order"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoffeeStub newStub(io.grpc.Channel channel) {
    return new CoffeeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoffeeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoffeeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoffeeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoffeeFutureStub(channel);
  }

  /**
   */
  public static abstract class CoffeeImplBase implements io.grpc.BindableService {

    /**
     */
    public void order(com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest request,
        io.grpc.stub.StreamObserver<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ORDER, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest,
                com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse>(
                  this, METHODID_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class CoffeeStub extends io.grpc.stub.AbstractStub<CoffeeStub> {
    private CoffeeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoffeeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CoffeeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoffeeStub(channel, callOptions);
    }

    /**
     */
    public void order(com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest request,
        io.grpc.stub.StreamObserver<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ORDER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoffeeBlockingStub extends io.grpc.stub.AbstractStub<CoffeeBlockingStub> {
    private CoffeeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoffeeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CoffeeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoffeeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse order(com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ORDER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoffeeFutureStub extends io.grpc.stub.AbstractStub<CoffeeFutureStub> {
    private CoffeeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoffeeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CoffeeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoffeeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse> order(
        com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ORDER, getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoffeeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoffeeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER:
          serviceImpl.order((com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeRequest) request,
              (io.grpc.stub.StreamObserver<com.takusemba.grpc.android.protos.CoffeeOuterClass.CoffeeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoffeeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_ORDER)
              .build();
        }
      }
    }
    return result;
  }
}
