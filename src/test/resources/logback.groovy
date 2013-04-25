appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%level %logger - %msg%n"
  }
}


logger("org.springframework", WARN)

root(WARN, ["STDOUT"])

 