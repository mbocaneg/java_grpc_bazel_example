java_binary(
    name = "main",
    srcs = ["Main.java"],
    main_class = "src.com.test.java.Main",
    deps = [
        "//src/proto:tranceiver_java_grpc",
        "//src/proto:transmission_object_java_proto",
    ],
)

java_binary(
    name = "server",
    srcs = ["TransceiverServer.java"],
    main_class = "src.com.test.java.TransceiverServer",
    deps = [
        "//src/proto:tranceiver_java_grpc",
        "//src/proto:transmission_object_java_proto",
    ],
)
