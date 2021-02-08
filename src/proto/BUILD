load("@rules_proto//proto:defs.bzl", "proto_library")

###
load("@rules_proto_grpc//java:defs.bzl", "java_proto_library")

###
load("@rules_proto_grpc//java:defs.bzl", "java_grpc_library")
#load("@rules_proto_grpc//java:defs.bzl", "java_grpc_compile")

proto_library(
    name = "transmission_object_proto",
    srcs = ["transmission_object.proto"],
)

proto_library(
    name = "transceiver_proto",
    srcs = ["transceiver.proto"],
    deps = [":transmission_object_proto"],
)

java_proto_library(
    name = "transmission_object_java_proto",
    visibility = ["//visibility:public"],
    deps = [":transmission_object_proto"],
)

java_grpc_library(
    name = "tranceiver_java_grpc",
    visibility = ["//visibility:public"],
    deps = [":transceiver_proto"],
)
